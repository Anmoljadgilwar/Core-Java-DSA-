
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p, totalYears;
        System.out.print("Enter the principal amount: ");
        p = sc.nextDouble();
        System.out.print("Enter tenure year: ");
        totalYears = sc.nextInt();
        double[] bank = new double[2];
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter the number of slabs");
            double n1 = sc.nextInt();
            double sum = 0;
            for (i = 0; i < n1; i++) {
                System.out.print("Enter the period");
                double yrs = sc.nextInt();
                System.out.print("Enter the interest");
                double interest = sc.nextDouble();
                double sq = Math.pow(1 + interest, yrs * 12);
                double emi = (p * (interest)) / (1 - 1 / sq);
                sum += emi;
            }
            bank[i] = sum;
            i++;
        }
        double bankA = bank[0];
        double bankB = bank[1];
        if (bankA < bankB) {
            System.out.println("BankA");
        } else {
            System.out.println("BankB");
        }
    }
}

// import java.util.Scanner;
// public class Q2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double principal;
//         int totalYears;
//         // Input principal amount
//         System.out.print("Enter the principal amount: ");
//         principal = sc.nextDouble();
//         // Input tenure years
//         System.out.print("Enter tenure years: ");
//         totalYears = sc.nextInt();
//         double[] bankEMIs = new double[2];
//         // Loop for each bank
//         for (int bankIndex = 0; bankIndex < 2; bankIndex++) {
//             System.out.print("Enter the number of slabs for Bank " + (bankIndex + 1) + ": ");
//             int numberOfSlabs = sc.nextInt();
//             double totalEMI = 0;
//             // Input slabs details
//             for (int slabIndex = 0; slabIndex < numberOfSlabs; slabIndex++) {
//                 System.out.print("Enter the period (in years) for slab " + (slabIndex + 1) + ": ");
//                 double years = sc.nextInt();
//                 System.out.print("Enter the interest rate for slab " + (slabIndex + 1) + ": ");
//                 double annualInterestRate = sc.nextDouble() / 100; // Convert percentage to decimal
//                 // Calculate monthly interest rate
//                 double monthlyInterestRate = annualInterestRate / 12;
//                 int numberOfPayments = (int) (years * 12);
//                 // EMI calculation using formula
//                 double emi = (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
//                 totalEMI += emi;
//             }
//             bankEMIs[bankIndex] = totalEMI; // Store total EMI for the bank
//             System.err.println();
//         }
//         System.err.println();
//         // Compare banks and display result
//         if (bankEMIs[0] < bankEMIs[1]) {
//             System.out.println("Bank A offers a better deal.");
//         } else {
//             System.out.println("Bank B offers a better deal.");
//         }
//         sc.close(); // Close scanner resource
//         System.err.println();
//     }
// }
