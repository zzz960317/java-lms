package chapter07;

public class MemberMain2 {
    public static void main(String[] args) {

        MemberMain2 m = new MemberMain2();
        MemberMain2 m2 = new MemberMain2();

        if (m == m2) {
            System.out.println("m 객체와 m2 객체는 같다");
        }
        else {
            System.out.println("m 객체와 m2 객체는 같지 않다");

            System.out.println("m = " + m);
            System.out.println("m2 = " + m2);
        }
    }
}
