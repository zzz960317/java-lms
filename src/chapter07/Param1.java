package chapter07;

public class Param1 {

    // 메소드 오버로딩

    void add(int x, int y) { // public 처럼 접근제한자를 안 쓰면 default 로 적용이 되고, default 는 동일 패키지까지 적용이 된다. 즉 chapter07 안에서만 접근이 가능하다는 것이다.
        int z = x + y;
        System.out.println(z);
    }

    void add(double x, double y) {
        double z = x + y;
        System.out.println(z);
    }

    void add(int... x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        System.out.println(sum);
    }
}
