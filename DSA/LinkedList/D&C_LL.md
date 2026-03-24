Nice choice 🔥 these are **important variations** — let’s learn them fast but clearly.

---

# 🔁 1. Doubly Linked List (DLL)

## 🧠 Idea

Each node has **2 pointers**:

- `prev` 👈
- `next` 👉

So you can go **forward + backward**

---

## 🔗 Structure

```
null ← 10 ⇄ 20 ⇄ 30 → null
```

---

## 💻 Node Structure in Java

```java
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
```

---

## ⚡ Key Advantage

👉 You can traverse **both directions**

---

## 🤔 Your Turn

If you are at node `20`:

```
10 ⇄ 20 ⇄ 30
```

👉 How will you go to `10`?

(Which pointer?) 👇

---

# 🔄 2. Circular Linked List (CLL)

## 🧠 Idea

👉 Last node **does NOT point to null**

👉 It points back to **head**

---

## 🔗 Structure

```
10 → 20 → 30
 ↑         ↓
 └─────────┘
```

---

## ⚡ Key Property

👉 No `null` in list ❌
👉 Infinite loop possible ⚠️ (careful while traversing)

---

## 💻 Example Creation

```java
Node head = new Node(10);
Node second = new Node(20);
Node third = new Node(30);

head.next = second;
second.next = third;
third.next = head; // important
```

---

## 🤔 Your Turn

In circular list:

👉 How do you know you have completed one full traversal?

(Hint: compare with something 👀)
Great 👍 I’ll give you **clean, interview-ready code** with comments — but stay active with me 👀
I’ll pause once to check your understanding.

---

# 🔁 Doubly Linked List (Java)

```java
class DoublyLinkedList {

    // Node structure
    static class Node {
        int data;
        Node prev; // points to previous node
        Node next; // points to next node

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Link new node with current head
        newNode.next = head;
        head.prev = newNode;

        // Move head to new node
        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        // Traverse to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Attach new node
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Print forward
    void printForward() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
```

---

## 🧠 Quick Check (important)

In DLL insertion at beginning:

```java
newNode.next = head;
head.prev = newNode;
```

👉 Why do we update **both pointers**?

(Answer in one line 👇)

---

# 🔄 Circular Linked List (Java)

```java
class CircularLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert at end
    void insert(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            newNode.next = head; // point to itself
            return;
        }

        Node temp = head;

        // Traverse until last node (whose next is head)
        while (temp.next != head) {
            temp = temp.next;
        }

        // Insert new node at end
        temp.next = newNode;
        newNode.next = head; // maintain circular link
    }

    // Print circular list
    void printList() {
        if (head == null) return;

        Node temp = head;

        do {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        } while (temp != head); // stop when back to head

        System.out.println("(back to head)");
    }
}
```

---

## 🧠 Key Concept (very important)

👉 In circular list:

```java
while (temp.next != head)
```

👉 NOT `temp.next != null`

---

## 🎯 Your Turn (last check)

In circular traversal:

```java
while (temp != head)
```

❌ Why is this WRONG for starting node?

(Hint: think about first iteration 👀)
