Perfect 👍 — practicing **digit extraction** is one of the best ways to get strong in DSA.

Here are **small, high-impact questions (easy → medium)** 👇

---

# 🔹 🟢 Level 1 (Basics)

## 1️⃣ Sum of digits

👉 Input: `n = 1234`
👉 Output: `10`

---

## 2️⃣ Count digits

👉 Input: `n = 98765`
👉 Output: `5`

---

## 3️⃣ Reverse a number

👉 Input: `n = 123`
👉 Output: `321`

---

## 4️⃣ Check palindrome number

👉 Input: `121` → true
👉 Input: `123` → false

---

# 🔹 🟡 Level 2 (Important)

## 5️⃣ Product of digits

👉 Input: `n = 234`
👉 Output: `24` (2×3×4)

---

## 6️⃣ Find largest digit

👉 Input: `n = 5832`
👉 Output: `8`

---

## 7️⃣ Sum of squares of digits (same as Happy Number step)

👉 Input: `n = 123`
👉 Output: `14`

---

# 🔹 🔴 Level 3 (Interview Level)

## 8️⃣ Armstrong Number

👉 Example:

- `153 → true`
- `123 → false`

(153 = 1³ + 5³ + 3³)

---

## 9️⃣ Remove a specific digit

👉 Input: `n = 12321`, remove `2`
👉 Output: `131`

---

## 🔟 Check if number contains a digit

👉 Input: `n = 4567`, digit = `5`
👉 Output: true

---

# 🔥 🔑 Common Pattern (Use in ALL)

```java
while (n > 0) {
    int digit = n % 10;  // extract
    // process digit
    n /= 10;             // remove
}
```

---

# 💻 Example Code (Sum of Digits)

```java
public class Main {
    public static void main(String[] args) {
        int n = 1234;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        System.out.println(sum);
    }
}
```

---

# 🧠 Pro Tip for Interviews

Whenever you see:

- “digits”
- “number manipulation”
- “reverse”
- “sum/product”

👉 Immediately think:

```java
n % 10  &  n /= 10
```

---
