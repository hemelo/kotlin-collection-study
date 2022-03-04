fun main(){
    val pedidos: MutableMap<Int, Double> = mutableMapOf(Pair(1, 20.0), Pair(2, 40.0), 3 to 50.0, 4 to 75.0, 5 to 90.0, 6 to 20.0, 7 to 150.0) // Infix = Perda de performance
    imprimeMapPedidos(pedidos)

    pedidos.putIfAbsent(4, 80.0)
    imprimeMapPedidos(pedidos)

    pedidos.remove(2)
    imprimeMapPedidos(pedidos)

    val pedidoNull = pedidos.get(2) //  Se não existe a key retorna null
    println(pedidoNull)

    try{
        val pedido = pedidos.getValue(2);
        println(pedido)
    } catch (e: Exception) {
        println(e.message)
    } // Se não existe a key retorna Exception

    val mensagem = pedidos.getOrElse(0) {
        "Não tem o pedido"
    }
    println(mensagem)

    val getComValorDefault = pedidos.getOrDefault(key = 2, defaultValue = -1.0)
    println(getComValorDefault)

    println(pedidos.keys)
    println(pedidos.values)

    println()

    var filtrados = pedidos.filter { (id, valor) -> id % 2 == 0 && valor > 50.0  }.toMap()
    imprimeMapPedidos(filtrados)

    filtrados = pedidos.filterValues { valor -> valor > 50.0  }.toMap()
    imprimeMapPedidos(filtrados)

    filtrados = pedidos.filterKeys { id -> id % 2 == 0  }.toMap()
    imprimeMapPedidos(filtrados)

    println(pedidos + Pair(8, 10.0))
    println(pedidos - 6)
    println(pedidos - listOf(1, 3))

    pedidos.putAll(setOf<Pair<Int,Double>>(8 to 90.0, 9 to 100.0, 10 to 200.0))
    //pedidos += setOf<Pair<Int,Double>>(8 to 90.0, 9 to 100.0, 10 to 200.0)
    imprimeMapPedidos(pedidos)

    pedidos.keys.remove(1)
    pedidos.values.remove(90.0)
    imprimeMapPedidos(pedidos)

    pedidos -= 6
    println(pedidos)
}

fun imprimeMapPedidos(pedidos: Map<Int,Double>){
    println("Imprimindo MAP")
    for(pedido: Map.Entry<Int, Double> in pedidos ){
        println("Número do pedido: ${pedido.key} - Valor do pedido ${pedido.value}")
    }
    println()
}