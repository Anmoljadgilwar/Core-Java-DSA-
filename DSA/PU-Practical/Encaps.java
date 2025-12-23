
public class Encaps {

    // Private fields (Data Hiding)
    private String name;
    private int age;

    // --- 1. Getter Methods (Accessors) ---
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // --- 2. Setter Methods (Mutators) ---
    // Setter for name
    public void setName(String newName) {
        // Simple assignment for demonstration
        this.name = newName;
    }

    // Setter for age (Includes basic validation)
    public void setAge(int newAge) {
        if (newAge > 0 && newAge < 150) {
            this.age = newAge;
            System.out.println(this.name + "'s age set successfully.");
        } else {
            System.out.println("Validation Error: Age must be between 1 and 149. Age not set.");
        }
    }

    // --- Main Method for Demonstration ---
    public static void main(String[] args) {
        // 1. Create an instance (object) of the Encaps class
        Encaps student = new Encaps();

        System.out.println("--- Encaps Object Instantiation and Property Setting ---");

        // 2. Set properties using setter methods
        student.setName("Marcus Aurelius");

        // Try valid age
        student.setAge(35);

        // Try invalid age (will print the validation error message)
        student.setAge(-10);

        System.out.println("\n--- Retrieving Properties using Getter Methods ---");

        // 3. Retrieve and print properties using getter methods
        System.out.println("Retrieved Name: " + student.getName());
        System.out.println("Retrieved Age: " + student.getAge());

        System.out.println("-------------------------------------------------");
    }
}
