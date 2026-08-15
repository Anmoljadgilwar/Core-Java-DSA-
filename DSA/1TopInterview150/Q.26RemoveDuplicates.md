This is a classic beginner problem from LeetCode called **"Remove Duplicates from Sorted Array"**.

### 🧠 The Concept (Explained for a Noob)

Imagine you have a line of students sorted by height:
`[1, 1, 2, 3, 3, 3, 4]`

The teacher wants to make a list of **unique** heights.
- The first `1` is unique.
- The second `1` is a duplicate (skip it).
- The `2` is unique.
- The `3`s are duplicates (skip the extra ones).

**The Goal:**
You need to modify the line **in-place** (without creating a new line of students). You just need to move the unique students to the front and tell the teacher how many unique students there are.

**The Rules:**
1. The array is already **sorted** (this is crucial!).
2. You cannot use extra space (no new arrays).
3. Return the count of unique numbers (`k`).
4. The first `k` numbers in the array must be the unique ones. What happens after that doesn't matter.

**Visualizing the Solution:**
Think of it like a game of "Keep the New, Skip the Old."
- You have a **slow pointer** (let's call it `writeIndex`) that marks where the next *unique* number should go.
- You have a **fast pointer** (let's call it `readIndex`) that scans through the array looking for new numbers.

| Step | Array State | `readIndex` sees | Action | `writeIndex` moves to |
| :--- | :--- | :--- | :--- :--- |
| 0 | `[1, 1, 2, ...]` | 1 (start) | Keep it. | 1 |
| 1 | `[1, 1, 2, ...]` | 1 | Same as previous. Skip. | (stays at 1) |
| 2 | `[1, 1, 2, ...]` | 2 | Different! Move `writeIndex` to 2, put 2 there. | 2 |

Result: `[1, 2, 2, ...]` (The first 2 numbers are `1, 2`. Count = 2).

---

### 💻 The Solution (Java)

Since the code snippet in your text is in Java, here is the complete solution.

**The Logic:**
1. If the array is empty, return 0.
2. Start `writeIndex` at 1 (because the first element is always unique).
3. Loop through the array starting from index 1 (`readIndex`).
4. If the current number is **different** from the one before it, it's unique!
   - Place it at `writeIndex`.
   - Increment `writeIndex`.
5. Return `writeIndex` as the count.

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: if array is empty or null
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // 'writeIndex' points to the position where the next unique element should go.
        // We start at 1 because the first element (index 0) is always unique.
        int writeIndex = 1;

        // 'readIndex' scans through the array starting from the second element.
        for (int readIndex = 1; readIndex < nums.length; readIndex++) {
            
            // Compare current element with the previous one.
            // Since the array is sorted, duplicates are always next to each other.
            if (nums[readIndex] != nums[readIndex - 1]) {
                // Found a new unique number!
                // Place it at the writeIndex position.
                nums[writeIndex] = nums[readIndex];
                
                // Move the write pointer forward for the next unique number.
                writeIndex++;
            }
        }

        // The value of writeIndex represents the count of unique elements.
        return writeIndex;
    }
}
```

### 🚀 How it works with Example 1: `[1, 1, 2]`

1. **Start**: `writeIndex` = 1.
2. **Loop** `readIndex` = 1:
   - `nums[1]` (1) is equal to `nums[0]` (1).
   - Do nothing.
3. **Loop** `readIndex` = 2:
   - `nums[2]` (2) is **not** equal to `nums[1]` (1).
   - It's unique!
   - Set `nums[1]` = 2. Array becomes `[1, 2, 2]`.
   - Increment `writeIndex` to 2.
4. **End Loop**. Return `writeIndex` (2).

The array now looks like `[1, 2, 2]`. The first **2** elements are the unique ones (`1, 2`). The rest is garbage, but the problem says we don't care about that.

### ⏱️ Complexity
- **Time**: O(n) — We only pass through the array once.
- **Space**: O(1) — We didn't create any new arrays; we just used two variables (`writeIndex` and `readIndex`).

