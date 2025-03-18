// Link: https://leetcode.com/problems/richest-customer-wealth/
// 1672. Richest Customer Wealth
// Easy
//

class Q1672MaxWealth {

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}}; // Output: 6
        System.out.println(maxWealth(accounts));
    }

    public static int maxWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {  //row (customer)
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {//Adds up all the money the i-th customer has in different banks.
                sum += accounts[i][j]; //total wealth of the i-th customer.
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
