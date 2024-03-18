package dependencyon.inter;

public class ABMain {
    public static void main(String[] args) {
        B b = new B("bclass");
        System.out.println(b.bField);
        System.out.println(b.method());
        System.out.println(b.FINE_NAME);
    }
}
interface A{
    final static String FINE_NAME = "FINE_NAME";
    String method();
}
class B implements A{

    String bField;

    public B(String bField) {
        this.bField = bField;
    }
    @Override
    public String method() {
        return "method";
    }
}
