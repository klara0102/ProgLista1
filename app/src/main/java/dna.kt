// zadanie 6 a
// autor: Klara Sebzda
// zrodlo, ktorym sie wspomagalam https://www.youtube.com/watch?v=az0l88f-6ws


fun komplement(dna: String): String {
    val matryca= StringBuilder()

    for (nukleotyd in dna) { // przechodze przez kazdy nukleotyd w dna
        when (nukleotyd) {
            'A' -> matryca.append('T') // jesli w dna A to zamien na T zgodnie z zasada komplementernosci
            'T' -> matryca.append('A')
            'C' -> matryca.append('G')
            'G' -> matryca.append('C')
            else  -> { // gdy wprowadzimy niepoprawne dane do dna
                println("Nieprawidlowe dane w nici DNA: $nukleotyd")
            }
        }
    }

    return matryca.toString()
}

fun main() {
    //test
    val dna = "TCGC" // otrzymana wartosc:AGCG
    //val dna = ""    // pusta nic
    //val dna = "TTTTTT" // otrzymana wartosc: AAAAAA
    //val dna = "kkkk" // otrzymane nieprawdilowe dane

    val matryca = komplement(dna)
    println("Komplementarna nic: $matryca")
}


