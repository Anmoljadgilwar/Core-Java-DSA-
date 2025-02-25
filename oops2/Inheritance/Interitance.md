### What is Inheritance in Java?

Inheritance is a fundamental concept in Object-Oriented Programming (OOP). It allows one class (called a **child class** or **subclass**) to acquire the properties (fields) and methods of another class (called a **parent class** or **superclass**).

### Key Points About Inheritance:

1. **Code Reusability**: The subclass can reuse code already defined in the superclass, reducing redundancy.
2. **Extensibility**: The subclass can add new features or override existing ones from the superclass.
3. **"Is-a" Relationship**: Inheritance establishes an "is-a" relationship between the subclass and the superclass. For example, if `Dog` inherits from `Animal`, we can say, "A dog is an animal."

### Syntax of Inheritance:

The `extends` keyword is used in Java to define inheritance.

```java
class ParentClass {
    // Fields and methods of the parent class
}

class ChildClass extends ParentClass {
    // Fields and methods specific to the child class
}
```

### Example of Inheritance:

Let’s take a real-world example:

- We have a base class `Animal`.
- We create a subclass `Dog` that inherits from `Animal`.

```java
// Superclass (Parent Class)
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Subclass (Child Class)
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.eat();  // Inherited method
        myDog.bark(); // Specific to Dog class
    }
}
```

**Output:**

```
Buddy is eating.
Buddy is barking.
```

### Types of Inheritance in Java:

1. **Single Inheritance**: One subclass inherits from one superclass.

   ```java
   class A { } // Superclass
   class B extends A { } // Subclass
   ```

2. **Multilevel Inheritance**: A class inherits from another class, which is itself a subclass of another class.

   ```java
   class A { } // Superclass
   class B extends A { } // Intermediate class
   class C extends B { } // Subclass
   ```

3. **Hierarchical Inheritance**: Multiple subclasses inherit from a single superclass.
   ```java
   class A { } // Superclass
   class B extends A { } // Subclass 1
   class C extends A { } // Subclass 2
   ```

### Key Features of Inheritance:

- **Method Overriding**: The subclass can provide a specific implementation for a method already defined in the superclass.

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
  ```

- **Access Modifiers**:
  - `private` members of the superclass are not accessible to the subclass directly.
  - `protected` members can be accessed in the subclass.
  - `public` members are fully accessible.

### Limitations in Java:

- **No Multiple Inheritance**: Java does not support multiple inheritance (one class inheriting from more than one superclass) to avoid ambiguity issues. Instead, Java uses interfaces for this purpose.

### Why Use Inheritance?

1. To create a hierarchical structure.
2. To reduce code duplication.
3. To make the system more maintainable and extendable.

### Hybrid Inheritance (In Short)

**Definition:** Hybrid inheritance is a combination of two or more types of inheritance (e.g., single, multilevel, hierarchical) in a single program. It is generally used to demonstrate a complex class relationship.

**In Java:** Java does not directly support hybrid inheritance due to the ambiguity caused by multiple inheritance. However, hybrid inheritance can be achieved using **interfaces**.

### Example:

```java
interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B { // Combines multiple interfaces
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() {
        System.out.println("Method B");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}
```

**Output:**

```
Method A
Method B
```

This way, Java supports hybrid inheritance indirectly through interfaces, avoiding the ambiguity of multiple inheritance with classes.
