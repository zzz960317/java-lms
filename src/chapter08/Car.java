package chapter08;

public class Car {
    public static void main(String[] args) {
        Taxi t = new Taxi();
        t.go();
    }
    String color;
    String name;

    public void go() {
        System.out.println("전진");
    }

    public void back() {
        System.out.println("후진");
    }
}

class Taxi extends Car {

    public void go() {
        System.out.println("미터기를 켜고 전진");
    }
}
