Encapsulation in Java is a fundamental **object-oriented programming (OOP)** principle that restricts direct access to an object's data and only allows controlled access through methods. It helps in **data hiding** and **data security**.

### **Key Features of Encapsulation**:

1. **Private Fields** – Instance variables are declared as `private` to prevent direct access.
2. **Public Getter and Setter Methods** – Methods like `getX()` and `setX(value)` allow controlled access.
3. **Data Hiding** – Internal implementation details are hidden from the user.
4. **Improved Maintainability** – Changes to implementation do not affect external code.

### **Example: Encapsulation in Java**

```java
class Person {
    private String name; // Private variable

    // Public getter method
    public String getName() {
        return name;
    }

    // Public setter method
    public void setName(String newName) {
        name = newName;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alice");  // Setting value using setter
        System.out.println(p.getName()); // Accessing value using getter
    }
}
```

### **Benefits of Encapsulation**:

✔ Prevents direct modification of data  
✔ Increases flexibility and maintainability  
✔ Enhances data security and integrity  
🚀
