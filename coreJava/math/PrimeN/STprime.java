import java.util.Vector;

public class STprime{


    public int countPrimes(int n) {
        // Use Boolean instead of bool and initialize Vector with Boolean objects
        Vector<Boolean> isPrime = new Vector<>(n + 1);

        // Initialize all values as true for prime candidates
        for (int i = 0; i <= n; i++) {
            isPrime.add(true);
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime.get(i)) {
                count++;

                // Mark all multiples of i as non-prime
                for (int j = i * 2; j < n; j += i) {  // Corrected increment in for loop
                    isPrime.set(j, false);
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        STprime obj = new STprime();
        int n = 50; // example limit
        System.out.println("Number of primes up to " + n + ": " + obj.countPrimes(n));

    }
}


