### **`Arrays.toString()` in Java**

`Arrays.toString()` is a static method from the `java.util.Arrays` class that converts an array into a human-readable `String` representation.

### **Syntax:**

```java
public static String toString(dataType[] array)
```

- **Parameter:** `array` – The array to be converted into a string.
- **Return:** A string representing the array elements enclosed in square brackets (`[]`), separated by commas.

### **Example:**

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(numbers));
    }
}
```

### **Output:**

```
[10, 20, 30, 40, 50]
```

### **Key Points:**

1. Works for **primitive** and **object** arrays.
2. Helps in **debugging** by providing a readable format.
3. If the array is `null`, it returns `"null"`.
4. Does **not** work for **multi-dimensional arrays**. Use `Arrays.deepToString()` for that.

### **Example with Strings:**

```java
String[] words = {"Hello", "World"};
System.out.println(Arrays.toString(words));
```

**Output:**

```
[Hello, World]
```

Let me know if you need more details! 🚀
