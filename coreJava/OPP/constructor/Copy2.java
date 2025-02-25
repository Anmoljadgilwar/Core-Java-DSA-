
public class Copy2 {

    String name;
    int age;

    void show() {
        System.out.println(this.age);
        System.out.println(this.name);
    }

    Copy2(Copy2 student2) {
        this.name = student2.name;
        this.age = student2.age;

    }

    Copy2() {
    }

    public static void main(String[] args) {
        Copy2 obj1 = new Copy2();
        obj1.name = "Anmol";
        obj1.age = 20;
        Copy2 obj2 = new Copy2(obj1);
        obj2.show();

    }
}
