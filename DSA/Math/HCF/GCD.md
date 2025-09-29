Alright 👍 Let’s carefully break down the **Euclidean Algorithm code** step by step.

Here’s the Java program we wrote:

```java
public class GCDEuclidean {
    // Recursive function
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;  // base case
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 48, b = 18;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
}
```

---

## 🔹 Step 1: Function Signature

```java
static int gcd(int a, int b)
```

- `gcd` is a **static method** → can be called without creating an object.
- Takes two integers `a` and `b`.
- Returns an integer (the GCD).

---

## 🔹 Step 2: Base Case

```java
if (b == 0) {
    return a;
}
```

- If the second number becomes **0**, the first number `a` is the **GCD**.
- This is the stopping condition of recursion.

---

## 🔹 Step 3: Recursive Step

```java
return gcd(b, a % b);
```

- Instead of solving the big problem directly, we reduce it to a smaller problem.
- Formula:

  ```
  gcd(a, b) = gcd(b, a % b)
  ```

- Why? Because dividing `a` by `b` leaves remainder `a % b`.
  The GCD of `(a, b)` is the same as `(b, a % b)`.

---

## 🔹 Step 4: Example Dry Run

Let’s compute `gcd(48, 18)`.

1. Call → `gcd(48, 18)`
   → since `b != 0`, return `gcd(18, 48 % 18)`
   → `48 % 18 = 12`
   → call `gcd(18, 12)`

2. Call → `gcd(18, 12)`
   → return `gcd(12, 18 % 12)`
   → `18 % 12 = 6`
   → call `gcd(12, 6)`

3. Call → `gcd(12, 6)`
   → return `gcd(6, 12 % 6)`
   → `12 % 6 = 0`
   → call `gcd(6, 0)`

4. Call → `gcd(6, 0)`
   → base case hit → return `6`.

✅ Final Answer: GCD = 6

---

## 🔹 Time Complexity

- Each step reduces the problem size (`a % b` < `b`).
- So at most **log(min(a,b))** recursive calls happen.
- Much faster than checking all numbers.

---

👉 That’s why Euclidean Algorithm is the **most efficient and standard way** to find GCD.

Do you also want me to show you the **iterative version (while loop)** of Euclidean algorithm (sometimes asked in interviews instead of recursion)?
