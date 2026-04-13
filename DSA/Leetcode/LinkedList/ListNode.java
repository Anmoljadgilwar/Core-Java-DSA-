
//google, microsoft, apple
//https://leetcode.com/problems/reverse-linked-list/
//description: Given the head of a singly linked list, reverse the list, and return the reversed list.
// public class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {
//     }
//     ListNode(int val) {
//         this.val = val;
//     }
//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }
// }
class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // store next
            curr.next = prev;     // reverse link
            prev = curr;          // move prev
            curr = next;          // move curr
        }

        return prev;
    }
}

/*
This is a classic **linked list reversal** problem 🔁. Let’s break it down in a way that makes it crystal clear.

---

## 🧠 What the code does

It **reverses a singly linked list**.

👉 Example:

```
Original: 1 → 2 → 3 → 4 → null
Reversed: 4 → 3 → 2 → 1 → null
```

---

## 🔑 Key Idea

We **change the direction of pointers** one by one.

Instead of:

```
curr → next
```

We make it:

```
curr → prev
```

---

## 🧩 Step-by-step Explanation

### 🔹 Initial Setup

```java
ListNode prev = null;
ListNode curr = head;
```

* `prev` → will become the **new head**
* `curr` → used to traverse the list

---

### 🔁 While Loop

```java
while (curr != null)
```

We iterate until the list ends.

---

### 🔹 Step 1: Save next node

```java
ListNode next = curr.next;
```

⚠️ Important!
We store `next` because we are about to break the link.

---

### 🔹 Step 2: Reverse the pointer

```java
curr.next = prev;
```

This is the **core step** 💥

👉 We reverse the link:

```
Before: curr → next
After:  curr → prev
```

---

### 🔹 Step 3: Move prev forward

```java
prev = curr;
```

Now `prev` becomes the current node.

---

### 🔹 Step 4: Move curr forward

```java
curr = next;
```

Continue traversal using saved `next`.

---

## 🔄 Visual Walkthrough

Let’s take:

```
1 → 2 → 3 → null
```

### Iteration 1:

* curr = 1
* reverse → `1 → null`
* prev = 1

### Iteration 2:

* curr = 2
* reverse → `2 → 1`
* prev = 2

### Iteration 3:

* curr = 3
* reverse → `3 → 2 → 1`
* prev = 3

---

## 🏁 Final Return

```java
return prev;
```

👉 `prev` is now the **new head** of reversed list.

---

## ⏱️ Complexity

* **Time:** O(n) → traverse once
* **Space:** O(1) → no extra memory

---

## 💡 Why this works

We are basically:

* Breaking original links
* Rebuilding them in reverse order
* Keeping track of previous nodes

---

## ⚡ Pro Tip (for interviews)

If asked:

* Recursive version → also possible
* Edge case → empty list (`head == null`) already handled

---

If you want, I can also:

* Show **dry run with diagram visuals**
* Give **recursive version**
* Or explain how this appears in real interview questions 🚀

 */
