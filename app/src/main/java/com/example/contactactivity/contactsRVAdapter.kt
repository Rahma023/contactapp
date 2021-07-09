package com.example.contactactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class contactsRVAdapter(var namesList:List<names>):RecyclerView.Adapter<nameViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): nameViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.names_list_item,parent,false)
        return nameViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: nameViewHolder, position: Int) {
        var currentContact=namesList.get(position)
        holder.tvname.text=currentContact.Name
        holder.tvemail.text=currentContact.Email
        holder.tvphone.text=currentContact.PhoneNumber


    }

    override fun getItemCount(): Int {
        return namesList.size
    }

}

class nameViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    var tvname=itemView.findViewById<TextView>(R.id.tvname)
    var tvemail=itemView.findViewById<TextView>(R.id.tvemail)
    var tvphone=itemView.findViewById<TextView>(R.id.tvphone)


}
