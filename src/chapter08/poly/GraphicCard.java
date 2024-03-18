package chapter08.poly;

public class GraphicCard {

    int memory;

    public void process() {
        System.out.println("그래픽 처리");
    }

    public static void main(String[] args) {
        GraphicCard gc = new GraphicCard();
        gc.process(); // 원래 그래픽카드 process

        gc = new Amd();
        gc.process();

        gc = new Nvidia();
        gc.process();
    }
}


class Amd extends GraphicCard {
    @Override
    public void process() {
        System.out.println("AMD 그래픽 처리");
    }
}

class Nvidia extends GraphicCard {
    @Override
    public void process() {
        System.out.println("Nvidia 그래픽 처리");
    }
}