Let’s break this program step by step in **very simple language** 👇

---

### 🧩 What the program does

It **prints a triangle pattern** like this:

```
****
***
**
*
```

---

### 🧠 Understanding the logic

#### Step 1: Starting point

The program starts from:

```java
triangle(4, 0);
```

So initially:

- `r = 4` → total rows
- `c = 0` → current column

---

### 🧩 The function: `triangle(r, c)`

```java
static void triangle(int r, int c) {
    if (r == 0) {
        return;
    }
```

➡️ If `r` becomes `0`, stop (base condition of recursion).

---

### 🔁 Case 1: `c < r`

```java
if (c < r) {
    System.out.print("*");
    triangle(r, c + 1);
}
```

➡️ When column is smaller than row:

- Print a star (`*`)
- Call the function again with `c + 1` (next column)

So it keeps printing stars in the same line until `c` reaches `r`.

---

### 🔁 Case 2: `c == r`

```java
else {
    System.out.println();
    triangle(r - 1, 0);
}
```

➡️ When columns are done:

- Move to **next line** (`println()`)
- Call the function again with **one less row** (`r - 1`)
  and reset column to `0`.

---

### ⚙️ Step-by-step example

#### 1️⃣ Call: `triangle(4, 0)`

→ prints `****` (because `c` goes 0→1→2→3)
then moves to next line and calls `triangle(3, 0)`

#### 2️⃣ Call: `triangle(3, 0)`

→ prints `***`
then calls `triangle(2, 0)`

#### 3️⃣ Call: `triangle(2, 0)`

→ prints `**`
then calls `triangle(1, 0)`

#### 4️⃣ Call: `triangle(1, 0)`

→ prints `*`
then calls `triangle(0, 0)` → stops (base case)

---

### 🧾 Output

```
****
***
**
*
```

---

### 🧠 Simple Summary

- `r` → how many rows left
- `c` → how many stars printed in current row
- `if (c < r)` → print stars
- `else` → move to next line and decrease row
- Recursion repeats until `r` becomes 0

---

Would you like me to also explain how to reverse this pattern (print from 1 star to 4 stars)?
