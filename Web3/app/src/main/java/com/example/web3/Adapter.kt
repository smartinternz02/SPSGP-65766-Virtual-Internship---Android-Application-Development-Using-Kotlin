package com.example.web3


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*

class Adapter(private var planet: List<PlanetData>) : RecyclerView.Adapter<Adapter.MyViewHolder>() {

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title = view.title!!
        var planetimg = view.planet_img!!



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.view, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var dummyImage: Int? = null
        holder.itemView.setOnClickListener {
            val intent= Intent(holder.itemView.context,PlanetDetail::class.java)
            intent.putExtra("planet",planet[position])
            intent.putExtra("planetImage",dummyImage)
            holder.itemView.context.startActivity(intent)
        }

        holder.title.text = planet[position].title



        when(planet[position].title!!.lowercase())
        {
            "blockchain"-> dummyImage= R.drawable.bc
            "crypto" -> dummyImage = R.drawable.crypto
            "edge" -> dummyImage = R.drawable.edge
            "nft" -> dummyImage = R.drawable.nft
            "cross" -> dummyImage = R.drawable.cross
            "future of web 3.0" -> dummyImage = R.drawable.future
            "web revolution" -> dummyImage = R.drawable.webrev
            "defi" -> dummyImage = R.drawable.defi
            "web 3.0 companies" -> dummyImage = R.drawable.company
            "daos" -> dummyImage = R.drawable.daos
        }

        if (dummyImage != null) {
            holder.planetimg.setImageResource(dummyImage)
        }

    }

    private fun Intent(itemView: View) {

    }

    override fun getItemCount(): Int {
        return planet.size
    }
}

