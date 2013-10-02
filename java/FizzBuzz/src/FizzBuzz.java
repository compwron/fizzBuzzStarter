import java.util.ArrayList;

public class FizzBuzz {
    private ArrayList<String> numbers;

    public FizzBuzz(int count) {
        numbers = new ArrayList<String>();
        for (int number = 0; number <= count; number++) {
            numbers.add(valueOf(number));
        }
    }

    public ArrayList<String> numbers() {
        return numbers;
    }

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
