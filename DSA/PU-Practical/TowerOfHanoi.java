
import java.util.Scanner;

public class TowerOfHanoi {

    // Define the initial rod names as constants for clarity
    private static final String SOURCE_ROD = "A (Source)";
    private static final String AUXILIARY_ROD = "B (Auxiliary)";
    private static final String DESTINATION_ROD = "C (Destination)";

    /**
     * @brief Recursively solves the Tower of Hanoi problem. Prints the sequence
     * of moves required to transfer N disks.
     *
     * @param n The number of disks to move.
     * @param source The name of the source rod.
     * @param destination The name of the destination rod.
     * @param auxiliary The name of the auxiliary/helper rod.
     */
    public static void solve(int n, String source, String destination, String auxiliary) {
        // Base Case: Move the single disk directly
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move n-1 disks from Source to Auxiliary, using Destination as helper.
        solve(n - 1, source, auxiliary, destination);

        // Step 2: Move the largest disk (disk n) from Source to Destination.
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move the n-1 disks from Auxiliary to Destination, using Source as helper.
        solve(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDisks = 0;

        System.out.println("--- Tower of Hanoi Solver (Revised Java) ---");

        // --- Input Loop with basic validation ---
        while (numDisks < 1) {
            System.out.print("Enter the number of disks (1-10 recommended): ");
            if (scanner.hasNextInt()) {
                numDisks = scanner.nextInt();
                if (numDisks < 1) {
                    System.out.println("❌ Please enter a positive integer.");
                }
            } else {
                System.out.println("❌ Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input
            }
        }

        // Calculate the total minimum number of moves (2^n - 1)
        long totalMoves = (long) Math.pow(2, numDisks) - 1;

        System.out.println("\n--- Solution Steps for " + numDisks + " Disks ---");
        System.out.println("Total Minimum Moves Required: " + totalMoves);
        System.out.println("Starting Moves:\n");

        // Execute the recursive solver
        solve(numDisks, SOURCE_ROD, DESTINATION_ROD, AUXILIARY_ROD);

        System.out.println("\n--- Tower of Hanoi Solved! (7 steps for 3 disks) ---");

        scanner.close();
    }
}
