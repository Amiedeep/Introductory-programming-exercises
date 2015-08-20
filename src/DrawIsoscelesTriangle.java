import java.util.Scanner;

/**
 * Created by amandeepsingh on 20/08/15.
 */
public class DrawIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DrawIsoscelesTriangle obj = new DrawIsoscelesTriangle();
        System.out.println("How many lines of stars you want me to print");
        int length = sc.nextInt();
        obj.drawIsoscelesTriangle(length);
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
