data class Pedido(val numero: Int, val valor: Double)

fun main(){
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 70.0),
        Pedido(4, 90.0)
    )

    val pedidosMapeados: Map<Int,Pedido> = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados)

    //val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido -> pedido.valor > 30.0 }.filterValues { value -> value }
    val pedidosFreteGratis: List<Pedido> = pedidos.groupBy { pedido -> pedido.valor > 50.0 }.filterKeys { key -> key }.values.toList()[0]
    println(pedidosFreteGratis)

    val nomes = listOf("Alex", "Joaquina","Maria","Pedro", "Ana","Mario")
    val agenda = nomes.groupBy{ nome -> nome.first() }
    println(agenda)
}

