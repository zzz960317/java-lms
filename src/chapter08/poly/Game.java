package chapter08.poly;

public class Game {

    // 매서드의 매개변수도 다형성 개념 적용. 매개변수의 자료형을 상위 클래스 타입으로 지정하기
    // 메서드 오버로딩
    void display(GraphicCard gc) {
        gc.process();
    }

    void display(Amd gc) {
        gc.process();
    }

    void display(Nvidia gc) {
        gc.process();
    }

    public static void main(String[] args) {
        Game g = new Game();
        GraphicCard gc = new GraphicCard();
        g.display(gc);

        Amd gc1 = new Amd();
        g.display(gc1);

        Nvidia gc2 = new Nvidia();
        g.display(gc2);

        allObject(new GraphicCard());
        allObject(new Amd());
        allObject(new Nvidia());
}

//     모든 클래스를 매개변수로 받고 싶으면, 자바의 최상위 클래스 Object를 매개변수로 사용
public static void allObject(Object obj) {
    System.out.println(obj.toString()); // toString 은 주소값을 알려주는 메소드
}
}

