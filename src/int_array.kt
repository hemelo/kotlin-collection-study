fun main() {
    val idades = intArrayOf(25, 19, 33, 20, 55, 40)
    var maiorIdade = 0
    var menorIdade = Int.MAX_VALUE

    for(idade in idades){
        if(idade > maiorIdade) maiorIdade = idade
    }

    idades.forEach { idade -> if(idade < menorIdade) menorIdade = idade }

    println("maiorIdade == idades.maxOrNull(): ${maiorIdade == idades.maxOrNull()} | Maior idade: $maiorIdade")
    println("menorIdade == idades.maxOrNull(): ${menorIdade == idades.minOrNull()} | Menor idade: $menorIdade")

    val media = idades.average()
    println("Media: $media")

    val todosDeMaiores = idades.all { it >= 18 }
    println("Todos de maiores? $todosDeMaiores")

    val peloMenosUmDeMaior = idades.any { it >= 18 }
    println("Algum de maior? $peloMenosUmDeMaior")

    val apenasDeMaior = idades.filter { it >= 18 }
    println("Os de maior: $apenasDeMaior")

    
}