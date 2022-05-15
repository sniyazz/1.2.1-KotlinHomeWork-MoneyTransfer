fun main() {
    val transferAmount: Int = 500_042
    val comission: Int = 75
    val minimalComission = 3500
    val totalComission = transferAmount * comission / 10000
    val result = if (totalComission <= minimalComission) minimalComission else totalComission

    println("""Ваш перевод составляет: $transferAmount копеек
        |Комиссия на перевод составляет: $result копеек""".trimMargin())
}