fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    val Flathead= Cat("Flathead", 7, 10)
    val Cupra= Cat("Cupra", 2, 7)
    binnie.walk(4)
    clyde.walk(2)
    Flathead.walk()
    Cupra.walk()
    println(binnie)
    println(clyde)
    println(Flathead)
    println(Cupra)
}