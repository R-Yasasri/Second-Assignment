object q2 extends App {

  optimumTicketPrice();

  var maxProfit: Int = 0;
  var optTicketPrice: Int = 0;

  def optimumTicketPrice(ticketPrice: Int = 15, headCount: Int = 120): Unit = {


    headCount match {
      case headcount if headcount == 0 => optimumTicketPrice(10, 140);

      case headcount if headcount <= 120 =>
        var profitValue: Int = profit(ticketPrice, headCount);
        if (profitValue > maxProfit) {
          maxProfit = profitValue
          optTicketPrice = ticketPrice;
        }
        optimumTicketPrice(ticketPrice + 5, headCount - 20)
      case headcount if headcount > 120 && ticketPrice > 0 =>
        var profitValue: Int = profit(ticketPrice, headCount);
        if (profitValue > maxProfit) {
          maxProfit = profitValue
          optTicketPrice = ticketPrice;
        };
        optimumTicketPrice(ticketPrice - 5, headCount + 20)
      case _ => println("optimum ticket price is:" + optTicketPrice)
    }

  }

  def profit(ticketPrice: Int, headCount: Int): Int = {

    var income: Int = headCount * ticketPrice
    var expense: Int = 500 + 3 * headCount

    var profit: Int = income - expense
    //println(profit)
    return profit
  }
}