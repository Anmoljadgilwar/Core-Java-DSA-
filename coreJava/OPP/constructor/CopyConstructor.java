
public class CopyConstructor {

    int a;
    String b;

    CopyConstructor() {
        a = 108;
        b = "RadheyShyam";
        System.out.println(a + " " + b);
    }

    CopyConstructor(CopyConstructor Prem) {
        a = Prem.a;
        b = Prem.b;
        System.out.print(a + " " + b);
    }

    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor();
        CopyConstructor obj2 = new CopyConstructor(obj1);

    }

}
