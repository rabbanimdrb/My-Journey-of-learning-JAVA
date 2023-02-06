package OOPs.ClassesAndObjects.Introduction;

public class WrapperClasses {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        swap(a,b);
//        System.out.println("a : " + a + " b : " + b);

        Integer a = 10;
        Integer b = 20;
        swap(a,b);
        System.out.println("a : " + a + " b : " + b);

//        final int bonus = 2;
//        bonus = 3;

        final A rabbani = new A("Rabbani");
        rabbani.name = "other name";


//        When a non primitive is final, you cannot reassign it.
//        rabbani = new A("new object");

        A obj;

        for (int i = 0; i < 1000000; i++) {

            obj = new A( "Random name");
        }

    }

    private static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = a;
    }

}

class A{
    final int num = 10;
    String name;

    public A(String name){
        System.out.println("Object is created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {

        System.out.println("Object is destroyed");
//        super.finalize();
    }
}
