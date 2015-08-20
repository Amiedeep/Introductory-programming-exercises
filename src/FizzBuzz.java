/**
 * Created by amandeepsingh on 20/08/15.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz obj = new FizzBuzz();
        obj.fizzBuzz();
    }

    private void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if(i%3 == 0 && i%5 == 0) {

                System.out.println("FizzBuzz");
            }
            else if(i%3 == 0) {
                System.out.println("Fizz");
            }
            else if(i%5 == 0) {

                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
