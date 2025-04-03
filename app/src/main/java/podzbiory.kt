 // zadanie 3
 // autor: Klara Sebzda
 // zrodlo, ktore pomoglo mi utworzyc funkcje https://4programmers.net/Forum/Inne/167256-Algorytm_znajdywania_wszystkich_podzbiorow_danego_zbioru

 fun main() {
      val l = listOf("a", "b", "c", "d")  // Lista string
     // val l = listOf(1,2,3,4)          // Lista liczby int
    // val l = listOf(4.0, 2.0, 1.0, 7.0)   // Lista liczby double


     // Funkcja generujaca podzbiory
     fun podzbiory(l: List<Any>): List<List<Any>> {
         val wszystkiepodzbiory = mutableListOf<List<Any>>()  // Lista na wszystkie podzbiory

         // Petla tworzaca podzbiory
         for (i in 0..l.size) {
             // Petla tworzaca wszystkie mozliwe podzbiory
             for (j in 0..l.size - i) {
                 val zbior = mutableListOf<Any>()  // Tworzymy nowy podzbiór
                 for (k in j until j + i) {
                     zbior.add(l[k])  // Dodajemy elementy do podzbioru
                 }
                 if (zbior.isNotEmpty()) {
                     wszystkiepodzbiory.add(zbior)  // Dodajemy podzbior do listy
                 }
             }
         }

         // Dodajemy pusty podzbior
         wszystkiepodzbiory.add(emptyList())

         return wszystkiepodzbiory
     }


     val wszystkiepodzbiory = podzbiory(l)

     // Wyswietl podzbior
     for (zbior in wszystkiepodzbiory) {
         println(zbior)
     }
 }

