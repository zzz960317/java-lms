package chapter08;

public class ChildEx extends ParerntEx {

    public ChildEx() {
        this(1);
        System.out.println("3");
    }

    public ChildEx(int x) {
        System.out.println("4");
    }
}
