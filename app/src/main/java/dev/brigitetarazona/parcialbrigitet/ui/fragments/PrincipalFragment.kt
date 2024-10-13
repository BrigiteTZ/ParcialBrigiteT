package dev.brigitetarazona.parcialbrigitet.ui.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.annotation.ContentView
import dev.brigitetarazona.parcialbrigitet.R


class PrincipalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_principal, container, false)

        var arrNS = arrayOf(
            "Cambio de aceite","Mantenimiento correctivo","Alineamiento de dirección","Cambio de frenos","Lavado de motor"
        )

        //obtener acceso al listview lsvNS
        val lsvns: ListView = view.findViewById(R.id.lsvns)
        //crear un adaptador para llenar la lista
        val adaptador: Any?= ArrayAdapter<Any?>(view.context, android.R.layout.simple_list_item_1, arrNS)
        //var adaptador:Any?=ArrayAdapter<Any>(thi)
        //asignar el adaptador al listview
        lsvns.adapter = adaptador as ListAdapter?
        //generar el método setOnItemClickListener de la view
        lsvns.setOnItemClickListener{parent, view, position, id ->
        }

        return view
    }
}