package chapter07;

public class Car {

    // 속성 or 멤버변수
    String color;
    String company;
    String type;

    // 메소드 or 기능
    public void go() { // 메소드는 보통 기능을 나타내기 때문에 영어 동사를 이름으로 많이 쓴다.
        System.out.println("전진하다.");
    }
    public void back() {
        System.out.println("후진하다.");
    }
}