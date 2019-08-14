import java.util.Scanner;

// Display right angle triangle of @ using nested for loops
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Character ");
        char c = scanner.next().charAt(0);
        int i, j;

        for (i = 0; i <= 5; i++)
        {
            for (j = 0; j <=i; j++)
            {
                System.out.print(c);

            }
            System.out.println();
        }

    }
}