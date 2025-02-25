
import java.util.*;

public class Q3stairs {

    public static int totalWays(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = totalWays(n - 1, dp) + totalWays(n - 2, dp);

    }

    public static void main(String[] args) {
        System.out.println("Enter the number of stairs: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        int ans = totalWays(n, dp);
        System.out.println("Total number of ways: " + ans);
    }
}

//
/*
 import java.util.Scanner;

public class Q3stairs {

    public static int totalWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return totalWays(n - 1) + totalWays(n - 2);

        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the number of stairs: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = totalWays(n);
        System.out.println("Total number of ways: " + ans);
    }
}
 */
