
/**
 * MethodOverrideDemo.java
 * Demonstrates method overriding and basic inheritance in Java.
 */
public class MethodOverride {

    // --- Superclass Definition ---
    static class Animal {

        /**
         * Defines the general sound an animal makes.
         */
        public void makeSound() {
            System.out.println("The animal makes a generic sound.");
        }
    }

    // --- Subclass Definition ---
    // 'Dog' extends 'Animal', inheriting its methods and fields.
    static class Dog extends Animal {

        /**
         * Overrides the makeSound method from the Animal superclass. This
         * method provides a specific implementation for a Dog. The @Override
         * annotation is optional but recommended for safety.
         */
        @Override
        public void makeSound() {
            System.out.println("The Dog barks: Woof! Woof!");
        }

        /**
         * Dog-specific method, not present in Animal.
         */
        public void fetch() {
            System.out.println("The Dog is fetching a ball.");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Method Overriding Demonstration ---");

        // 1. Create an instance of the Dog subclass
        Dog myDog = new Dog();

        // 2. Call the makeSound() method on the Dog object.
        // The JVM resolves this call to the overridden method in the Dog class,
        // NOT the original method in the Animal class. This is Polymorphism.
        System.out.print("Calling makeSound() on a Dog object: ");
        myDog.makeSound();

        // 3. Optional: Demonstrate the Animal object (for contrast)
        Animal genericAnimal = new Animal();
        System.out.print("Calling makeSound() on an Animal object: ");
        genericAnimal.makeSound();

        System.out.println("---------------------------------------------");
    }
}
