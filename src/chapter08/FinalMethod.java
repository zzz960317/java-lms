package chapter08;

public class FinalMethod {

    // 재정의 가능한 메서드
    void method() {}

    // 재정의 불가능한 메서드
    final void method2() {}
}

class SubFinalMethod extends FinalMethod {

    @Override
    void method() {
        System.out.println("method() 재정의");
    }

//    void method2(){} // 에러 발생
}