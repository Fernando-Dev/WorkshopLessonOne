package br.fernando.workshoplessonone.model

class RepositorioPedido {

    private val pedidos = arrayOf(
        932.0,
        784.0,
        804.0,
        1222.0,
        745.0,
        983.0,
        365.0,
        1045.0,
        546.0,
        1873.0
    )

    /**
     * terceiro a classe presenter entra em contato
     * com a classe model para coletar os dados do
     * repositorio atraves da chamada do metodo
     * correspondente
     */
    fun getPedidos(): Array<Double>{
        return pedidos
    }

}