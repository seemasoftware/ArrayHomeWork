//Write a Java program to sum values of an array.
import java.util.Scanner;

public class SumScanner {
    public static void main(String[] args) {
        int i;
        int sum=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length of array: ");
        int l = scanner.nextInt();
        int a[] = new int[l];

        for (i = 0; i < a.length; i++) {
            System.out.println("Enter Number :");
            int b = scanner.nextInt();
            a[i] = b;
            sum=sum+b;
            System.out.println("total sum is "+sum);


    }}}
