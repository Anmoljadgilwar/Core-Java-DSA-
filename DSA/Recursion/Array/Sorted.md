Great one 👍 Let’s go line by line and understand the **recursion logic** in your `Sorted` program.

---

### 📝 Code

```java
public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 4, 5};
        System.out.println(sorted(arr, 0));
    }

    public static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}
```

---

### 🔎 Step-by-step explanation

#### **1. Base case**

```java
if (index == arr.length - 1) {
    return true;
}
```

- If we reach the **last element**, there’s nothing left to compare.
- So the array is **sorted up to here** → return `true`.

---

#### **2. Recursive check**

```java
return arr[index] < arr[index + 1] && sorted(arr, index + 1);
```

- First, check if the **current element** is smaller than the **next element**:

  ```java
  arr[index] < arr[index + 1]
  ```

  If this fails, the array is not sorted → return `false`.

- If it passes, then check the **rest of the array**:

  ```java
  sorted(arr, index + 1)
  ```

  (recursive call with the next index).

- The `&&` ensures **both must be true**:

  - Current pair is in order.
  - Rest of the array is sorted.

---

### 🧩 Dry run with your input: `{1, 4, 3, 4, 5}`

Call: `sorted(arr, 0)`

- Compare `arr[0] = 1` and `arr[1] = 4` → `1 < 4 ✅`
  → go deeper: `sorted(arr, 1)`

Call: `sorted(arr, 1)`

- Compare `arr[1] = 4` and `arr[2] = 3` → `4 < 3 ❌`
  → returns `false` immediately.

No need to check further, the array is **not sorted**.

Output:

```
false
```

---

### ✅ Key Recursion Idea

- At each step, check **one pair** (`arr[index] < arr[index+1]`).
- If that’s fine, **trust recursion** to check the rest.
- Base case stops when we hit the last element.

---

Would you like me to also show the **call stack expansion** (like a tree of recursive calls showing `index` values)? That makes recursion much easier to visualize.
