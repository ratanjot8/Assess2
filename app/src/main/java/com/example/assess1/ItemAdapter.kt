package com.example.assess1

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.text_item_view.view.*

class ItemAdapter (val context: Context, val items:List<Item>):RecyclerView.Adapter<ItemAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.MyViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.text_item_view,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemAdapter.MyViewHolder, position: Int) {
        val item=items[position]
        holder.setData(item,position)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var currentItem:Item?=null
        var currentPosition:Int=0

        init{
            itemView.setOnClickListener{
                //val intent=Intent(this,Description::class.java)
                //val bundle:Bundle=intent.extras
                val toast = Toast.makeText(this, currentItem.name, 1000)
                toast.show()
            }
        }

        fun setData(item:Item?,pos:Int){
             itemView.tv.text=item!!.name
         }
    }
}