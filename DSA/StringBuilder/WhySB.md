**Short answer:** use **`StringBuilder`** when you need to **build or modify strings repeatedly**, especially in loops. It’s faster and uses less memory than regular `String` concatenation.

---

## Why `StringBuilder` exists

In Java, **`String` is immutable**.
That means every time you change a string, Java creates a **new object**.

```java
String s = "Hello";
s = s + " World";  // creates a new String object
```

Do this many times, and you create _lots_ of temporary objects → **slow + memory-heavy**.

`StringBuilder` fixes this by being **mutable**.

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");  // modifies the same object
```

No new objects each time → **much better performance**.

---

## When to use `StringBuilder`

### ✅ Use `StringBuilder` when:

### 1. **String concatenation in loops**

```java
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append(i);
}
String result = sb.toString();
```

❌ Bad:

```java
String s = "";
for (int i = 0; i < 1000; i++) {
    s += i;   // creates 1000+ String objects
}
```

---

### 2. **Building dynamic text**

Examples:

- SQL queries
- JSON / XML
- Logs
- Large formatted messages

```java
StringBuilder query = new StringBuilder();
query.append("SELECT * FROM users ")
     .append("WHERE age > ")
     .append(age);
```

---

### 3. **Frequent insert, delete, or replace operations**

```java
StringBuilder sb = new StringBuilder("Hello World");
sb.insert(6, "Beautiful ");
sb.delete(0, 6);
sb.replace(0, 9, "Hi");
```

---

## When **not** to use `StringBuilder`

### ❌ Don’t use it when:

### 1. **Simple, one-time concatenation**

```java
String s = "Hello" + " " + name;
```

➡️ The compiler optimizes this. No need for `StringBuilder`.

---

### 2. **String never changes**

If the value is constant or rarely modified, use `String`.

---

## `StringBuilder` vs `StringBuffer`

| Feature     | StringBuilder   | StringBuffer   |
| ----------- | --------------- | -------------- |
| Thread-safe | ❌ No           | ✅ Yes         |
| Performance | ✅ Faster       | ❌ Slower      |
| Use case    | Single-threaded | Multi-threaded |

👉 **Rule of thumb:**

- Use **`StringBuilder`** 99% of the time
- Use **`StringBuffer`** only if multiple threads modify the same string

---

## Easy rule to remember 🧠

> **If you’re inside a loop and appending strings → use `StringBuilder`.**

---

## Quick summary

- `String` → immutable, simple, safe
- `StringBuilder` → mutable, fast, efficient
- Use `StringBuilder` for **repeated or dynamic string modifications**

---

Great — let’s go a level deeper. I’ll keep it practical and JVM-real, not academic.

---

# How the JVM treats `String` vs `StringBuilder`

## 1️⃣ Compile-time optimization (`+` is sometimes free)

When you write:

```java
String s = "Hello " + name + "!";
```

The **Java compiler** rewrites this into something like:

```java
String s = new StringBuilder()
    .append("Hello ")
    .append(name)
    .append("!")
    .toString();
```

✅ **This happens ONLY when:**

- Concatenation is in **one expression**
- Not inside a loop
- No reassignment in between

So this is fine:

```java
String s = "A" + "B" + "C";  // optimized at compile time
```

But this is **not**:

```java
String s = "";
for (int i = 0; i < 100; i++) {
    s = s + i;   // cannot be optimized
}
```

---

## 2️⃣ What really happens in a loop (memory-level)

### ❌ Using `String`

Each iteration:

1. Create new `StringBuilder`
2. Copy old string content
3. Append new value
4. Convert to new `String`
5. Old string becomes garbage

That’s **O(n²)** time behavior.

### ✅ Using `StringBuilder`

- Single object
- Internal char array grows occasionally
- **Amortized O(n)** time

This is the big win.

---

## 3️⃣ Real benchmark (simplified)

### Code

```java
int n = 100_000;

// String
long t1 = System.nanoTime();
String s = "";
for (int i = 0; i < n; i++) {
    s += i;
}
long t2 = System.nanoTime();

// StringBuilder
long t3 = System.nanoTime();
StringBuilder sb = new StringBuilder();
for (int i = 0; i < n; i++) {
    sb.append(i);
}
sb.toString();
long t4 = System.nanoTime();

System.out.println("String time: " + (t2 - t1));
System.out.println("Builder time: " + (t4 - t3));
```

### Typical results (varies by JVM)

| Method          | Time          |
| --------------- | ------------- |
| `String`        | ~1500–3000 ms |
| `StringBuilder` | ~20–40 ms     |

👉 **50–100× faster**

---

## 4️⃣ Capacity matters (advanced but useful)

`StringBuilder` grows its internal array like this:

```
newCapacity = oldCapacity * 2 + 2
```

If you roughly know the size, **pre-size it**:

```java
StringBuilder sb = new StringBuilder(10_000);
```

This avoids repeated array copies → faster & less GC.

---

## 5️⃣ `StringBuilder` is NOT thread-safe (and why that’s good)

- No synchronization
- No locking
- Faster

If multiple threads modify the same string:

```java
StringBuffer sb = new StringBuffer(); // synchronized
```

But modern advice:

> Use `StringBuilder` + thread confinement
> (each thread has its own builder)

---

## 6️⃣ Java 9+ detail (compact strings)

Since Java 9:

- Strings use **byte[] instead of char[]** when possible
- Saves memory
- **Does NOT change immutability**
- `StringBuilder` still wins for repeated mutations

So: optimizations improved `String`, but **didn’t eliminate the need** for `StringBuilder`.

---

## 7️⃣ Practical decision table

| Scenario                 | Best choice           |
| ------------------------ | --------------------- |
| Single expression concat | `String`              |
| Loop concat              | `StringBuilder`       |
| Heavy text generation    | `StringBuilder`       |
| Multithread shared text  | `StringBuffer` (rare) |
| Read-only constant       | `String`              |

---

## Mental model (remember this)

> **`String` = value** > **`StringBuilder` = container**

If you’re _building_ something → use a container.

---

If you want next:

- 🔬 GC & memory diagrams
- ⚙️ JIT escape analysis (when builders are optimized away)
- 📊 JMH benchmark setup
- ❓ Interview-style trick questions

Just say the word.
