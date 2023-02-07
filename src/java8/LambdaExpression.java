package java8;

@FunctionalInterface  //Interface which has only one Method is called FunctionalInterface
interface A{
    void show(); // abstract method : without body
    String toString(); //toString is a method object class; every class in java extends object class
}

//class B implements A{ //Class B implements interface A
//    public void show() {
//        System.out.println("Hi");
//    }
//}

public class LambdaExpression {
//    Lambda Expression
//    Interfaces
    public static void main(String[] args) {

//        A obj = new A(){
//            public void show(){
//                System.out.println("Hi in show");
//            }
//        };
//        obj.show();

        A obj = () -> System.out.println("Hi in show");

        obj.show();
    }
}
