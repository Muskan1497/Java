import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int sum = 0;

        // Taking marks of 5 subjects
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sum = sum + marks[i];
        }

        // Calculating average
        double average = sum / 5.0;

        System.out.println("Average Marks: " + average);

        // Assigning grade
        if (average >= 90) {
            System.out.println("Grade: A");
        }
        else if (average >= 75) {
            System.out.println("Grade: B");
        }
        else {
            System.out.println("Grade: Below B");
        }

        sc.close();
    }
}
