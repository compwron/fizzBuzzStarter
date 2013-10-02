class FizzBuzz
  attr_reader :numbers

  def initialize count
  	@numbers = (1..count).map{ |number|
  		value_of(number)
  	}
  end

  def value_of number
  	return (number % 15 == 0) ? "FizzBuzz" : (number % 3 == 0 ? "Fizz" : (number % 5 == 0 ? "Buzz" : number.to_s))
  end
end