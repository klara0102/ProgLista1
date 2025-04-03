//zadanie 5
//autor: Klara Sebzda


fun collatz(c0: Int, n: Int) {
    // warunkiem jest, ze c0 jest liczba naturalna
    if (c0 < 0) {
        println("c0 musi byc liczba naturalna ")
        return
    }

    var c = c0
    var etap = 0  // Licznik wykonanych kroków

    // petla dziala wtedy gdy licznik wyjdzie tyle ile n
    while (etap < n) {
        println("Wykonano ${etap + 1}: $c")

        if (c % 2 == 0) {
            c /= 2  // Jesli liczba jest parzysta (czyli reszta z dzielenia = 0 to dzielimy przez 2)
        } else {
            c = 3 * c + 1  // Pozostale (nieparzyste) obliczam wedlug wzoru
        }

        etap++  // Zwieksz etapy
    }

    // Po n wypisz koncowy wynik
    println("Po $n krokach, liczba to: $c")
}

fun main() {
    // testy
    collatz(6, 5)  // dla parzyste
    collatz(11, 10) // dla nieparzyste
    collatz(1,1)    // male wartosci
    collatz(-1,2) // gdy c < 0
}
