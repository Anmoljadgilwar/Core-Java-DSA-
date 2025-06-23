Sure! Let's walk through the **Insertion Sort** algorithm step-by-step using an example.

---

## 🧩 Example Array:

```java
int[] arr = {9, 5, 1, 4, 3};
```

We’ll sort this array using **insertion sort**.

---

## 🔄 Step-by-Step Explanation:

### Initial Array:

```
[9, 5, 1, 4, 3]
```

---

### ✅ Step 1: i = 1, current = 5

Compare `5` with elements to its left.

- Is `5 < 9`? ✅ Yes → Shift `9` right.
- Insert `5` at the correct position.

**Result:**

```
[5, 9, 1, 4, 3]
```

---

### ✅ Step 2: i = 2, current = 1

Compare `1` with elements to its left.

- `1 < 9` → Shift `9`
- `1 < 5` → Shift `5`
- Insert `1` at the correct position.

**Result:**

```
[1, 5, 9, 4, 3]
```

---

### ✅ Step 3: i = 3, current = 4

Compare `4` with elements to its left.

- `4 < 9` → Shift `9`
- `4 < 5` → Shift `5`
- `4 > 1` → Stop shifting
- Insert `4` at the correct position.

**Result:**

```
[1, 4, 5, 9, 3]
```

---

### ✅ Step 4: i = 4, current = 3

Compare `3` with elements to its left.

- `3 < 9` → Shift `9`
- `3 < 5` → Shift `5`
- `3 < 4` → Shift `4`
- `3 > 1` → Stop shifting
- Insert `3` at the correct position.

**Result:**

```
[1, 3, 4, 5, 9]
```

---

## 🎉 Final Sorted Array:

```
[1, 3, 4, 5, 9]
```

---

## 🧠 Summary:

- Insertion sort builds the sorted array one element at a time.
- It compares the current element with the sorted part of the array and inserts it into the correct position.
- Efficient for small or nearly sorted arrays.
- **Time Complexity:**

  - Worst case: O(n²)
  - Best case (already sorted): O(n)

Let me know if you’d like a visual diagram or animation-style walkthrough!
