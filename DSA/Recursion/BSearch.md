#### **Iterative binary** search is better for performance and memory.

#### Recursive is great for understanding divide-and-conquer, but not ideal for very large input sizes in real-world applications.

```java
return binarySearch(arr, mid + 1, high, key); // Right half
```

---

## 🧠 Context: Binary Search Recursion

Suppose we are searching for `key = 18` in this sorted array:

```java
int[] arr = {3, 7, 12, 18, 25, 31};
```

Let’s say our current `mid = 2`, so `arr[mid] = 12`.

Now compare:

### 🔸 Case:

```java
if (arr[mid] < key)
```

That means the **key is in the right half** of the array. So we **ignore the left half**.

---

### 🔹 Why `mid + 1`?

We already checked `arr[mid]` and it's **not equal** to the key.
So we **skip mid** and search only from `mid + 1` to `high`.

---

### 🔍 Example:

- Current array: `{3, 7, 12, 18, 25, 31}`
- `low = 0`, `high = 5`, `key = 18`
- `mid = 2`, `arr[mid] = 12`
- `12 < 18` → go right

🔁 So we call:

```java
binarySearch(arr, mid + 1, high, key)
→ binarySearch(arr, 3, 5, 18)
```

Now we search in `{18, 25, 31}`

---

Would you like me to also explain the **left half case**:

```java
return binarySearch(arr, low, mid - 1, key);
```

or show a **trace diagram** of recursive calls?
