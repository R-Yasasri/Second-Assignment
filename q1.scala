object q1 extends App {

  payRoll()

  def payRoll(nHours: Double = 40, otHours: Double = 20): Unit = {
    var paymentPerNormalHour: Double = 150
    var paymentPerOTHour: Double = 75

    var tax: Double = 0.1

    var beforeSalary = nHours * paymentPerNormalHour + otHours * paymentPerOTHour
    var takeHomeSalary = beforeSalary - beforeSalary * tax

    println(takeHomeSalary)
  }
}
