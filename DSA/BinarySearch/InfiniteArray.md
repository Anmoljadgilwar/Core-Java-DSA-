To find the position of an element in a **sorted infinite array**, the challenge is that we don’t know the size of the array. So, we can’t apply a direct binary search. The solution here uses a combination of **exponential search** and **binary search** to find the element efficiently.

### Explanation

1. **Range Expansion:**

   - Start with a small range (box) of size 2 (`start = 0`, `end = 1`).
   - If the target element is **greater than `arr[end]`**, double the range size.
   - Update the start and end pointers:
     - `newStart = end + 1`
     - `end = end + (end - start + 1) * 2` (effectively doubling the range size).
   - Repeat this process until `arr[end]` is greater than or equal to the target.

2. **Binary Search:**
   - Once the range is determined, perform a binary search within the identified range.
   - Calculate the middle index as:
     ```java
     int mid = start + (end - start) / 2;
     ```
   - Compare the middle element with the target:
     - If the target is smaller, move `end` to `mid - 1`.
     - If the target is larger, move `start` to `mid + 1`.
     - If equal, return the index.

### Why Range Expansion?

- In an infinite array, we can’t directly calculate the length. So, we progressively expand the range to include the target element.
- Doubling the range size helps reduce the time complexity significantly, making it **O(log n)**.

---

### Example Run:

1. **Range Finding:**

   - Initial: `start = 0`, `end = 1`.
   - If `arr[end]` (2) is greater than or equal to the target (2), stop.
   - In this case, the range is correct on the first try.

2. **Binary Search:**
   - `mid = 0 + (1 - 0) / 2 = 0`.
   - `arr[mid]` (1) is less than the target, so update `start = mid + 1`.
   - Now, `mid = 1 + (1 - 1) / 2 = 1`.
   - `arr[mid]` (2) equals the target, so return `mid = 1`.

---

### Output:

The output of the program will be:

```
1
```

Since the target value `2` is found at index `1`.
