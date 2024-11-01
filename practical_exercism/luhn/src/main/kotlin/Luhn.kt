object Luhn {

    fun isValid(candidate: String): Boolean {
        val cleaned = candidate.filter { it.isDigit() }

        if (cleaned.length <= 1) return false

        val reversedDigits = cleaned.reversed().map { it - '0' }
        val sum = reversedDigits.mapIndexed { index, digit ->
            if (index % 2 == 1) {
                val doubled = digit * 2
                if (doubled > 9) doubled - 9 else doubled
            } else {
                digit
            }
        }.sum()

        return sum % 10 == 0
    }
}
