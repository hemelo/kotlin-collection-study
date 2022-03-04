data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
) : Comparable<Livro> {
    override fun compareTo(other: Livro): Int = this.anoPublicacao.compareTo(other.anoPublicacao)
}

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livro4 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livros: MutableList<Livro?> = mutableListOf(livro1, livro2, livro3)
    livros.add(livro4)

    println("\nLista de Livros\n")

    println(livros.imprimeFormatado())

    println("\nApós remoção\n")

    livros.remove(livro1)
    println(livros.imprimeFormatado())

    println("\nOrdenados por ano\n")

    val livrosOrdenadosPorAno = livros.filterNotNull().sorted().toMutableList() as MutableList<Livro?>
    println(livrosOrdenadosPorAno.imprimeFormatado())

    println("\nOrdenados por autor\n")

    val livrosOrdenadosPorAutor = livros.sortedBy { it?.autor }.toMutableList()
    println(livrosOrdenadosPorAutor.imprimeFormatado())

    println("\nFiltro por autor\n")

    val filtroPorAutorEspecifico = livros.filter { it?.autor == "José de Alencar" }.map { it?.titulo }
    println(filtroPorAutorEspecifico)

    livros.filterNotNull().groupBy { it.editora }
        .forEach { (editora: String?, livrosEditora: List<Livro>) -> println("${editora ?: "Editora desconhecida"}: ${livrosEditora.joinToString { it.titulo }}") }
}

fun MutableList<Livro?>.imprimeFormatado() = this.filterNotNull().joinToString(separator = "\n") {
    "- ${it.titulo} de ${it.autor}"
}

// SortedBy ---> Retorna uma nova lista ordenada (list)
// SortBy --> Retorna a mesma lista ordenada (mutable list)