package construct;

public class MemberInitMain1 {
    public static void main(String[] args) {

        MemberInit m1 = new MemberInit();
        m1.initMember("김",10,100);

        MemberInit m2 = new MemberInit();
        m2.initMember("이",20,90);

        MemberInit[] members = {m1, m2};

        for (MemberInit m : members) { // 반복 가능한 배열 members의 첫번째 요소부터 차례대로, 클래스타입으로 선언한 객체 m에 대입한다
            System.out.println("name : " + m.name + ", age : " + m.age + ", grade : " + m.grade);
        }
    }
}
