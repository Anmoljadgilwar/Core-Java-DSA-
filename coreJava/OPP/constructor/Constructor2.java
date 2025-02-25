
public class Constructor2 {

    String name;
    int age;

    void show() {
        System.out.println(this.age + "\n" + this.name);
    }

    Constructor2() {
        System.out.println("Constructor called");

    }

    public static void main(String[] args) {

        Constructor2 obj = new Constructor2();
        obj.name = "Anmol";
        obj.age = 20;
        obj.show();

    }
}
