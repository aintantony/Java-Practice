package arraylesson;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Java_Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of student : ");
        n = scanner.nextInt();

        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }
        System.out.println();

        System.out.print("All Scores: ");
        System.out.println(Arrays.toString(scores));
        System.out.print("All even scores: ");
        for (int num : scores) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.print("All the odd scores: ");
        for (int num : scores) {
            if (num % 2 == 0) continue;
            System.out.print(num + " ");
        }
        System.out.println();

        int sum = 0;
        for (int num : scores) {

            sum = sum + num;
        }
        System.out.println("Total Score : " + sum);
        float avg = sum / (float) n;
        System.out.println("Average is : " + avg);

        int max = scores[0];
        for (int i = 1; i < n; i++) {
            if (scores[i] > max) max = scores[i];
        }
        System.out.println("Max is : " + max);

        Arrays.sort(scores);
        System.out.print("Final Scores: ");
        System.out.println(Arrays.toString(scores));
    }
}