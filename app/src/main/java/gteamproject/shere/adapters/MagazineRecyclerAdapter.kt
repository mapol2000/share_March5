package gteamproject.shere.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import gteamproject.shere.R

class MagazineRecyclerAdapter (private var images: List<Int>, private var briefs: List<String>, private var publishers: List<String>) :
RecyclerView.Adapter<MagazineRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage: ImageView = itemView.findViewById(R.id.image)
        val itemBrief: TextView = itemView.findViewById(R.id.brief)
        val itemPublisher: TextView = itemView.findViewById(R.id.publisher)

        init {
            itemView.setOnClickListener { v: View ->
                val position: Int = adapterPosition
//                Toast.makeText(itemView.context,"클릭한 아이템은 ${position}", Toast.LENGTH_SHORT).show()
//                println("clicked")
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.magazine_cardview, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemImage.setImageResource(images[position])
        holder.itemBrief.text = briefs[position]
        holder.itemPublisher.text = publishers[position]
    }

    override fun getItemCount(): Int {
        return briefs.size
    }
}