package br.fernando.workshoplessonone.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import br.fernando.workshoplessonone.R

class PedidoActivity : AppCompatActivity(), PedidoContrato.View {

    private lateinit var presenter: PedidoPresenter
    private lateinit var adapter: ArrayAdapter<Double>
    private lateinit var lista: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)

        presenter = PedidoPresenter(this)

        lista = findViewById(R.id.pedidos)

        presenter.getPedidos()


    }

    override fun mostrarDados(pedidos: Array<Double>) {

        adapter = ArrayAdapter(
            this, android.R.layout.simple_list_item_1,
            android.R.id.text1, pedidos
        )

        lista.adapter = adapter

    }
}
