package dev.brigitetarazona.parcialbrigitet.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.brigitetarazona.fragments.ui.model.ClienteModel
import dev.brigitetarazona.parcialbrigitet.R
import dev.brigitetarazona.parcialbrigitet.ui.adapter.ClienteAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ClienteFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ClienteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View =  inflater.inflate(R.layout.fragment_cliente, container, false)

        val rvMusica: RecyclerView = view.findViewById(R.id.rvCliente)
        rvMusica.layoutManager = LinearLayoutManager(requireContext())
        rvMusica.adapter = ClienteAdapter(ListCliente())

        return view
    }

    private fun ListCliente():List<ClienteModel>{
        var lstCliente: ArrayList<ClienteModel> = ArrayList()

        lstCliente.add(
            ClienteModel(1, R.drawable.carro1
                ,"BMW"
                , "320i"
                , "Edison Flores"
                ,"LVO-333")
        )
        lstCliente.add(
            ClienteModel(2, R.drawable.carro2
                ,"Audi"
                , "TT"
                , "Pedro Gallese"
                ,"SPI-246")
        )
        lstCliente.add(
            ClienteModel(3, R.drawable.carro3
                ,"Lexus"
                , "RC"
                , "Jorge Fossati"
                ,"URU-678")
        )

        return lstCliente
    }
}