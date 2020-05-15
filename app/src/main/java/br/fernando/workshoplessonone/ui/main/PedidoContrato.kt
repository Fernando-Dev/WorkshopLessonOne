package br.fernando.workshoplessonone.ui.main

interface PedidoContrato {

    interface View {

        fun mostrarDados(pedidos: Array<Double>)

    }

    interface Presenter {

        fun getPedidos()

    }
}