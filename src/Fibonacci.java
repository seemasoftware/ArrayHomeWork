import java.util.Scanner;

//20. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) – limitation is n
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Limit :");
        int c= scanner.nextInt();
        int n1 = 0, n2 = 1, n3, i;
        System.out.print("Fibonacci Number =  "+ n1 + " " + n2);//printing 0 and 1

        for (i = 2; i < c; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
