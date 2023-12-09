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

class ResultRvAdapter (private val mContext: Context, private val resultList:List<Results>, private var workerInfo : String): RecyclerView.Adapter<ResultRvAdapter.CardViewDesignObjectHolder>(){
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
        //var cardImage : ImageView
        var bodyType : TextView
        var odometer : TextView

        init {
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

                holder.brand.setText(results.brand)
                holder.modelYear.setText(results.modelYear.toString())
                holder.colorr.setText(results.color)
                holder.price.setText(results.price.toString())
                holder.transmission.setText(results.transmission)
                holder.modell.setText(results.model)
                holder.engineSrc.setText(results.engineSrc)
                holder.safety.setText(results.safety.toString())
                holder.bodyType.setText(results.bodyType)
                holder.odometer.setText(results.odometer.toString())






    }


}