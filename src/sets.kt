fun main(){
    val estudantesCurso1: Set<String> = setOf("Alex", "Maria")
    val estudantesCurso2: Set<String> = setOf("Alex", "Paulo")
    val estudantesAmbos: Set<String> = estudantesCurso1 union estudantesCurso2 // União matemática
    println(estudantesAmbos)

    val estudantesDoCurso1QueNaoEstaoNo2: Set<String> = estudantesCurso1 subtract  estudantesCurso2 // Subtração matemática
    println(estudantesDoCurso1QueNaoEstaoNo2)

    val estudantesUnicamenteAmbos: Set<String> = estudantesCurso1 intersect  estudantesCurso2 // Intersecção matemática
    println(estudantesUnicamenteAmbos)
}