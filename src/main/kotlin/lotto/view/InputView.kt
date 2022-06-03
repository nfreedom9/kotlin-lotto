package lotto.view

private fun printBy(askCount: Int) {
    if (askCount % 4 == 0) println("같은걸 $askCount 번째 물어봅니다... s(^_^)a")
}

class InputView {
    val quantity = getPayment().quantity

    private fun getPayment(askCount: Int = 1): Payment = try {
        printBy(askCount)
        println(Payment.inputMessage)
        Payment(readln().toIntOrNull() ?: 0)
    } catch (e: IllegalArgumentException) {
        println(e.message)
        getPayment(askCount + 1)
    }
}