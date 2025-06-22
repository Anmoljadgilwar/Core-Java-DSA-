✅ Correct!
Let’s break it down:

For `sum(3)`:

```
sum(3)
= 3 + sum(2)
= 3 + 2 + sum(1)
= 3 + 2 + 1 + sum(0)
= 3 + 2 + 1 + 0 = 6
```

Well done! 🎯

---

## 🧠 Practice Problem 2: Fibonacci Number

### 🔹Problem:

Given `n`, return the `n-th` Fibonacci number.
(Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, ...)

**Formula**:

```
f(0) = 0
f(1) = 1
f(n) = f(n-1) + f(n-2)
```

---

### ✅ Java Code:

```java
public class Fibonacci {
    static int fib(int n) {
        if (n == 0) return 0;       // Base case
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        System.out.println(fib(5)); // Output: 5
    }
}
```

---

### 🔍 Test Yourself:

- What is `fib(4)`?
- How many recursive calls are made in total for `fib(4)`?

Reply with your answer, or type `hint` if you want a little help.
