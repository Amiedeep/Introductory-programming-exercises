import java.util.Scanner;

/**
 * Created by amandeepsingh on 20/08/15.
 */
public class DrawHorizontalLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DrawHorizontalLine obj = new DrawHorizontalLine();
        System.out.println("How many stars you want me to print");
        int length = sc.nextInt();
        obj.printAsteriskLine(length);
    }

    private void printAsteriskLine(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
    }
}
