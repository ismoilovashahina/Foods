package uz.itschool.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import uz.itschool.myapplication.R
import uz.itschool.myapplication.data.FoodItem

class RecyclerViewAdapter(var foods:MutableList<FoodItem>) : RecyclerView.Adapter<RecyclerViewAdapter.FoodHolder>() {
    class FoodHolder(itemView: View) : ViewHolder(itemView){
        var name: TextView = itemView.findViewById(R.id.textView)
        var img: ImageView = itemView.findViewById(R.id.imageView)
        var views: TextView = itemView.findViewById(R.id.textView2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodHolder {
        var holder = FoodHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
        return holder
    }

    override fun onBindViewHolder(holder: FoodHolder, position: Int) {
        val itemsViewModel = foods[position]

        holder.img.setImageResource(itemsViewModel.img)
        holder.name.text = itemsViewModel.name
        holder.views.text = itemsViewModel.number
    }

    override fun getItemCount(): Int {
        return foods.size
    }
}