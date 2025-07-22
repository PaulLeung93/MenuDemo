package com.example.menudemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(private val menuItems: List<MenuItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        private const val TYPE_SECTION = 0
        private const val TYPE_ITEM = 1
    }

    override fun getItemViewType(position: Int): Int {
        return if (menuItems[position].isSection) TYPE_SECTION else TYPE_ITEM
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return if (viewType == TYPE_SECTION) {
            val view = inflater.inflate(R.layout.item_section_header, parent, false)
            SectionViewHolder(view)
        } else {
            val view = inflater.inflate(R.layout.item_menu, parent, false)
            MenuItemViewHolder(view)
        }
    }

    override fun getItemCount(): Int = menuItems.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = menuItems[position]
        if (holder is SectionViewHolder) {
            holder.sectionTitle.text = item.name
        } else if (holder is MenuItemViewHolder) {
            holder.dishName.text = item.name
            holder.dishDescription.text = item.description
            holder.dishPrice.text = item.price
        }
    }

    // ViewHolder for section headers (e.g., "Desserts")
    class SectionViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val sectionTitle: TextView = view.findViewById(R.id.sectionTitle)
    }

    // ViewHolder for individual dish cards
    class MenuItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val dishName: TextView = view.findViewById(R.id.dishName)
        val dishDescription: TextView = view.findViewById(R.id.dishDescription)
        val dishPrice: TextView = view.findViewById(R.id.dishPrice)
    }
}
