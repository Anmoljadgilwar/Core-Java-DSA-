
//see examples in .md file
//method(function) overloading
public class Student {

    String name;
    int age;

    void display(String name) {
        System.out.println("Name: " + name);
        // System.out.println("Age: " + age);

    }

    void display(int age) {

        System.out.println("Age: " + age);
    }

    void display(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student s = new Student();
        s.name = "Anmol";
        s.age = 20;

        Student s2 = new Student();
        s2.name = "Adwait Prbhu";
        s2.age = 22;

        s.display(s.name, s.age);
        s2.display(s2.name, s2.age);
    }
}
