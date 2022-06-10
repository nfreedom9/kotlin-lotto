package lotto.view

import lotto.domain.lotto.Lotto

const val LOTTO_PRICE = Lotto.price

class Payment(amount: Int) {
    val quantity: Int = amount / LOTTO_PRICE
    private val change: Int = amount % LOTTO_PRICE

    init {
        require(amount > LOTTO_PRICE) { "알맞는 금액을 다시 입력해주세요. 최소 $LOTTO_PRICE 이상의 금액이 필요합니다." }
        println("(지불금액: $amount, 구입수량 $quantity, 거스름돈: $change)")
    }

    companion object {
        const val inputMessage: String = "구입금액을 입력해 주세요."
    }
}
