import java.util.Scanner;

// WAP to enter any String and count how many total number of words and total
//number of spaces in that sentence
public class WordAndSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Sentence :");
        String sta = scanner.next();
        int count=1;

        for (int i = 0; i < sta.length(); ++i) {
        if (sta.charAt(i) != ' ')
                count++;
        }
          System.out.println("Number of space :" + (count-1));
            System.out.print("Number of Words : " + count);

            }
        }


