import java.util.Scanner;

public class Lab3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        System.out.println("\nEnter a series of integers (-99 to end):");

        do {
            number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }
        }   while (number!=-99);

        if (largest == Integer.MIN_VALUE && smallest == Integer.MAX_VALUE) {
            System.out.println("No valid numbers were entered.");
        } else {
            System.out.println("The largest number entered is: " + largest);
            System.out.println("The smallest number entered is: " + smallest);
        }
    }
}
