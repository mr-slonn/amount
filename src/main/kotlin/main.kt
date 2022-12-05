fun main(){
    val amount:Int = 8000;
    var commission:Int = (amount/100*0.75).toInt();
    if (commission<35)
    {
        commission = 35;
    }
    println("Коммисия за перевод составляет: $commission");
}