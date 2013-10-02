class FizzBuzz
  # attr_reader :numbers

  def value_of number
  	response = ""
  	if (number  % 3 == 0) then
  		response += "Fizz"
  	end
  	if (number % 5 == 0) then 
  		response += "Buzz"
  	end
  	if (response == "") then return number.to_s end
  	response
  end
end