public class FizzBuzz {

    public String valueOf(int number) {
        String value = "";
        if (number % 3 == 0) {
            value +="Fizz";
        }
        if (number % 5 == 0) {
            value += "Buzz";
        }
        return value == "" ? String.valueOf(number) : value;
    }
}
