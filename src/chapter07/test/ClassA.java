package chapter07.test;

public class ClassA {
    public static void main(String[] args) {

        ClassB cb = new ClassB();
        cb.print();

        ClassA ca = new ClassA();
        ca.print();
    }

    public void print(){ // 클래스 이름과 변수 이름이 다르기 때문에 생성자가 아니다. 메소드이다
        System.out.println("여기는 ClassA");
    }
}
    class ClassB {
        void print () {
        System.out.println("여기는 ClassB");
        }
    }
