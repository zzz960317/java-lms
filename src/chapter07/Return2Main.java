package chapter07;

public class Return2Main {
    public static void main(String[] args) {

        Return2 obj = new Return2();

        obj.getTest(0);
        obj.getTest(1);

        System.out.println(obj.getName(0));
        System.out.println(obj.getName(1));
    }
}
