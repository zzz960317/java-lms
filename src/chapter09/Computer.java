package chapter09;

public class Computer {
    public static void main(String[] args) {

        GraphicCard gc = new Amd(); // 상위클래스 타입으로 하위클래스 객체 gc 를 새로 만들겠다.
        System.out.println(gc);
        System.out.println("메모리 : " + gc.MEMORY);

        // Amd로 생성
        gc = new Amd(); // 자동 형변환
        System.out.println(gc);
        gc.process();

        // Nvidia로 교체
        gc = new Nvidia(); // 자동 형변환
        System.out.println(gc);
        gc.process();
    }
}
