The `Math` class in Java provides many useful mathematical methods. Here are some of the most commonly used ones:

### **1. Basic Operations**

- `Math.max(a, b)`: Returns the larger of two numbers.
- `Math.min(a, b)`: Returns the smaller of two numbers.
- `Math.abs(a)`: Returns the absolute value of `a` (removes negative sign if present).

  ```java
  System.out.println(Math.abs(-10)); // Output: 10
  ```

### **2. Rounding Methods**

- `Math.round(a)`: Rounds `a` to the nearest integer.
- `Math.floor(a)`: Rounds `a` down to the nearest integer.
- `Math.ceil(a)`: Rounds `a` up to the nearest integer.

  ```java
  System.out.println(Math.round(4.6)); // Output: 5
  System.out.println(Math.floor(4.6)); // Output: 4
  System.out.println(Math.ceil(4.2));  // Output: 5
  ```

### **3. Power and Root Methods**

- `Math.pow(a, b)`: Returns `a` raised to the power of `b` (`a^b`).
- `Math.sqrt(a)`: Returns the square root of `a`.

  ```java
  System.out.println(Math.pow(2, 3)); // Output: 8.0
  System.out.println(Math.sqrt(16));  // Output: 4.0
  ```

### **4. Trigonometric Methods (Angles in Radians)**

- `Math.sin(a)`: Returns the sine of `a`.
- `Math.cos(a)`: Returns the cosine of `a`.
- `Math.tan(a)`: Returns the tangent of `a`.
- `Math.toRadians(degrees)`: Converts degrees to radians.
- `Math.toDegrees(radians)`: Converts radians to degrees.

  ```java
  double angle = 45;
  System.out.println(Math.sin(Math.toRadians(angle))); // Output: 0.707
  ```

### **5. Logarithmic & Exponential Methods**

- `Math.exp(a)`: Returns `e^a` (exponential function).
- `Math.log(a)`: Returns the natural logarithm (ln) of `a`.
- `Math.log10(a)`: Returns the base-10 logarithm of `a`.

  ```java
  System.out.println(Math.log(10));  // Output: 2.302
  System.out.println(Math.log10(100)); // Output: 2
  ```

### **6. Random Number Generation**

- `Math.random()`: Returns a random number between `0.0` and `1.0`.

  ```java
  System.out.println(Math.random()); // Output: Random value between 0.0 and 1.0
  ```

  To generate a random number in a specific range:

  ```java
  int randomNum = (int) (Math.random() * 100); // Random number between 0 and 99
  ```

### **7. Constants**

- `Math.PI`: The value of π (`3.141592653589793`).
- `Math.E`: The value of Euler's number (`2.718281828459045`).

  ```java
  System.out.println(Math.PI); // Output: 3.141592653589793
  ```

### **Conclusion**

The `Math` class provides a variety of useful methods for numerical computations. It’s widely used in graphics, physics simulations, and general-purpose calculations. 🚀
