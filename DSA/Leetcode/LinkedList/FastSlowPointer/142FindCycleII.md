Perfect! Let’s solve **LeetCode 142 — Linked List Cycle II**.

---

## 🎯 Problem: Find the **start of the cycle** in a linked list

You already know how to detect if a cycle exists (from LeetCode 141).  
Now, you need to **return the node where the cycle begins** — not just `true/false`.

---

## ✅ Example

```text
Input: 3 → 2 → 0 → -4 → (back to 2)
                ↑       |
                └───────┘

Output: Node with value 2 (the start of the cycle)
```

---

## 🧠 How to Solve It — Floyd’s Algorithm (Extended)

We’ll use the **same two-pointer technique**, but now we’ll **find the exact starting node** of the cycle.

---

### Step 1: Detect Cycle (Same as LeetCode 141)

Use `slow` and `fast` pointers until they **meet inside the cycle**.

```java
ListNode slow = head, fast = head;

while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
    if (slow == fast) break; // they met → cycle exists
}
```

If they **never meet**, return `null`.

---

### Step 2: Find the Start of the Cycle

Here’s the **magic trick**:

> Once `slow` and `fast` meet, reset `slow` to `head`.  
> Then move **both pointers one step at a time**.  
> They will meet again — **at the start of the cycle!**

```java
slow = head;  // reset slow to head
while (slow != fast) {
    slow = slow.next;
    fast = fast.next;
}
return slow; // this is the start of the cycle
```

---

## 🧪 Why Does This Work?

Let’s say:
- Distance from `head` to start of cycle = `a`
- Distance from start of cycle to meeting point = `b`
- Distance from meeting point back to start of cycle = `c`

When they meet:
- `slow` traveled: `a + b`
- `fast` traveled: `a + b + c + b` = `a + 2b + c`

Since `fast` moves 2x faster:
> `2(a + b) = a + 2b + c`  
> → `2a + 2b = a + 2b + c`  
> → `a = c`

✅ So, the distance from **head to cycle start** = distance from **meeting point to cycle start**!

That’s why resetting `slow` to `head` and moving both one step at a time makes them meet at the **cycle start**.

---

## ✅ Full Java Solution

```java
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head, fast = head;

        // Step 1: Find meeting point
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }

        // No cycle found
        if (fast == null || fast.next == null) return null;

        // Step 2: Find start of cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow; // start of cycle
    }
}
```

---

## 📊 Complexity

| | |
|---|---|
| **Time** | O(n) — two passes |
| **Space** | O(1) — only two pointers |

---

## 💡 Pro Tip

This is a **classic interview question** — interviewers love to ask “why does resetting slow to head work?”  
Now you know the math behind it! 🎉

---

Want to walk through a dry run with an example? Just say the word!