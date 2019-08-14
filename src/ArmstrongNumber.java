import java.util.Scanner;

//WAP to input any number and check if it is Armstrong number or not
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number :");
        int n = scanner.nextInt();
        int c = 0;
        int temp;
        int a;
        temp=n;
        while (n > 0)
            {
                a = n % 10;
                n = n / 10;
                c = c + (a * a * a);
            }
            if (temp == c ){ System.out.println("Armstrong Number");}
            else {System.out.println("Not An Armstrong Number");}

    }
}
