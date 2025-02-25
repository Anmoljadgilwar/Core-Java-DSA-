// constructor chaining

class Animal {

    public Animal() {
        System.out.println("Your creating a new Animal");
    }

    public void eat() {
        System.out.println("AnimL Eats");
    }
}

class Horse extends Animal {

    Horse() {
        System.out.println("Your creating a new Horse");
    }

    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {

    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class Abstract {

    public static void main(String[] args) {

        Horse h = new Horse();
        h.eat();
        h.walk();

    }

}
