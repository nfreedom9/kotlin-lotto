package lotto.domain.lotto

interface Lotto {
    val numbers: List<Int>

    companion object {
        const val price = 1000
    }
}
