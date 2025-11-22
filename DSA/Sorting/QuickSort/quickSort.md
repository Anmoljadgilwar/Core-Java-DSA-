Quick Sort (or Quicksort) is a **divide-and-conquer** sorting algorithm known for its efficiency in practice.

---

### ⭐ How Quick Sort Works

1. **Pick a Pivot**

   - Choose an element from the array (e.g., first, last, middle, or a random element).

2. **Partition**

   - Reorder the array so that:

     - Elements **less than pivot** go to the left
     - Elements **greater than pivot** go to the right

   - The pivot ends up in its correct sorted position.

3. **Recursively Apply**

   - Apply the same steps to the left and right partitions until sorted.

---

### Example

Array → `[8, 3, 1, 7, 0, 10, 2]`

Pick pivot = `7`
Partition → `[3, 1, 0, 2] | 7 | [8, 10]`
Then recursively sort each side.

---

### ⏱️ Time Complexity

| Case             | Scenario                                                                 | Complexity     |
| ---------------- | ------------------------------------------------------------------------ | -------------- |
| **Best Case**    | Pivot splits array evenly                                                | **O(n log n)** |
| **Average Case** | Random pivot selection                                                   | **O(n log n)** |
| **Worst Case**   | Pivot always smallest/largest (e.g., sorted array + bad pivot selection) | **O(n²)**      |

Where:

- `n` = number of elements
- log n arises from recursively splitting into halves

---

### 🧠 Space Complexity

- **O(log n)** (due to recursion stack)
- Can be **O(n)** in the worst case if recursion is very unbalanced

---

### ✔️ Pros & Cons

| Pros                            | Cons                       |
| ------------------------------- | -------------------------- |
| Very fast in practice           | Worst case O(n²)           |
| In-place (low memory)           | Partitioning can be tricky |
| Performs well on large datasets | Sensitive to pivot choice  |

---

### 🔹 Pivot Selection Strategies

To avoid bad splits:

- Random pivot: helps achieve O(n log n) average behavior
- Median-of-three: choose median of `first`, `middle`, `last`

---

### Summary

> Quick Sort is fast, efficient, and widely used — especially when average performance matters.
> But pivot selection is crucial to avoid worst-case behavior.

---
