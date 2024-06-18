import java.util.Random;

public class Lab3_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        int sum = 0;

        System.out.println("Generating 10 random numbers between 1 and 100:");

        for (int i = 0; i < 10; i++) {
            number = random.nextInt(100) + 1; // Generates a random number between 1 and 100
            sum += number;

            System.out.print("Random number " + (i + 1) + ": " + number);
            if (number % 2 == 0) {
                System.out.println(" - Even");
            } else {
                System.out.println(" - Odd");
            }
        }

        System.out.println("The sum of the numbers is: " + sum);
    }
}
