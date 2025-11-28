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

##

> Quick Sort is fast, efficient, and widely used — especially when average performance matters.
> But pivot selection is crucial to avoid worst-case behavior.

---

let’s break down the **logic of this QuickSort implementation step by step** so you can clearly see how it works.

---

## 🔑 Key Idea of QuickSort

QuickSort is a **divide-and-conquer algorithm**:

1. Pick a **pivot** element.
2. Partition the array so that:
   - Elements smaller than pivot go to the left.
   - Elements larger than pivot go to the right.
3. Recursively apply the same logic to the left and right halves.

---

## 🧩 Code Walkthrough

### 1. Base Case

```java
if (low >= high) {
    return;
}
```

- If the subarray has **0 or 1 element**, it’s already sorted → stop recursion.

---

### 2. Setup

```java
int start = low;
int end = high;
int mid = start + (end - start) / 2;
int pivot = nums[mid];
```

- `start` and `end` are pointers scanning the array.
- Pivot is chosen as the **middle element** (`nums[mid]`).

---

### 3. Partitioning Loop

```java
while (end >= start) {
    while (pivot > nums[start]) {
        start++;
    }
    while (pivot < nums[end]) {
        end--;
    }

    if (end >= start) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}
```

- **Inner while loops** move `start` forward until it finds a value ≥ pivot, and move `end` backward until it finds a value ≤ pivot.
- If `start <= end`, swap those two values → ensures left side has smaller values and right side has larger values.
- After swapping, move both pointers inward.

👉 This is the **partition step**: it rearranges elements around the pivot.

---

### 4. Recursive Calls

```java
sort(nums, low, end);
sort(nums, start, high);
```

- After partitioning, the pivot is in its correct position.
- Recursively sort the **left half** (`low → end`) and the **right half** (`start → high`).

---

## 📊 Complexity

- **Average case:** \(O(n \log n)\) → efficient for most inputs.
- **Worst case:** \(O(n^2)\) → happens if pivot choice is poor (e.g., always smallest or largest element in sorted arrays).

---

## 🖼 Example Run

Input: `{2, 4, 1, 5, 3}`

- Pivot = middle element = `1` (first call).
- Partition → `{1, 2, 4, 5, 3}` (pivot `1` placed correctly).
- Recursively sort left `{}` and right `{2, 4, 5, 3}`.
- Continue until fully sorted → `{1, 2, 3, 4, 5}`.

---

✅ So the code is a **standard QuickSort** with a **middle-element pivot** and **two-pointer partitioning**.

---

Would you like me to **draw a step-by-step dry run table** for your input `{2, 4, 1, 5, 3}` so you can visually see how the array changes at each partition?
