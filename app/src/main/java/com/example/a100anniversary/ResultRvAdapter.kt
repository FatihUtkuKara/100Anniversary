package com.example.a100anniversary

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class ResultRvAdapter (private val mContext: Context, private val resultList:List<Results>): RecyclerView.Adapter<ResultRvAdapter.CardViewDesignObjectHolder>(){
    inner class CardViewDesignObjectHolder(view: View): RecyclerView.ViewHolder(view) {
        var CardView: CardView
        var brand : TextView
        var colorr : TextView
        var engineSrc : TextView
        var price : TextView
        var modell : TextView
        var modelYear : TextView
        var safety : TextView
        var transmission : TextView
        var cardImage : ImageView

        init {
            CardView = view.findViewById(R.id.CardView)
            brand = view.findViewById(R.id.brand)
            colorr = view.findViewById(R.id.color)
            modelYear = view.findViewById(R.id.modelYear)
            engineSrc = view.findViewById(R.id.enginesrc)
            price = view.findViewById(R.id.price)
            modell = view.findViewById(R.id.model)
            safety = view.findViewById(R.id.safety)
            transmission = view.findViewById(R.id.transmission)

            cardImage=view.findViewById(R.id.imageView)
        }






            /*val cars = carList[position]
            holder.text.setText(cars.name)
            if (cars.name=="BMW") {
                holder.cardImage.setBackgroundResource(R.drawable.bmw)


            }
            if (cars.name=="Ferrari") {
                holder.cardImage.setBackgroundResource(R.drawable.sport)

            }
            if (cars.name.equals("Mercedes-AMG")) {
                holder.cardImage.setBackgroundResource(R.drawable.amg)

            }
            if (cars.name=="Porsche") {
                holder.cardImage.setBackgroundResource(R.drawable.porsche)

            }
            if (cars.name=="Audi") {
                holder.cardImage.setBackgroundResource(R.drawable.audi)

            }
            if (cars.name=="BMW-SUV") {
                holder.cardImage.setBackgroundResource(R.drawable.bmwsuv)
            }
            holder.CardView.setOnClickListener(View.OnClickListener {
                val intent = Intent(mContext, CarActivity::class.java)
                intent.putExtra("carname", cars.name)
                mContext.startActivity(intent)
            }) */

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
        holder.brand.setText(results.brand)
    }


}