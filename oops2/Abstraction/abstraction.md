### **Abstraction in Java**

**Abstraction** is an **OOP principle** that hides implementation details and only exposes essential features to the user. It helps in reducing complexity by focusing on what an object does rather than **how** it does it.

---

### **Ways to Achieve Abstraction in Java**

1. **Abstract Classes (`abstract` keyword)** – Partially implemented classes with abstract and non-abstract methods.
2. **Interfaces (`interface` keyword)** – Fully abstract, containing only method declarations (default and static methods allowed in Java 8+).

---

### **Example 1: Abstraction Using an Abstract Class**

```java
abstract class Animal {
    abstract void makeSound();  // Abstract method (must be implemented)

    void sleep() {  // Concrete method
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Output: Bark!
        myDog.sleep();     // Output: Sleeping...
    }
}
```

✔ **Only essential details (makeSound) are exposed**  
✔ **Implementation details are hidden inside subclasses**

---

### **Example 2: Abstraction Using an Interface**

```java
interface Vehicle {
    void start();  // Abstract method (by default)
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Output: Car is starting...
    }
}
```

✔ **100% abstraction** using interfaces  
✔ **Multiple classes can implement the same interface**

---

### **Key Differences: Abstract Class vs. Interface**

| Feature                  | Abstract Class                         | Interface                                     |
| ------------------------ | -------------------------------------- | --------------------------------------------- |
| **Methods**              | Can have abstract & concrete methods   | Only abstract (except default & static)       |
| **Fields**               | Can have instance variables            | Only `public static final` constants          |
| **Access Modifiers**     | Can have all access modifiers          | Methods are `public` by default               |
| **Multiple Inheritance** | Not supported (extends only one class) | Supported (can implement multiple interfaces) |

### **Benefits of Abstraction**

✔ Reduces complexity  
✔ Improves maintainability  
✔ Increases code reusability

Would you like a real-world example or a deeper explanation? 🚀
