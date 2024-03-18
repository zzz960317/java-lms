package ref;

public class NullPointMain {
    public static void main(String[] args) {
        Data data = null; // 참조값이 정해지지 않았다.
        data = new Data();
        data.value = 10; // NullPointerException 예외발생하면 아래코드는 실행안되고 프로그램 종료
        System.out.println(data.value);
    }
}
