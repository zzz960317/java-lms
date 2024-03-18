package chapter07.test.test2;

import chapter07.test.ClassA;

public class ClassC {
    public static void main(String[] args) {

        ClassA ca = new ClassA();
        ca.print(); //

//        ClassB cb = new ClassB(); // default 접근제한자이기 때문에 동일 패키지가 아니라서 에러가 나옴.
    }
}
