package chapter08;

public class Shark extends Animal {
    public Shark(String type, String name) {
        super(type,name);
    }

    @Override
    void sleep() {
        System.out.println(this.name+"은(는) 바다에서 잠을 잔다.");
    }
}
