### Automatic Garbage Collection – JVM manages memory using a garbage collector, freeing unused objects.

---

A **reference variable** in Java is a variable that **stores the memory address of an object** rather than the actual object itself. It acts as a pointer to an object in the heap memory.

### **Example:**

```java
class Car {
    String model;
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();  // 'myCar' is a reference variable
        myCar.model = "Tesla";

        Car anotherCar = myCar;  // anotherCar refers to the same object
        anotherCar.model = "BMW";

        System.out.println(myCar.model); // Output: BMW
    }
}
```

### **Key Points:**

- **Holds object memory address** (not the object itself).
- **Multiple references can point to the same object.**
- **Changing the object via one reference affects all references.**
- **`null` can be assigned to a reference variable** to remove its association with an object.

🚀
