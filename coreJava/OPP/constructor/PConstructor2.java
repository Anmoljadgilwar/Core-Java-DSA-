
public class PConstructor2 {

    String name;
    int age;

    void show() {
        System.out.println(this.age);
        System.out.println(this.name);
    }

    PConstructor2(String Name, int Age) {
        this.name = Name;
        this.age = Age;

    }

    public static void main(String[] args) {

        PConstructor2 obj = new PConstructor2("Anmol", 20);
        obj.show();
    }

}
