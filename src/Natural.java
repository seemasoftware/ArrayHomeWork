import java.util.Scanner;

//Write a program in Java to display n limit of natural numbers and their sum.
public class Natural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number:");
        int a = scanner.nextInt();
        int sum=0;
        int i=1;
        while(i<=a)
        {
            sum = sum+i;
            i++;
        }
        System.out.println("Sum of " + a + " number is " + sum  );
        }
}
