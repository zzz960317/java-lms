package dependencyon.abstrac;

public class ABMain {
    public static void main(String[] args) {
        B b = new B("bClass");
        System.out.println(b.bField);
        System.out.println(b.method());

        A a = new B("bClass");
        System.out.println(a.aField);
        System.out.println(a.method());
    }
}

abstract class A{
    String aField;
    public A(){}

    public A(String aField) {
        this.aField = aField;
    }
    abstract String method();
}

class B extends A {

    @Override
    String method() {
        return "method";
    }
    String bField;

    public B(String bField) {
        super("aClass");
//        super("aClass");
        this.bField = bField;
    }
}
