package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();// 0x001
        initStudent(student1, "kim", 10, 100);
        Student student2 = new Student();// 0x002
        initStudent(student2,"lee", 20, 90);

        printStudent(student1);
        printStudent(student2);

    }
    static void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade= grade;
    }
    static void printStudent(Student student){
        System.out.println("name:"+ student.name +" ,age:"+student.age + " ,grade:"+student.grade);
    }
}
