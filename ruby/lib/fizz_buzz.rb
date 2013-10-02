class FizzBuzz
  # attr_reader :numbers

  def value_of number
  	if (number % 15 == 0) then return "FizzBuzz" end
    if (number % 3 == 0) then return "Fizz" end
   	if (number % 5 == 0) then return "Buzz" end
   	number.to_s
  end
end