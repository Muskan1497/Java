import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        // Taking input
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Finding maximum value
        int max = numbers[0];

        for (int i = 1; i < 10; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum value: " + max);

        sc.close();
    }
}
