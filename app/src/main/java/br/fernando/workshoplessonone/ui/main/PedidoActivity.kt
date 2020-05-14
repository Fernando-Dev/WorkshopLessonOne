package br.fernando.workshoplessonone.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.fernando.workshoplessonone.R

class PedidoActivity : AppCompatActivity(), PedidoContrato.View {

    private lateinit var presenter: PedidoPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)

        presenter = PedidoPresenter(this)
    }
}
