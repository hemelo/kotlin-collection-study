fun main(){
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
    val aumento = 1.1

    for(indices in salarios.indices){
        salarios[indices] = salarios[indices] * aumento
    }
    println(salarios.contentToString())

    salarios.forEachIndexed{ i, salario -> salarios[i] = salario * aumento }
    println(salarios.contentToString())

    println("Motivos para não usar Double pra valores")
}