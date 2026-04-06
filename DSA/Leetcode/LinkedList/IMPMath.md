Got it 👍 — let’s break this **very simply step-by-step**.

You’re asking about this part:

```java
int digit = n % 10;
sum += digit * digit;
n /= 10;
```

---

# 🔹 What This Code Does

👉 It **extracts each digit of a number** and adds its **square** to `sum`.

---

# 🔍 Step-by-Step Explanation

Assume:

```java
n = 123
sum = 0
```

---

## 1️⃣ `int digit = n % 10;`

👉 `% 10` gives the **last digit**

```java
digit = 123 % 10 = 3
```

---

## 2️⃣ `sum += digit * digit;`

👉 Add square of digit

```java
sum = 0 + (3 * 3) = 9
```

---

## 3️⃣ `n /= 10;`

👉 Remove last digit

```java
n = 123 / 10 = 12
```

(integer division removes decimal part)

---

# 🔁 Loop Continues

Now:

```java
n = 12
```

### Next iteration:

```java
digit = 12 % 10 = 2
sum = 9 + 4 = 13
n = 12 / 10 = 1
```

---

### Next iteration:

```java
digit = 1 % 10 = 1
sum = 13 + 1 = 14
n = 1 / 10 = 0
```

---

# 🔚 Final Result

```java
sum = 14
```

👉 Which is:

```text
1² + 2² + 3² = 14
```

---

# 🔥 Simple Understanding

| Line            | Meaning           |
| --------------- | ----------------- |
| `n % 10`        | Get last digit    |
| `digit * digit` | Square it         |
| `n /= 10`       | Remove last digit |

---

# 🧠 Trick to Remember

👉
**“Take last digit → use it → remove it → repeat”**

---

# 🔹 Visual Flow

```text
123
 ↓
3² = 9
 ↓
12
 ↓
2² = 4
 ↓
1
 ↓
1² = 1
```

Total = **14**

---

If you want, I can:
✅ Show how this pattern is used in many problems (very common in DSA)
✅ Give you practice questions based on digit extraction
✅ Or convert this into a reusable utility function

Just tell 👍
