import java.util.Scanner;

//WAP to enter any String and count total number of 'a' in that String.
public class CountString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String Name :");
        String name = scanner.next();
        int count=0;
        char a= 'a';
        char a1 = 'A';
        System.out.print("Total a in "+ name + " is ");
        for(int i=0;i<name.length();i++)
        {if((a==name.charAt(i))  || (a1==name.charAt(i)))
        count++;
        }
        System.out.print(count);
    }

}
