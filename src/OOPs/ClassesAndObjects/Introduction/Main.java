package OOPs.ClassesAndObjects.Introduction;

public class Main {
    public static void main(String[] args) {

//        Students data type
        Students[] students = new Students[5];
//        Syntax: Classname ref-var-name or obj-name = new Classname();

//       rabbani & anjum are the instances of class Students
//       Here we create new instances of Students class
        Students rabbani = new Students(1,"Rabbani",98.95f);
        Students anjum = new Students(2,"Anjum",99.99f);

//       here we use dot operator to access the marks and print
        System.out.println(rabbani.marks);
        System.out.println(anjum.marks);

//        here we use dot notation to greet rabbani(object of class Student/instace of class)
        rabbani.greeting();

        rabbani.changeName("Sahid");
        rabbani.greeting();

        Students random2 = new Students();
        System.out.println(random2.name);

        Students one = new Students();
        Students two = one; //one and two are printing to same object in heap

        one.name = "Something Something";
        System.out.println(two.name);
    }
}

//creating a class
class Students{
//    instance variable for Students data type
    int rollno;
    String name;
    float marks;

//    Constructor is used to create instances of a class
//    Constructor for taking inputs in the Students data type
    Students(int rollno, String name, float marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    Students(){
        this(13,"default constructor",100.00f);
    }

    void greeting(){
        System.out.println("Hello!!  My name is " + this.name);
    }

    void changeName(String naam){
        this.name = naam;
    }
}
