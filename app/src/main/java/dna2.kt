//zadanie 6 b
// autor: Klara Sebzda
// zrodlo, ktorym sie wspomagalam https://www.youtube.com/watch?v=az0l88f-6ws

fun transkrybuj(dna: String): String {
    val rna= StringBuilder()

    for (nukleotyd in dna) { // przechodze przez kazdy nukleotyd w dna
        when (nukleotyd) {
            'A' -> rna.append('U') // zamiast tyminy jest uracyl dla RNA
            'T' -> rna.append('A') // jesli w dna T to dodaj na A zgodnie z zasada komplementarnosci
            'C' -> rna.append('G')
            'G' -> rna.append('C')
            else  -> {
                println("Nieprawidlowe dane w DNA: $nukleotyd") // powiadom o nieprawidlowych danych
            }
        }
    }

    return rna.toString()
}

fun main() {
    //test
    val dna = "TCGC" // otrzymana wartosc: AGCG
    //val dna = ""    // pusta nic
    //val dna = "XXX" // otrzymane nieprawidlowe dane
    //val dna = "CCCC" // otrzymane: GGGG

    val rna = transkrybuj(dna)
    println("Nic po transkrypcji: $rna")
}
