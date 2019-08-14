import java.util.Scanner;

//WAP to input any five digit number then count total no of odd and even digit and
//find sum of them
public class SumOfOddEven {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter Five Digit Number : ");
     int n=scanner.nextInt();
     int sum=0;
     int i=0;
     int odd=0;
     int even=0;
     for(i=0;i<=n;i++)
     {
       if((i%2)==0)
       {
           even=even+i;
       }
       else{
            odd=odd+i;
       }
     }
      System.out.println("Sum of Even Number"+n+" = "+even);
      System.out.println("Sum of Odd Number "+n+" = "+odd);

    }
}
