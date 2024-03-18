package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("kim", 10, 100);
        printStudent(student1);
        Student student2 = createStudent("lee", 20, 90);
        printStudent(student2);

    }
    static Student createStudent(String name, int age, int grage) {  // 객체를 반환하는 메소드 선언
        Student student = new Student(); //0x001
        System.out.println("student= "+ student);
        student.name = name;
        student.age = age;
        student.grade =grage;
        return  student; //0x001
    }
    static void printStudent(Student student){
        System.out.println("name: "+ student.name+ " ,age:"+student.age+ " ,grade:"+student.grade);
    }
}
