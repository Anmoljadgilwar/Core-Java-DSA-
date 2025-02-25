In Java, **access modifiers** control the visibility and accessibility of classes, methods, and variables. There are four types:

### 1. **Public** (`public`)

- Accessible from **anywhere** (within the same class, package, or outside the package).
- Example:
  ```java
  public class Example {
      public int x = 10;  // Accessible everywhere
  }
  ```

### 2. **Private** (`private`)

- Accessible **only within the same class**.
- Not accessible from subclasses or other classes.
- Example:
  ```java
  class Example {
      private int x = 10;  // Only accessible inside this class
  }
  ```

### 3. **Protected** (`protected`)

- Accessible within the **same package** and by **subclasses** (even if they are in different packages).
- Example:
  ```java
  class Example {
      protected int x = 10;  // Accessible within package & subclasses
  }
  ```

### 4. **Default (Package-Private)** _(No Modifier)_

- Accessible **only within the same package**.
- Example:
  ```java
  class Example {
      int x = 10;  // Default access (package-private)
  }
  ```

### **Access Modifier Scope Summary**

| Modifier    | Same Class | Same Package | Subclass (Different Package) | Other Packages |
| ----------- | ---------- | ------------ | ---------------------------- | -------------- |
| `public`    | ✅         | ✅           | ✅                           | ✅             |
| `protected` | ✅         | ✅           | ✅                           | ❌             |
| (default)   | ✅         | ✅           | ❌                           | ❌             |
| `private`   | ✅         | ❌           | ❌                           | ❌             |
