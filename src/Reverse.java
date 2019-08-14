import java.util.Arrays;

// Write a Java program to reverse an array of integer values.
public class Reverse {
    public static void main(String[] args){
        int a[]={3,6,9,12,15};
        System.out.println("Original Arrays :"+ Arrays.toString(a));

        for(int i=0;i<a.length/2;i++){
            int temp =a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1]= temp;
            }
        System.out.println("Reverse Arrays :"+ Arrays.toString(a));

    }
}
