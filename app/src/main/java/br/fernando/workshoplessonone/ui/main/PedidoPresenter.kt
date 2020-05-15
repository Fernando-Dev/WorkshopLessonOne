package br.fernando.workshoplessonone.ui.main

import br.fernando.workshoplessonone.model.RepositorioPedido

class PedidoPresenter(private val view: PedidoContrato.View) : PedidoContrato.Presenter {

    private val repositorioPedido = RepositorioPedido()

    /**
     * segundo entra em contato com a classe presenter
     * chamando o metodo correspondente
     */
    override fun getPedidos() {
        val pedidos = repositorioPedido.getPedidos()

        /**
         * quarto a classe model manda os dados para classe presenter
         */
        view.mostrarDados(pedidos)
    }
}