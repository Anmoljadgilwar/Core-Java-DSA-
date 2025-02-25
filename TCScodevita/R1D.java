
import java.util.Scanner;

public class R1D {

    private static int S;
    private static char[][] matrix;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        S = scanner.nextInt();
        matrix = new char[S][S];

        // Read the matrix input
        for (int i = 0; i < S; i++) {
            String line = scanner.next();
            matrix[i] = line.toCharArray();
        }

        // Check for overlaps and interlocking
        String result = checkBands();
        System.out.println(result);
    }

    private static String checkBands() {
        int overlaps = 0;
        boolean[][] visited = new boolean[S][S];

        // Directions: right, down, left, up
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        for (int i = 0; i < S; i++) {
            for (int j = 0; j < S; j++) {
                if ((matrix[i][j] == '1' || matrix[i][j] == '2') && !visited[i][j]) {
                    // Mark this cell as visited
                    visited[i][j] = true;

                    // Check for overlaps in all four directions
                    for (int[] dir : directions) {
                        int nx = i + dir[0];
                        int ny = j + dir[1];

                        if (inBounds(nx, ny)) {
                            if (matrix[nx][ny] != '.' && matrix[nx][ny] != matrix[i][j]) {
                                overlaps++;
                            }
                        }
                    }

                    // Check for interlocking
                    if (isInterlocked(i, j)) {
                        return "Impossible";
                    }
                }
            }
        }

        return String.valueOf(overlaps / 2); // Each overlap counted twice
    }

    private static boolean isInterlocked(int x, int y) {
        char currentBand = matrix[x][y];
        char otherBand = (currentBand == '1') ? '2' : '1';

        // Check all adjacent cells to see if they are all the other band
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                if ((dx == 0 && dy == 0) || Math.abs(dx) == Math.abs(dy)) {
                    continue; // Skip self and diagonal
                }
                int nx = x + dx;
                int ny = y + dy;

                if (!inBounds(nx, ny) || matrix[nx][ny] != otherBand) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean inBounds(int x, int y) {
        return x >= 0 && x < S && y >= 0 && y < S;
    }
}
