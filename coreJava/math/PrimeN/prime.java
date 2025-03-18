
import java.util.Scanner; // Import Scanner class for user input

// Class to check if a number is prime
class prime {

    public static void main(String[] args) {
        int n, count = 0; // Declare variables: 'n' for input number, 'count' for counting factors

        System.out.print("Enter the number: ");
        Scanner obj = new Scanner(System.in); // Create Scanner object to read input
        n = obj.nextInt(); // Read user input

        // Loop to check how many numbers can divide 'n' exactly
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // If 'i' is a factor of 'n'
                count++;
            }
        }

        // A prime number has exactly two factors: 1 and itself
        if (count == 2) {
            System.out.println("It's a Prime number");
        } else {
            System.out.println("Not a Prime number");
        }

        obj.close(); // Close Scanner to prevent resource leak
    }
}

// TODO: Implement logic to find prime numbers in a given range
