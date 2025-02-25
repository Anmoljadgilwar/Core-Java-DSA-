
class Student {

    String name;
    static String city;
}

public class StaticDemo {

    public static void main(String[] args) {
        Student.city = "Pune";
        System.out.println(Student.city);

        Student s1 = new Student();
        s1.name = "Anmol";
        //System.out.println(s1.city);

    }
}

//Static data can be accessed without creating an object
