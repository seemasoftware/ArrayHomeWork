//Write a Java program to sum values of an array.

public class Sum {
    public static void main(String[] args){
        int n[]={23,45,90,60,90};
        int sum=0;

        for(int i=0;i<5;i++){sum=sum+n[i];}
        System.out.println(sum);
    }
}
