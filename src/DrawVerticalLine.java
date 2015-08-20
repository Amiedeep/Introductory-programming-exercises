import java.util.Scanner;

/**
 * Created by amandeepsingh on 20/08/15.
 */
public class DrawVerticalLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DrawVerticalLine obj = new DrawVerticalLine();
        System.out.println("How many stars you want me to print");
        int length = sc.nextInt();
        obj.printAsteriskVertically(length);
    }

    private void printAsteriskVertically(int length) {
        for (int i = 0; i < length; i++) {
            System.out.println("*");
        }
    }
}
