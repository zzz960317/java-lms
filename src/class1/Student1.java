package class1;

public class Student1 {
    public static void main(String[] args) {

        // 선언 Student 타입의 student1
        Student student1;
        student1 = new Student(); // 값이 아닌 주소가 들어간다.

        System.out.println(student1);

        student1.name = "김"; // 온점 . : (예를 들어, System.in : 객체이름.메소드이름)
        student1.age = 45; // 온점 . : (예를 들어, System.in : 객체이름.메소드이름)
        student1.score = 99; // 온점 . : (예를 들어, System.in : 객체이름.메소드이름)

        Student student2 = new Student();
        System.out.println(student2);
        student2.name = "나";
        student2.age = 46;
        student2.score = 98;

        Student student3 = new Student();
        System.out.println(student3);
        student3.name = "박";
        student3.age = 43;
        student3.score = 100;

        Student student4 = new Student();
        System.out.println(student4);
        student4.name = "이";
        student4.age = 43;
        student4.score = 97;

        System.out.println("이름 : " + student1.name + ", 나이 : " + student1.age + ", 점수 : " + student1.score);
        System.out.println("이름 : " + student2.name + ", 나이 : " + student2.age + ", 점수 : " + student2.score);
        System.out.println("이름 : " + student3.name + ", 나이 : " + student3.age + ", 점수 : " + student3.score);
        System.out.println("이름 : " + student4.name + ", 나이 : " + student4.age + ", 점수 : " + student4.score);
    }
}
