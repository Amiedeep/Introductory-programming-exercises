import java.util.Scanner;

/**
 * Created by amandeepsingh on 20/08/15.
 */
public class PrintDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintDiamond obj = new PrintDiamond();
        System.out.println("How many lines of stars you want me to print");
        int length = sc.nextInt();
        obj.drawIsoscelesTriangle(length);
        obj.drawReverseIsoscelesTriangle(length);
    }

    private void drawReverseIsoscelesTriangle(int length) {
        for (int i = length-1; i > 0; i--) {
            for (int j = i; j <= length-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2*i ; j++) {
                System.out.print("*");
            }
            for (int j = i; j <= length-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private void drawIsoscelesTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length-1-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2*i ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < length-1-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
