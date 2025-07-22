### ✅ Statement 1:

```java
String a2 = "Hello";
```

- **What it does:**
  This uses **string literal**. The string `"Hello"` is stored in the **String Constant Pool (SCP)**.

- **Behavior:**
  If `"Hello"` already exists in the SCP, Java **reuses the same object**.

- **Memory Efficient:**
  It avoids creating duplicate `"Hello"` objects.

---

### ✅ Statement 2:

```java
String s2 = new String("Helloji");
```

- **What it does:**
  This creates a **new String object** in the **heap memory**, even if `"Helloji"` is already present in the SCP.

- **Behavior:**
  The literal `"Helloji"` is stored in the SCP, but the `new String(...)` explicitly tells Java to create a new **object** in the heap with the same value.

- **Less Efficient:**
  It creates **two objects**: one in SCP and one in the heap.

---

### 🔍 Summary Table:

| Statement                            | Memory Used         | Object Reuse  | Location    |
| ------------------------------------ | ------------------- | ------------- | ----------- |
| `String a2 = "Hello";`               | 1 object in SCP     | Yes           | String Pool |
| `String s2 = new String("Helloji");` | 1 in SCP, 1 in heap | No (heap new) | SCP + Heap  |

Let me know if you want to compare using `.equals()` or `==` too.

## methods

.setCharAt() //str.setCharAt(0, A)
.insert() // sb.insert(4, "Krusn");
.delete() //sb.delete(0, 4);
.append() //.append("Yadav")

.length()
.charAt(i)
.compareTo() //str1.compareTo(str2)
