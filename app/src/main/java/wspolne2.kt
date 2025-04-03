// zadanie 2
// autor: Klara Sebzda
// zrodlo: https://4programmers.net/Forum/Java/360986-algorytm_wyznaczania_czesci_wspolnej_dwoch_list

fun main() {
    // przeprowadzono test dla nastepujacych przypadkow:
   // val lista1 = listOf(1, 2, 3) // Test 1 gdy sa wspolne elementy
  //  val lista2 = listOf(2, 3, 4)
   // val lista1 = listOf<Int>() // Test 2 gdy jedna lista jest pusta
   // val lista2 = listOf(2, 3, 4)
    //val lista1 = listOf(1,2,3)  // Test 3 gdy nie znaleziono wspolnych
    //val lista2 = listOf(4,5,6)
    val lista1 = listOf(10,12,300)  // Test 4 gdy tylko 1 element jest wspolny
    val lista2 = listOf(10,60,44)


    // wypisz wspolne, jesli nie  to powiadom o bledzie
    wspolne(lista1, lista2)
}

fun wspolne(lista1: List<Int>, lista2: List<Int>) {
    // Sprawdzenie czy listy sa puste
    if (lista1.isEmpty() || lista2.isEmpty()) {
        println("Lista jest pusta")
        return
    }

    var znaleziono = false

    // Petla, ktora sprawdza czy elementy pierwszej listy  sa w drugiej liscie
    for (element in lista1) {
        for (znak in lista2) {
            if (element == znak) {  // Jesli elementy sa rowne
                println(element)  // Wypisz wspolny element
                znaleziono = true


            }

            }
        }
    if (!znaleziono){
        println("brak wspolnych elementow w liscie")
    }
}

