package com.example.contactactivity

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class contactsRVAdapter(var namesList:List<names>, var context:Context):RecyclerView.Adapter<nameViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): nameViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.names_list_item,parent,false)
        return nameViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: nameViewHolder, position: Int) {
        var currentContact=namesList.get(position)
        holder.tvname.text=currentContact.Name
        holder.tvemail.text=currentContact.Email
        holder.tvphone.text=currentContact.PhoneNumber
        Picasso.get()


            .load(currentContact.imageUrl)
            .centerCrop()
            .resize(80,80)
//            .placeholder(R.drawable.imgdetail)
            .into(holder.imgcontact)

        holder.cvcontact.setOnClickListener {
            var intent= Intent(context,ContactDetailsActivity::class.java)
            intent.putExtra("NAME",currentContact.imageUrl)
            context.startActivity(intent)

            var intent2=Intent(context,ContactDetailsActivity::class.java)
            intent2=intent2.putExtra("PhoneNumber",currentContact.PhoneNumber)
            context.startActivity(intent2)

            var intent3=Intent(context,ContactDetailsActivity::class.java)
            intent3=intent3.putExtra("Email",currentContact.Email)
            context.startActivity(intent3)

        }
//        holder.cvcontact.setOnClickListener{
//            Toast.makeText(context,"you have clicked on my face",Toast.LENGTH_LONG).show()
//
//        }


    }

    override fun getItemCount(): Int {
        return namesList.size
    }

}

class nameViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    var tvname=itemView.findViewById<TextView>(R.id.tvname)
    var tvemail=itemView.findViewById<TextView>(R.id.tvemail)
    var tvphone=itemView.findViewById<TextView>(R.id.tvphone)
    var imgcontact=itemView.findViewById<ImageView>(R.id.imgcontact)
    var cvcontact=itemView.findViewById<CardView>(R.id.cvcontact)


}
