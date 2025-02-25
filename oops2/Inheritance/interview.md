Here are **top interview questions** related to **Inheritance** in Java, commonly asked by MNCs like Google, Amazon, and Microsoft:

---

### **Basic Conceptual Questions**

1. **Definition-Based:**

   - What is inheritance in Java, and why is it used?
   - What is the difference between single, multilevel, and hierarchical inheritance?
   - Why does Java not support multiple inheritance with classes?
   - What are the advantages and disadvantages of inheritance?

2. **Syntax and Keywords:**

   - What is the purpose of the `super` keyword in inheritance?
   - How is the `extends` keyword used in Java?
   - Can a constructor be inherited in Java? Why or why not?
   - Explain the difference between `super` and `this` keywords.

3. **Access Modifiers:**

   - How do access modifiers (public, private, protected) affect inheritance?
   - Can a private method of a superclass be overridden in a subclass?

4. **Method Overriding:**
   - What is method overriding in inheritance?
   - What are the rules for overriding a method in Java?
   - What is the significance of the `@Override` annotation?

---

### **Scenario-Based and Practical Questions**

1. **Problem-Solving:**

   - Write a program to demonstrate single inheritance in Java.
   - Write a program to override a method in a subclass and call the superclass version using `super`.
   - Explain with code how polymorphism works with inheritance in Java.

2. **Behavioral:**

   - What happens if a subclass does not override a method from the superclass?
   - What is the behavior of a subclass object when it accesses a superclass method that has been overridden?

3. **Abstract Classes and Interfaces:**
   - How does inheritance differ between abstract classes and interfaces?
   - Can a class inherit from both a class and an interface? Provide an example.
   - What happens if an interface has multiple methods with the same name and different return types?

---

### **Advanced Questions**

1. **Multiple Inheritance:**

   - Why is multiple inheritance supported with interfaces but not with classes?
   - How do you resolve ambiguity in case of multiple inheritance with interfaces?

2. **Constructors and Initialization:**

   - How is a superclass constructor called during inheritance?
   - Can you explicitly prevent a class from being inherited? How?

3. **Design and Architecture:**
   - When should you use inheritance over composition?
   - What are some real-world examples where inheritance is more appropriate than other design patterns?

---

### **Sample Coding Question**

**Question:**
Write a Java program to demonstrate multilevel inheritance where:

- The `Animal` class has a method `eat()`.
- The `Mammal` class inherits from `Animal` and adds a method `walk()`.
- The `Dog` class inherits from `Mammal` and adds a method `bark()`.

**Expected Output:**

```
Animal is eating.
Mammal is walking.
Dog is barking.
```

---

### **Behavioral and Thought-Provoking Questions**

1. What are the downsides of overusing inheritance in a project?
2. How would you handle a situation where multiple inheritance is required but cannot be achieved with classes?
3. If you could modify the way Java handles inheritance, what would you change?
