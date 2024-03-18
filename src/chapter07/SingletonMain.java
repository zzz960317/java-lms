package chapter07;

public class SingletonMain {
    public static void main(String[] args) {

        // Singleton s = new Singleton)(; // 에러발생. Singleton 생성자는 private 접근제한자를 가지고 있기 때문에 에러발생.

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
    }
}
