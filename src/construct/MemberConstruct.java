package construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;

    /* 생성자
    1. 생성자는 클래스이름과 같아야한다
    2. 리턴 타입이 없으므로 비워둔다
    3. 생성자의 역할 : 멤버변수를 초기화시켜준다
    4. 객체를 생성하는 시점에 어떤 작업을 하고 싶은 경우
     */

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name : " + name + ", age : " + age + ", grade : " + grade);
        this.name = name; // 자신의 객체이다
        this.age= age;
        this.grade = grade;
    }
}
