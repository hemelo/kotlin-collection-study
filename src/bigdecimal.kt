import java.math.BigDecimal
import java.math.RoundingMode

fun main(){
    var salarios = bigDecimalArrayOf("1500.55", "1200", "6000.20")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    salarios = salarios.map { salario ->
        when {
            salario < "5000".toBigDecimal() -> salario * aumento
            else -> salario * aumento.setScale(2, RoundingMode.UP)
        }
    }.toTypedArray()
    println(salarios.contentToString())

    val gastoAumento = salarios.sum()
    println(gastoAumento)

    val meses = 6.toBigDecimal()
    val gastoTotalSemestre = salarios.fold(gastoAumento) { acumulador, salario -> acumulador + (salario * meses).setScale(2, RoundingMode.UP) }
    println(gastoTotalSemestre)

    val salariosOrdenados = salarios.sorted().toTypedArray()
    println(salariosOrdenados.contentToString())

    val mediaDosTresUltimosOrdenados = salariosOrdenados.takeLast(3).toTypedArray().average()
    println(mediaDosTresUltimosOrdenados)

}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> = Array<BigDecimal>(valores.size){ i -> valores[i].toBigDecimal() }

fun Array<BigDecimal>.sum() : BigDecimal = this.reduce { acumulador, valor -> acumulador + valor }

fun Array<BigDecimal>.average(): BigDecimal = if (this.isEmpty()) BigDecimal.ZERO  else (this.sum() / this.size.toBigDecimal())