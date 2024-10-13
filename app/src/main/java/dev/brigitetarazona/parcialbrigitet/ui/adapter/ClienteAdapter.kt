package dev.brigitetarazona.parcialbrigitet.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.brigitetarazona.fragments.ui.model.ClienteModel
import dev.brigitetarazona.parcialbrigitet.R

class ClienteAdapter (private var lstCliente: List<ClienteModel>)
    :RecyclerView.Adapter<ClienteAdapter.ViewHolder>(){

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val ivCarro: ImageView = itemView.findViewById(R.id.ivCarro)
        val tvMarca:TextView = itemView.findViewById(R.id.tvMarca)
        val tvModelo:TextView = itemView.findViewById(R.id.tvModelo)
        val tvNombre:TextView = itemView.findViewById(R.id.tvNombre)
        val tvPlaca:TextView = itemView.findViewById(R.id.tvPlaca)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_cliente, parent, false))
    }

    override fun getItemCount(): Int {
        return lstCliente.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemCliente = lstCliente[position]
        holder.ivCarro.setImageResource(itemCliente.image)
        holder.tvMarca.text = itemCliente.marca
        holder.tvModelo.text = itemCliente.modelo
        holder.tvNombre.text = itemCliente.cliente
        holder.tvPlaca.text = itemCliente.placa
    }
}