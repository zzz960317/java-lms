package chapter08;

public class Eagle extends Animal {
    public Eagle(String type, String name) {
        super(type, name);
    }
    void sleep() {
        System.out.println(this.name + "은(는) 나무둥지에서 잠을 잔다.");
    }
}
