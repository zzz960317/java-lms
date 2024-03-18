package chapter08;

public class SuperEx2 {
}

class  Parent2 {

    String name;

    Parent2(String name) {
        this.name = name;
    }
}

class  Child2 extends Parent2 {

    Child2(String name) {
        super(name);
        // 부모 클래스의 생성자에 매개변수가 있는 경우, 자식 클래스의 생성자에서 반드시 super()로 부모 생성자를 실행해줘야 한다.
        // 부모 생성자 실행 : 부모 클래스 객체가 먼저 생성되고 자식 객체가 생성되므로
    }
}
