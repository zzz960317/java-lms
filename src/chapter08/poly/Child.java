package chapter08.poly;

public class Child extends Parent {

    String name;

    // 재정의 메소드
    void run() {
        System.out.println("자식이 달린다");
    }

    void eat() {
        System.out.println("자식이 먹는다");
    }
}
