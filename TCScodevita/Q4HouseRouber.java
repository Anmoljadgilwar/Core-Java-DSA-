
import java.util.Scanner;

public class Q4HouseRouber {

    public static int maxMoney(int index, int[] arr) {

        //Base case
        if (index < 0) {
            return 0;
        }

        int rob = arr[index] + maxMoney(index - 2, arr);    // Rob this house
        int notRob = maxMoney(index - 1, arr);            // skip this house
        return Math.max(rob, notRob);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of houses: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the amount of money in each house: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = maxMoney(n - 1, arr);
        System.out.println(ans);

    }
}

/*
 import java.util.Scanner;

public class EasyHouseRobber {

    public static int maxMoney(int[] arr) {
        if (arr.length == 0) {
            return 0; // No houses to rob
        }
        if (arr.length == 1) {
            return arr[0]; // Only one house to rob
        }

        int prev2 = 0; // Money robbed up to two houses back
        int prev1 = 0; // Money robbed up to the previous house

        for (int money : arr) {
            int current = Math.max(prev1, prev2 + money);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1; // The maximum money we can rob
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of houses: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the amount of money in each house: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = maxMoney(arr);
        System.out.println("Maximum money that can be robbed: " + result);
    }
}

 */
