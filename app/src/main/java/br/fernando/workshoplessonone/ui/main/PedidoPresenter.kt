package br.fernando.workshoplessonone.ui.main

import br.fernando.workshoplessonone.model.RepositorioPedido

class PedidoPresenter(private val view: PedidoContrato.View) : PedidoContrato.Presenter {

    private val repositorioPedido = RepositorioPedido()

    override fun getPedidos() {
        val pedidos = repositorioPedido.getPedidos()

        view.mostrarDados(pedidos)
    }
}