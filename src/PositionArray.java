//Write a Java program to insert an element (specific position) into an array.
import java.util.Arrays;
import java.util.Scanner;

public class PositionArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entered Desired Element");
        int element = scanner.nextInt();

        System.out.println("Enter Desired position between 1 and " + a.length);
        int pos = scanner.nextInt();

        for (int i = a.length-1; i > pos - 1; i--) {
            a[i] = a[i - 1];
        }
        a[pos-1]=element;
         System.out.println(Arrays.toString(a));
         }
    }

