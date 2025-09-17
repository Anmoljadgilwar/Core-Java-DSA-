// Link: https://leetcode.com/problems/richest-customer-wealth/
// 1672. Richest Customer Wealth
// Easy
// description:
// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i-th customer has in the j-th bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

class Q1672MaxWealth {

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3, 5}, {8, 3, 2, 1}}; // Output: 
        System.out.println(maxWealth(accounts));
    }

    public static int maxWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {  //row (customer)
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {//Adds up all the money the i-th customer has in different banks.
                sum += accounts[i][j]; //total wealth of the i-th customer.
            }
            // max = Math.max(max, sum);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
