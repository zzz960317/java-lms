package dependencyoff;

public class ABMain {
    public static void main(String[] args) {
        A a = new A("Aclass");
        System.out.println(a.aFeild);
        System.out.println(a.aMethod());

        B b = new B("Bclass");
        System.out.println(b.bFelid);
        System.out.println(b.bMethod());
    }
}

class A{
    public String aMethod() {
        return "A.aMethod";
    }
    String aFeild;

    public A(String aFeild) {
        this.aFeild = aFeild;
    }
}

class B{
    String bFelid;

    public B(String bFelid) {
        this.bFelid = bFelid;
    }

    public String bMethod(){
        return "afd";
    }
}