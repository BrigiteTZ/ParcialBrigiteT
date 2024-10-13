package dev.brigitetarazona.parcialbrigitet.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import dev.brigitetarazona.parcialbrigitet.R

class CotizadorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View =  inflater.inflate(R.layout.fragment_cotizador, container, false)
        val etCosto:EditText = view.findViewById(R.id.etCosto)
        val etCantidad:EditText = view.findViewById(R.id.etCantidad)
        val spServicio:Spinner = view.findViewById(R.id.spinner)
        val btnCalcular:Button = view.findViewById(R.id.btnCalcular)
        val tvResult: TextView = view.findViewById(R.id.tvResult)

        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.servicio_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spServicio.adapter = adapter
        }

        var spnServicioValue ="Seleccione el servicio"
        val spnServicio: Spinner = view.findViewById(R.id.spinner)

        btnCalcular.setOnClickListener {

            val valCosto = etCosto.text.trim().toString()
            val valCantidad = etCantidad.text.trim().toString()
            val result:Double =  valCosto.toDouble()*valCantidad.toDouble()

            tvResult.text = "El costo es de: " + result.toString() + " USD"

            Toast.makeText(requireContext(), "¡¡Cotizado!!", Toast.LENGTH_SHORT).show()
        }
        return view
    }
}