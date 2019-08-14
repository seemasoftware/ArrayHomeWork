//15. WAP to input any five digit number and then reverse the number
import java.util.Scanner;

public class FiveDigitReverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Five Digit Number :");
        int n= scanner.nextInt();
        int reversed = 0;
        while(n != 0) {
            int b = n % 10;
            reversed = reversed * 10 + b;
            n /= 10;
        }
        System.out.println("Reversed Number: " + reversed);

    }
}
