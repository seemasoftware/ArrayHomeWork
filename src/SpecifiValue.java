//Write a Java program to insert an element (specific position) into an array.
import java.util.Scanner;

public class SpecifiValue {
    public static void main(String[] args) {
        int a[] = {3, 5, 9};
        //int c=a[2];

        //  for(int i=0;i<3;i++)
        // if(c==a[i])
        // {System.out.println("Matching Value "+a[i]);}

        // }
//}
        System.out.println("Enter Value");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                System.out.println("Arrays contains this value and its index positive is " + i);
            }
            }
        }
    }





