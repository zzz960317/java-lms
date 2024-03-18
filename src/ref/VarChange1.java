package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a  = 10;
        int b = a;  // b = 10 변수의 값을 대입한다.
        System.out.println("a: "+a+" ,b:"+b);
        a = 20;
        System.out.println("a: "+a+" ,b:"+b);
        b = 30;
        System.out.println("a: "+a+" ,b:"+b);

    }
}
