
import java.util.Scanner;

public class R1A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of instructions
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Read the instructions
        String[] instructions = new String[N];
        for (int i = 0; i < N; i++) {
            instructions[i] = scanner.nextLine();
        }

        // Calculate the minimumm movements
        int movements = calculateMinMovements(instructions);

        // Output the result
        System.out.println(movements);
    }

    private static int calculateMinMovements(String[] instructions) {
        // Initialize positions of left and right foot
        String leftFoot = null;
        String rightFoot = null;
        int movements = 0;

        for (String instruction : instructions) {
            // If both feet are on different tiles or one is null, we need to move
            if ((leftFoot == null || !leftFoot.equals(instruction))
                    && (rightFoot == null || !rightFoot.equals(instruction))) {

                // Move one foot to the instruction tile
                if (leftFoot == null) {
                    leftFoot = instruction; // Place left foot if it's free
                } else if (rightFoot == null) {
                    rightFoot = instruction; // Place right foot if it's free
                } else {
                    // Both feet are occupied, choose to move the closest one
                    if (getDistance(leftFoot, instruction) <= getDistance(rightFoot, instruction)) {
                        leftFoot = instruction; // Move left foot
                    } else {
                        rightFoot = instruction; // Move right foot
                    }
                    movements++; // Increment movement count when a foot is moved
                }
            }
            // If one of the feet is already on the instruction tile, do nothing
        }

        return movements;
    }

    private static int getDistance(String footPosition, String targetPosition) {
        // Since we only have four tiles, we can define distances manually
        if (footPosition.equals(targetPosition)) {
            return 0;
        }

        switch (footPosition) {
            case "up":
                return targetPosition.equals("down") ? 2 : 1;
            case "down":
                return targetPosition.equals("up") ? 2 : 1;
            case "left":
            case "right":
                return targetPosition.equals("left") || targetPosition.equals("right") ? 1 : 2;
            default:
                return Integer.MAX_VALUE; // Invalid position
        }
    }
}
