Insertion in a **Singly Linked List** means adding a new node at a specific position. There are **3 main types of insertion** you should know for interviews:

---

# 🔹 1. Insertion at Beginning

👉 New node becomes the first node.

### Steps:

1. Create a new node.
2. Point new node’s `next` to current head.
3. Update head to new node.

### Java Code:

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
}
```

---

# 🔹 2. Insertion at End

👉 New node becomes the last node.

### Steps:

1. Create a new node.
2. Traverse till last node.
3. Set last node’s `next` to new node.

### Java Code:

```java
void insertAtEnd(int data) {
    Node newNode = new Node(data);

    if (head == null) {
        head = newNode;
        return;
    }

    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }

    temp.next = newNode;
}
```

---

# 🔹 3. Insertion at Specific Position

👉 Insert at given index (like position = 2)

### Steps:

1. Traverse to (position - 1) node.
2. Adjust pointers:
   - newNode.next = temp.next
   - temp.next = newNode

### Java Code:

```java
void insertAtPosition(int data, int pos) {
    Node newNode = new Node(data);

    if (pos == 0) {
        newNode.next = head;
        head = newNode;
        return;
    }

    Node temp = head;
    for (int i = 0; i < pos - 1 && temp != null; i++) {
        temp = temp.next;
    }

    if (temp == null) {
        System.out.println("Invalid position");
        return;
    }

    newNode.next = temp.next;
    temp.next = newNode;
}
```

---

# 🔹 Dry Run Example

Initial list:

```
10 → 20 → 30
```

Insert `15` at position 1:

```
10 → 15 → 20 → 30
```

---

# 🔹 Time Complexity

- Beginning → **O(1)**
- End → **O(n)**
- Position → **O(n)**

---

# 🔹 Important Interview Tips

- Always handle **edge cases**:
  - Empty list
  - Position = 0
  - Position > length

- Be careful with **null pointers**
- Practice pointer changes (most common mistakes happen here)

---
