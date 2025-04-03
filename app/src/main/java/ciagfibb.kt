//zadanie 4a
// autor: Klara Sebzda
// zrodlo, ktore pomoglo mi stworzyc kod zrodlowy: https://stackoverflow.com/questions/15600041/php-fibonacci-sequence

fun fib(n: Int): List<Int> {
    if (n <= 0) {
        print("Pusta lista, n musi byc wieksze od 0!")  // Rzucamy wyjatek w przypadku blednego n
    }

    val l = mutableListOf(0)  // Pierwszy element ciągu to 0

    if (n > 1) {
        l.add(1)  // Dodaje drugi element czyli 1,
    }

    for (i in 2 until n) {
        val ciag = l[i - 1] + l[i - 2]  // Obliczam kolejny element ciagu
        l.add(ciag)  // Dodaje element do listy
    }

    return l  // Zwraca liste pierwszych n elementow ciągu Fibonacciego
}

fun main() {
    val wynik = fib(4)
    println(wynik)

}