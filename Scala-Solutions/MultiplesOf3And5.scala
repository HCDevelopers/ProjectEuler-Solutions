package projecteuler

object MultiplesOf3And5 {
  def main(args: Array[String]) {
	def res = multiply(999, 3) + multiply(999, 5) - multiply(999, 15)
	println(res)
  }
  def multiply(num: Int, x: Int): Int = {
	if (num % x != 0)
	  multiply(num - 1, x)
	else if (num < x) 0
	else num + multiply(num - x, x);
  }
}
