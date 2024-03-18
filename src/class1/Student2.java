package class1;

public class Student2 {
    public static void main(String[] args) {

        // 선언 Student 타입의 student1
        Student student1;
        student1 = new Student(); // 값이 아닌 주소가 들어간다.

        System.out.println(student1);

        student1.name = "김"; // 온점 . : (예를 들어, System.in : 객체이름.메소드이름)
        student1.age = 45; // 온점 . : (예를 들어, System.in : 객체이름.메소드이름)
        student1.score = 99; // 온점 . : (예를 들어, System.in : 객체이름.메소드이름)

        Student student2 = new Student(); // 'new Student() : default 생성자 메소드' 라고 한다. 소괄호 안이 비어있으니까 default.
        // Student 라는 설계도면을 가지고 와서 새로운 student2 를 만들겠다.
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

       Student[] students = new Student[] {student1, student2, student3, student4}; // 클래스 배열 생성

//        for (int i = 0; i < students.length; i++) {
//            System.out.println("이름 : " + students[i].name + ", 나이 : " + students[i].age + ", 점수 : " + students[i].score);
//        }

        // 향상된 for 문
        for (Student student : students) {
            System.out.println("이름 : " + student.name + ", 나이 : " + student.age + ", 점수 : " + student.score);
        }

    }
}
