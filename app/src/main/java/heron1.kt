//zadanie 1 lista 1
// autor: Klara Sebzda
// zrodlo z jakiego korzystałam: https://stackoverflow.com/questions/62233497/just-want-to-check-if-the-way-i-have-used-the-assignment-expression-in-python-3

fun main() {
    // Wywolanie funkcji heron z roznymi przypadkami

    heron(4.0, 5.0, 6.0)  // Przyklad z prawidlowymi danymi
    heron(-1.0, 2.0, 3.0) // Test wartosci ujemnej
    heron(1.0, 2.0, 8.0) // Test braku trojkata
    heron(0.001,0.002,0.004) // Test dla malych wartosci

}
    // Funkcja obliczająca pole trojkata za pomoca wzoru Herona, przyjmuje tylko liczby zmiennoprzecinkowe
    fun heron(a: Double, b: Double, c: Double) {
        // Sprawdzenie czy wszystkie boki sa wieksze, badz rowne zero
        if (a <= 0 || b <= 0 || c <= 0) {
            println("Wprowadzone dane sa nieprawidlowe! Liczby musza byc wieksze od zera.")
            return
        }

        // Sprawdzenie czy z bokow mozna stworzyc trojkat
        if (a + b <= c || a + c <= b || b + c <= a) {
            println("Z podanych dlugosci nie mozna stworzyc trojkata!")
            return
        }

        val s = (a + b + c) / 2

        // Pole trojkata za pomoca wzoru herona
        val pole = kotlin.math.sqrt(s * (s - a) * (s - b) * (s - c))

        // Wyswietlanie wyniku
        println("Pole trójkąta: $pole")
    }




