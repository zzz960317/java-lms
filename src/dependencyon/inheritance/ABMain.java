package dependencyon.inheritance;

public class ABMain {
    public static void main(String[] args) {

        /*
        상속도 의존성이 있따
        상속에서는 멤버변수(속성)은 오버라이딩 안 된다. 오버라이딩(자식이 부모의 메소드를 덮어쓴다)은 메소드만 된다.
         */

        B b = new B("bClass");
        System.out.println(b.bField);
        System.out.println(b.Method());

        System.out.println(b.aField);
        System.out.println(b.Method());
    }
}

class A {
    String aField;
    public A(){}
    public A(String aField) {
        this.aField = aField; // 멤버변수는 오버라이딩이 안 된다
    }
    String Method(){
        return "aMethod";
    }
}

class B extends A {
    String bField;

    public B(String bField) {
        super("aClass"); // super(); 을 사용하면 부모의 생성자를 사용할 수 있다
        this.bField = bField;
    }
    String Method(){
        return "bMethod";
    }
}
//class B {
//    String bField;
//    String aField;
//
//    public B(String bField) {
//        this.bField = bField;
//        this.aField = bField;
//    }
//
//    public String bMethod(B b) {
//        return "bmethod";
//    }
//
//
//    public String aMethod(B b) {
//        return "amethod";
//    }
//}
