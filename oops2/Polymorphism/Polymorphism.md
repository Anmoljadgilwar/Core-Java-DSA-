Polymorphism in Java is a core concept of Object-Oriented Programming (OOP) that allows methods or objects to behave differently based on their context. It enables a single interface to represent different underlying forms (data types or methods).

### Types of Polymorphism in Java:

1. **Compile-Time Polymorphism (Method Overloading)**

   - Occurs when two or more methods in the same class share the same name but differ in parameter type, number, or both.
   - The method to be invoked is determined at compile time.

   **good Example:**

   ```java
   class Calculator {
       int add(int a, int b) {
           return a + b;
       }

       double add(double a, double b) {
           return a + b;
       }
   }

   public class Main {
       public static void main(String[] args) {
           Calculator calc = new Calculator();
           System.out.println(calc.add(5, 3)); // Calls int add(int, int)
           System.out.println(calc.add(2.5, 3.5)); // Calls double add(double, double)
       }
   }
   ```

2. **Run-Time Polymorphism (Method Overriding)**

   - Occurs when a subclass provides a specific implementation for a method already defined in its parent class.
   - The method to be executed is determined at runtime based on the object type.

   **Example:**

   ```java
   class Animal {
       void sound() {
           System.out.println("Animal makes a sound");
       }
   }

   class Dog extends Animal {
       @Override
       void sound() {
           System.out.println("Dog barks");
       }
   }

   public class Main {
       public static void main(String[] args) {
           Animal animal = new Dog(); // Polymorphism
           animal.sound(); // Calls Dog's implementation
       }
   }
   ```

### Key Points:

- Polymorphism improves code flexibility and reusability.
- **Method Overloading** is an example of compile-time polymorphism.
- **Method Overriding** is an example of runtime polymorphism.
- Achieved using inheritance, method overriding, and interfaces.
