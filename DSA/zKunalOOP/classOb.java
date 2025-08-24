//create a class
//for every single student

class Student {

    int rollNo;
    String name;
    float marks;

}

class classOb {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Kunal";
        s1.marks = 99.99f;
        System.out.println(s1.rollNo);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        Student std2 = new Student();
        std2.rollNo = 2;
        std2.name = "Anmol";
        std2.marks = 88.88f;
        System.out.println(std2.rollNo);
        System.out.println(std2.name);
        System.out.println(std2.marks);
    }
}
