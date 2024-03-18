package chapter09;

public interface InterfaceEx {

    // 상수
    public int MIN_PRICE = 0; // public static final 을 자동으로 컴파일 해줌
    public int MAX_PRICE = 100000;

    // 추상 메서드
    public double meanPrice(); // public abstract 를 자동으로 컴파일 해줌
    public double totalPrice();

    // default 메서드 (구현부 작성)
    default double getSalePrice(double price) {
        return price - (price * 0.05);
    }

    // static 메서드
    static void printPrice(double price) {
        System.out.println(price);
    }
}
