//Write a Java program to sort a numeric array and a string array.
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        String city[]={"London","Manchester","Liverpool","Glasgow","Lecister"};
        System.out.println("Original City Name:"+Arrays.toString(city));

        Arrays.sort(city);
        System.out.println("City name Sorted by Alphabet :"+Arrays.toString(city));

        int n[]={50,89,55,68,33};
        System.out.println("Original Number :"+Arrays.toString(n));

        Arrays.sort(n);
        System.out.println("Sorted Number: "+Arrays.toString(n));
    }
}
