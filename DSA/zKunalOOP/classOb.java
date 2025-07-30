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

    }
}
