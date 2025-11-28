| Feature     | Subset (Combination)                                         | Subsequence                                                                                              |
| :---------- | :----------------------------------------------------------- | :------------------------------------------------------------------------------------------------------- |
| **Context** | Derived from a mathematical set or array.                    | Derived from a sequential string or list.                                                                |
| **Order**   | Order does not matter. $\{A, B\}$ is the same as $\{B, A\}$. | Order must be maintained. If the original string is "AXB", "AB" is a valid subsequence, but "BA" is not. |

---

# ✅ **1. Subsets (Power Set)**

**Goal:** Generate _all possible combinations_ of elements (order does NOT matter).

### Example

Input:
`arr = [1,2]`
Output subsets:
`[], [1], [2], [1,2]`

### How recursion works

At every index, you have **two choices**:

1. **Include** the element
2. **Exclude** the element

### Java Code (Clean & Standard)

```java
import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        List<List<Integer>> ans = new ArrayList<>();
        generate(0, arr, new ArrayList<>(), ans);
        System.out.println(ans);
    }

    static void generate(int index, int[] arr, List<Integer> current, List<List<Integer>> ans) {
        if (index == arr.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Exclude
        generate(index + 1, arr, current, ans);

        // Include
        current.add(arr[index]);
        generate(index + 1, arr, current, ans);
        current.remove(current.size() - 1); // backtrack
    }
}
```

---

# ✅ **2. Subsequence**

**A subsequence is exactly like subset except order is preserved.**
But logic is identical → include / exclude.

### Example

Input: `"abc"`
Output subsequences:
`"", "a", "b", "c", "ab", "ac", "bc", "abc"`

### Java Code

```java
public class Subsequence {
    public static void main(String[] args) {
        subsequence("", "abc");
    }

    static void subsequence(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        // include
        subsequence(processed + ch, unprocessed.substring(1));

        // exclude
        subsequence(processed, unprocessed.substring(1));
    }
}
```

---

# ✅ **3. String Problems using Recursion**

These follow the same **processed–unprocessed** pattern.

### ⭐ Example 1: Remove all occurrences of a character

Remove `'a'` from `"baccd"` → `"bccd"`

```java
public class RemoveChar {
    public static void main(String[] args) {
        System.out.println(removeChar("baccd", 'a'));
    }

    static String removeChar(String s, char target) {
        if (s.isEmpty()) return "";

        char ch = s.charAt(0);
        if (ch == target) {
            return removeChar(s.substring(1), target);
        } else {
            return ch + removeChar(s.substring(1), target);
        }
    }
}
```

---

### ⭐ Example 2: Skip a word

Input: `"applexyz"` → skip `"apple"` → `"xyz"`

```java
static String skipApple(String s) {
    if (s.isEmpty()) return "";

    if (s.startsWith("apple")) {
        return skipApple(s.substring(5));
    } else {
        return s.charAt(0) + skipApple(s.substring(1));
    }
}
```

---

# ⭐ Differences (Very Important for Interview!)

| Concept              | Order Matters? | Deals with?      | Output Type     |
| -------------------- | -------------- | ---------------- | --------------- |
| **Subset**           | ❌ No          | Numbers / Arrays | Lists           |
| **Subsequence**      | ✔️ Yes         | Strings / Arrays | Strings / Lists |
| **String Recursion** | ✔️ Yes         | Characters       | String          |

---

# ⭐ Key Pattern to Remember

### Always think in 2 choices:

```
at each step:
    include current element
    exclude current element
```

This solves:
✔ Subsets
✔ Subsequences
✔ String include/exclude
✔ Remove characters
✔ Skip words
✔ Generate combinations

---

If you want, I can also give you:
✅ Practice problems (easy → hard)
✅ Dry run of each recursion
✅ Patterns for phone keypad, permutations, combinations, etc.
