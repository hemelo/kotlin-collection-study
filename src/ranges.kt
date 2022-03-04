fun main(){
    val serie: IntRange = 1.rangeTo(10)
    for(s in serie) print("$s ")

    println()

    val even = 0..100 step 2
    for(s in even) print("$s ")

    println()

    val reverseEven = 100 downTo 0 step 2
    for(s in reverseEven) print("$s ")

    println()

    if(2 in reverseEven) println("oh yeah")

    val alfabeto = 'a'..'z'
    for (c in alfabeto) { print("$c") }

    println()
}