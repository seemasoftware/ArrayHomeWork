import java.util.Scanner;

// WAP to input any five digit number and then find sum of each digit
public class FiveDigitSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five Digit Number :");
        int n= scanner.nextInt();
        int sum =0 ;
        int t;
        while(n>0)
        {
            t= n%10;
            sum=sum+t;
            n=n/10;
        }
        System.out.println("Sum of given five digit is :"+sum);
    }
}
