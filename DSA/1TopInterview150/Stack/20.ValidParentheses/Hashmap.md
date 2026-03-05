# 🚀 2) Optimized Version Using HashMap

### 💡 Why HashMap?

Instead of multiple `if` checks, we store matching pairs in a map.

This makes:

- Code cleaner
- Easier to extend
- More readable

---

### 💻 Optimized Java Code

```java
import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // If closing bracket
            if (map.containsKey(ch)) {

                if (stack.isEmpty() || stack.pop() != map.get(ch)) {
                    return false;
                }

            } else {
                // Opening bracket
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }
}
```

---

# 🧠 Why This Version is Better?

Instead of:

```java
if ((ch == ')' && top != '(') ||
    (ch == '}' && top != '{') ||
    (ch == ']' && top != '['))
```

We just do:

```java
stack.pop() != map.get(ch)
```

Cleaner ✅
More scalable ✅
Interview-friendly ✅

---

# 🎯 Interview Tip

Many interviewers prefer using:

```java
Deque<Character> stack = new ArrayDeque<>();
```

Instead of `Stack` because:

- `Stack` is legacy
- `ArrayDeque` is faster

If you want, I can show the **most optimal industry-style version using Deque** next 🔥
