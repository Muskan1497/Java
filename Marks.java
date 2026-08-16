import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        // Taking marks as input
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Printing marks
        System.out.println("\nStudent Marks:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        sc.close();
    }
}