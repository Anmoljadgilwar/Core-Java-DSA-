// SEE IN .md FILE THERE ARE BETTER EXAMPLES

class Shape {

    public void area() {
        System.out.println("Area");
    }
}

class Triangle extends Shape {

    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

// 
class cercle extends Shape {

    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

public class oops {

    public static void main(String[] args) {

        Triangle t1 = new Triangle();
        // t1.color = "orenge";
        t1.area();
    }
}
