package chapter09;

public class AnimalMain {
    public static void main(String[] args) {

        Animal eagle = new Eagle(); // 자동 형변환
        System.out.println(eagle);
        eagle.sleep();
//        eagle.eat(); // 에러 발생. Animal 타입의 Eagle 객체가 생성되었다. Animal 인터페이스에는 eat 메소드가 없다. 그래서 에러 발생

        // 에러를 없애려면 하위 클래스인 Eagle 타입으로 강제 형변환을 해줘야 한다.
        Eagle eagle1 = (Eagle)eagle; // 강제 형변환
        System.out.println(eagle1);
        eagle1.eat(); // Eagle 클래스의 eat() 메서드
    }
}
