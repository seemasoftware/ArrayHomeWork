import java.util.Scanner;
// Write a program in Java to display the multiplication table of a given integer.
public class Multiplication {
    public static void main(String[] args) {
        int i, j, t = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please Enter First Number : ");
        i = scanner.nextInt();
        System.out.print("Please Enter Second Digit: ");
        j = scanner.nextInt();
        do {
            System.out.println((i + "  " + j +  "  " + (i + j)));
            i++;
            j=j+2;
        }
        while (i <= t);
    }
}
