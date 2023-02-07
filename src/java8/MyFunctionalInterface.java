package java8;

@FunctionalInterface
interface Abc{
    void show();
}

//class def implements Abc {
//    public void show(){
//        System.out.println("in show def");
//    }
//}

public class MyFunctionalInterface {
    public static void main(String[] args) {
        Abc obj = new Abc(){
            public void show() {
                System.out.println("in show ");
            }
        };
        obj.show();
    }
}
