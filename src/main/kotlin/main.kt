fun main() {
    var amount: Int = 8000;
    var typeCard: String = "Visa"
    var allSum: Int = 4000;

    println(
        "Коммисия за перевод $amount по карте $typeCard составляет: ${
            getCommission(
                typeCard,
                sum = amount
            )
        }"
    );
    amount = 59900;
    println(
        "Коммисия за перевод $amount по карте $typeCard составляет: ${
            getCommission(
                typeCard,
                sum = amount
            )
        }"
    );


    typeCard = "VK Pay";
    println(
        "Коммисия за перевод $amount по карте $typeCard составляет: ${
            getCommission(
                typeCard,
                sum = amount
            )
        }"
    );

    typeCard = "Mastercard";
    println(
        "Коммисия за перевод $amount по карте $typeCard составляет: ${
            getCommission(
                typeCard,
                allSum,
                sum = amount
            )
        }"
    );

    allSum = 200000;
    println(
        "Коммисия за перевод $amount по карте $typeCard составляет: ${
            getCommission(
                typeCard,
                allSum,
                sum = amount
            )
        }"
    );
}

fun getCommission(type: String, allSum: Int = 0, sum: Int): Int {
    return when (type) {
        "VK Pay" -> {
            0;
        }
        "Visa", "Мир" -> {
            var commission: Int = (sum * 0.0075).toInt();
            return if (commission < 35) {
                35;
            } else {
                commission;
            }
        }
        "Mastercard", "Maestro" -> {
            return if (allSum in 30..75000) {
                0;
            } else {
                (sum * 0.006).toInt() + 20;
            }
        }
        else -> 0;
    }

}


