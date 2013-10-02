public class Main {
    public static void main(String... args){
        for (String number : new FizzBuzz(100).numbers()){
            System.out.println(number);
        }
    }
}
