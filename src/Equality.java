import java.util.Arrays;

//Write a Java program to test the equality of two arrays.
public class Equality {
    public static void main(String[] args) {
        int s1[] = {5, 10, 15, 20, 25};
        int s2[] = {1, 2, 3};
        if (Arrays.equals(s1, s2))
        {
            System.out.println("Two Arrays is Same");
        }
        else{
            System.out.println("Two Arrays are Not same");
            }
        }
    }