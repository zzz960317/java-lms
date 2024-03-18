package chapter07;

public class ParamMain1 {
    public static void main(String[] args) {

        // 메소드 오버로딩

        Param1 p = new Param1();
        p.add(10,5);

        p.add(10,5.1);

        p.add(1,2,3,4,5);
    }
}
