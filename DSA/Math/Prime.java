// //A prime number can only be divided evenly (without a remainder) by 1 and the number itself.
// //2, 3, 5, 7, 11

// public class Prime {
//     public static void main(String[] args) {
//         int n = 20;
//         for (int i = 0; i < n; i++) {
//             System.out.println(i + " " + isPrime(i));
//         }
//     }
//     static boolean isPrime(int n) {
//         if (n <= 1) {
//             return false;
//         }
//         int c = 2;
//         while (c * c <= n) {
//             if (n % c == 0) {
//                 return false;
//             }
//             c++;
//         }
//         return true;
//     }
// }
//
//sieve_of_eratosthenes
/*
 Start with all numbers as candidates.
Each prime eliminates its multiples.
What remains is prime.
 */
//
public class Prime {

    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1];
        sieve(n, primes);
    }

    static void sieve(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                // start from i*i and increment by i
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
