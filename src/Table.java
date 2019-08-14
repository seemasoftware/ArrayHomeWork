import java.util.Scanner;

//Printing multiplication table using do while loop
public class Table {
    public static void main(String[] args) {
        int i, j, t=10;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please Enter First Number : ");
        i = scanner.nextInt();
        System.out.print("Please Enter Second Digit: ");
        j = scanner.nextInt();
        do {
            System.out.println((i + " * " + j + " = " + (i * j)));
            i++;
           }
        while(i<=t);
    }
}
