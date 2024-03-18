package chapter07;

public class LocalMain {
    public static void main(String[] args) {

        Local local = new Local();

        System.out.println(local.name); // null

        local.process();
        System.out.println(local.name); // 홍길동

        local.printAge1();
        local.printAge2();

        int temp = 0;

        // for 문 블록 내에서의 변수 선언
        for (int i = 0; i < 10; i++) {
             temp += i;
        }
        System.out.println(temp); // 에러이다. 왜냐하면 temp 변수는 for문 안에서만 형성된 지역변수이기 때문에 저기 안에서만 쓸 수 있따.
    }
}
