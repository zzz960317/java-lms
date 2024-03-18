package chapter07;

public class FinalEx {
    public static void main(String[] args) {

        Final f = new Final();
        System.out.println(f.number);

//        f.number = 200; // 에러 발생.
    }
}

class Final {
    final int number;

    Final() { // 클래스 이름과 같기 때문에 생성자. 생성자 중의 기본 생성자.
        number = 100;
    }
}
