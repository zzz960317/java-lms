package chapter07;

public class StudentMain {
    public static void main(String[] args) {

        Student stu = new Student("홍길동", 4, "소프트웨어공학");

        System.out.println(stu.name);
        System.out.println(stu.grade);
        System.out.println(stu.department);

        Student stu2 = new Student("이순신", 3, "디자인");

        System.out.println(stu2.name + " : " + stu2.grade + "학년, " + stu2.department + "과");

        // 직접 생성자가 선언되어있으면 자바는 기본생성자를 자동으로 만들어주지 않는다. 기본생성자로 객체 생성 자체가 불가능하다.
        Student stu0 = new Student();

        Student student1 = new Student("김");
        Student student2 = new Student("김",4);
        Student student3 = new Student("김",4, "경제통상학");

        System.out.println(student1.name + " : ");
        System.out.println(student1.name + " : " + student2.grade+ "학년, ");
        System.out.println(student1.name + " : " + student2.grade+ "학년, " + student3.department + "과");


    }
}
