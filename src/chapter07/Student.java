package chapter07;

public class Student {

    // 속성
    String name;
    int grade;
    String department;

    Student() {}

    Student(String n) {
        name =n;
    }

    Student(String n, int g) {
        name = n;
        grade = g;
    }

    Student(String n, int g, String d) {
        name = n;
        grade = g;
        department = d;
    }

    // 학과와 학년을 매개변수로 받는 생성자(에러 발생)
//    Student(String nn, int gg) {
//        name = nn;
//        grade = gg;
//    }
}
