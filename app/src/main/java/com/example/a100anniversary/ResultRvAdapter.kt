package com.example.a100anniversary

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class ResultRvAdapter (private val mContext: Context, private val resultList:List<Results>, private var workerInfo : String): RecyclerView.Adapter<ResultRvAdapter.CardViewDesignObjectHolder>(){
    inner class CardViewDesignObjectHolder(view: View): RecyclerView.ViewHolder(view) {
        var CardView: CardView
        var brand : TextView
        var carImage : ImageView
        var colorr : TextView
        var engineSrc : TextView
        var price : TextView
        var modell : TextView
        var modelYear : TextView
        var safety : TextView
        var transmission : TextView
        //var cardImage : ImageView
        var bodyType : TextView
        var odometer : TextView

        init {
            carImage = view.findViewById(R.id.carImage)
            CardView = view.findViewById(R.id.CardView)
            brand = view.findViewById(R.id.brand)
            colorr = view.findViewById(R.id.color)
            modelYear = view.findViewById(R.id.modelYear)
            engineSrc = view.findViewById(R.id.enginSrc)
            price = view.findViewById(R.id.price)
            modell = view.findViewById(R.id.model)
            safety = view.findViewById(R.id.safety)
            bodyType =view.findViewById(R.id.bodyType)
            transmission = view.findViewById(R.id.transmission)
            odometer = view.findViewById(R.id.odometer)

            //cardImage=view.findViewById(R.id.imageView)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesignObjectHolder {
        val design = LayoutInflater.from(mContext).inflate(R.layout.cardview,parent,false)
        return  CardViewDesignObjectHolder(design)
    }

    override fun getItemCount(): Int {
        return resultList.size
    }

    override fun onBindViewHolder(holder: CardViewDesignObjectHolder, position: Int) {
        val results = resultList[position]

        val modelName = results.model.toLowerCase()
        val drawableResId = mContext.resources.getIdentifier(modelName, "drawable", mContext.packageName)
        val defaultDrawableResId = R.drawable.btn_background


        if(drawableResId != 0x134 && drawableResId != 0x1f4){

            if (modelName.equals("1 Series")){
                holder.carImage.setBackgroundResource(R.drawable.a1_series)
            }
            else if (modelName.equals("3 Series")){


                holder.carImage.setBackgroundResource(R.drawable.a3_series)

            }
            else if (modelName.equals("5 Series")){

                holder.carImage.setBackgroundResource(R.drawable.a5_series)
            }
            else {
                holder.carImage.setImageResource(if (drawableResId != 0) drawableResId else defaultDrawableResId)
            }
        }
        //holder.carImage.setBackgroundResource(R.drawable.bmw)
                holder.brand.setText("Brand\n"+results.brand)
                holder.modelYear.setText("Model Year\n"+results.modelYear.toString())
                holder.colorr.setText("Color\n"+results.color)
                holder.price.setText("Price\n"+results.price.toString())
                holder.transmission.setText("Transmission\n"+results.transmission)
                holder.modell.setText("Model\n"+results.model)
                holder.engineSrc.setText("Engine Source\n"+results.engineSrc)
                holder.safety.setText("Safety\n"+results.safety.toString())
                holder.bodyType.setText("Body Type\n"+results.bodyType)
                holder.odometer.setText("Odometer\n"+results.odometer.toString())






    }


}