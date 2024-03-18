package chapter07;

public class Singleton {

    // static 변수, 아마도 클래스 변수
    private static Singleton instance = new Singleton();

    // 생성자에 private 접근제한자
    private Singleton() { // 클래스와 이름이 같기 때문에 생성자이다
        System.out.println("객체 생성");
    }

    // static 메서드, 객체를 생성하지 않아도 쓸 수 있는 메소드
    public static Singleton getInstance() {
        System.out.println("객체 리턴");
        return instance;
    }
}
