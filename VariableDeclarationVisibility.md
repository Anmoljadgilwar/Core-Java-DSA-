### **Variable Visibility in Java**

Variable visibility in Java is determined by **scope** and **access modifiers**. It defines where a variable can be accessed within a program.

---

### **1. Types of Variable Scope (Visibility)**

#### **a) Class Scope (Instance & Static Variables)**

- Declared **inside a class but outside methods/constructors**.
- Visibility depends on **access modifiers** (`private`, `default`, `protected`, `public`).

```java
class Example {
    private int privateVar = 10; // Visible only inside this class
    public int publicVar = 20;   // Visible everywhere

    void display() {
        System.out.println(privateVar); // ✅ Accessible inside the same class
    }
}
```

🔹 **Instance variables** (without `static`) belong to an object and are accessed via an instance.  
🔹 **Static variables** (with `static`) belong to the class and can be accessed without creating an instance.

---

#### **b) Method Scope**

- Declared inside a method and accessible **only within that method**.
- Destroyed when the method finishes execution.

```java
class Example {
    void show() {
        int localVar = 30; // Visible only inside this method
        System.out.println(localVar);
    }
    // System.out.println(localVar); // ❌ Error: Not visible outside `show()`
}
```

---

#### **c) Block Scope**

- Variables declared inside a **block `{}`** are visible **only within that block**.
- Common in loops and conditional statements.

```java
class Example {
    public static void main(String[] args) {
        if (true) {
            int blockVar = 40;
            System.out.println(blockVar); // ✅ Visible inside block
        }
        // System.out.println(blockVar); // ❌ Error: Not visible outside block
    }
}
```

---

### **2. Effect of Access Modifiers on Visibility**

| Modifier                  | Same Class | Same Package | Subclass (Different Package) | Other Classes |
| ------------------------- | ---------- | ------------ | ---------------------------- | ------------- |
| **private**               | ✅         | ❌           | ❌                           | ❌            |
| **default** (no modifier) | ✅         | ✅           | ❌                           | ❌            |
| **protected**             | ✅         | ✅           | ✅                           | ❌            |
| **public**                | ✅         | ✅           | ✅                           | ✅            |

---

### **Example Demonstrating Visibility**

```java
package mypackage;

public class Parent {
    private int privateVar = 1;
    int defaultVar = 2;
    protected int protectedVar = 3;
    public int publicVar = 4;

    void show() {
        System.out.println(privateVar);  // ✅ Visible inside class
        System.out.println(defaultVar);  // ✅ Visible inside class
        System.out.println(protectedVar);// ✅ Visible inside class
        System.out.println(publicVar);   // ✅ Visible inside class
    }
}

class Child extends Parent {
    void show() {
        // System.out.println(privateVar);  // ❌ Not accessible
        System.out.println(defaultVar);  // ✅ Accessible (same package)
        System.out.println(protectedVar);// ✅ Accessible (inherited)
        System.out.println(publicVar);   // ✅ Accessible (public)
    }
}
```

🚀
