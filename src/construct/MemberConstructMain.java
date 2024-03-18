package construct;

public class MemberConstructMain {
    public static void main(String[] args) {

        MemberConstruct member1 = new MemberConstruct("김", 10, 100);
        MemberConstruct member2 = new MemberConstruct("이", 20, 90);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) { // 반복 가능한 배열 members의 첫번째 요소부터 차례대로, 클래스타입으로 선언한 객체 member에 대입한다
            System.out.println("name : " + member.name + ", age : " + member.age + ", grade : " + member.grade);
        }
    }
}
