import java.util.Scanner;

/**
 * Created by amandeepsingh on 20/08/15.
 */
public class DrawRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DrawRightTriangle obj = new DrawRightTriangle();
        System.out.println("How many lines of stars you want me to print");
        int length = sc.nextInt();
        obj.drawRightTriangle(length);
    }

    private void drawRightTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
