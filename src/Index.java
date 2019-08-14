//Write a Java program to find the index of an array element.

import java.util.Scanner;
public class Index {
    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5};

        System.out.println("Enter Value to be Match :");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 0; i < n.length; i++)
            {
                if (a == n[i]) {
                    System.out.println("Matching Index is " + i);
                }
                }

        }
        }



