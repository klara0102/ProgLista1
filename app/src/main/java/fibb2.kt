// zadanie 4b
// autor: Klara Sebzda
// zrodlo, ktore pomoglo mi stworzyc kod zrodlowy: https://stackoverflow.com/questions/15600041/php-fibonacci-sequence

fun fibrek(n: Int): List<Int> {

    if (n <= 0) {
        print("Pusta lista, n musi byc wieksze od 0!")  // Rzucamy wyjątek w przypadku błędnego n
    }

    val l = mutableListOf(0)  // Pierwszy element ciągu to 0

    if (n > 1) {
        l.add(1)  // Dodajemy drugi element, czyli 1, jeśli n > 1
    }
    fun dodajelementy(i: Int) {
        if (i < n) {
            val ciag= l[i - 1] + l[i - 2]  // Dodajemy dwa ostatnie elementy
            l.add(ciag)  // Dodajemy do listy
            dodajelementy(i + 1)  // Rekurencyjnie wywołujemy funkcję, aby dodać kolejny element
        }
    }

    dodajelementy(2)  // Zaczynamy od trzeciego elementu (indeks 2)

    return l  // Zwracamy listę
}

fun main(){
    val wynik = fibrek(4)
    println(wynik)
}



