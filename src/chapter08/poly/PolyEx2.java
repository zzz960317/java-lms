package chapter08.poly;

public class PolyEx2 {
    public static void main(String[] args) {

        Parent p = new Child();

        p.run();

        // 자식 클래스의 자료형으로 변환 (강제형변환)
        Child c = (Child) p;
        c.eat();

        Parent pp = new Parent();

        pp.run();

        // 에러 발생 : 자식 클래스의 객체가 부모클래스의 자료형으로 형변환된 경우에만 다시 자식클래스의 자료형으로 형변환가능하다. 처음부터 Parent 클래스의 객체였다면 형변환 도중 에러가 발생한다.
        // 하지만 인텔리제이에서 이 부분은 미리 에러를 체크해주지 못한다. 실행을 해봐야만 알 수 있는 에러이기 때문에 반드시 기억해놓길 바란다.
        Child cc = (Child) pp;
        cc.eat();
    }
}
