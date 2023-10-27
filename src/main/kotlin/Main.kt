// The first way
fun main() {
    val income1: Int? = readLine()?.toIntOrNull()
    val income2: Int? = readLine()?.toIntOrNull()

    if (income1 != null && income2 != null) {
        income(income1, income2)
    } else {
        println("ورودی نامعتبر. لطفاً عدد وارد کنید.")
    }
}

fun income(person1: Int, person2: Int) {
    val result = when {
        person1 == person2 -> "درآمد افراد برابر میباشد"
        person1 > person2 -> "درآمد فرد اول بیشتر است"
        else -> "درآمد فرد دوم بیشتر است"
    }
    println(result)
}
