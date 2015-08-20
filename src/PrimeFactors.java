import java.util.Scanner;

/**
 * Created by amandeepsingh on 20/08/15.
 */
public class PrimeFactors {
    public static void main(String[] args) {
        PrimeFactors obj = new PrimeFactors();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to generate prime factors");
        int number = sc.nextInt();
        obj.generate(number);
    }

    private void generate(int number) {
        int temp = number;
        System.out.print("factors of this number are :\t");
        for (int i = 2; i <= number ; i++) {
            if(temp == 1)
                break;

            if(temp%i == 0) {
                System.out.print(i + "\t");
                temp = temp/i;
                i--;
            }
        }
    }
}
