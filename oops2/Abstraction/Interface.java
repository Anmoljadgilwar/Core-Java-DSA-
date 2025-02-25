//interfaces cannot have constructor

interface Animal {

    public void walk();
}

interface Herbivore {

}

class Horse implements Animal, Herbivore {

    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

public class Interface {

    public static void main(String[] args) {

        Horse h = new Horse();
        h.walk();
    }

}
