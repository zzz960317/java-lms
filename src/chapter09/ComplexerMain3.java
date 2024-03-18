package chapter09;

public class ComplexerMain3 {
    public static void main(String[] args) {

        ComplexerInterface ci = new ComplexerInterface() {

            @Override
            public void scan() {
                System.out.println("여기는 익명 구현 객체의 scan()");
            }

            @Override
            public void print() {
                System.out.println("여기는 익명 구현 객체의 print()");
            }

            @Override
            public void send(String tel) {
                System.out.println("여기는 익명 구현 객체의 send()");
            }

            @Override
            public void receive(String tel) {
                System.out.println("여기는 익명 구현 객체의 receive()");
            }
        };

        ci.scan();
        ci.print();
        ci.send("1234");
        ci.receive("5678");
    }
}
