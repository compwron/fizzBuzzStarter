class FizzBuzz
  # attr_reader :numbers

  def value_of number
    number % 3 == 0 ? "Fizz" : number.to_s
  end
end