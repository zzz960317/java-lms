package construct;

public class MemberInit {

    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        this.name = name; // 자신의 객체를 말하는 것이다. 내 주소 this
        this.age = age; //
        this.grade = grade;
    }
}
