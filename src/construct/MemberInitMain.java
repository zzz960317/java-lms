package construct;

public class MemberInitMain {
    public static void main(String[] args) {

        MemberInit m1 = new MemberInit();
        m1.name = "김";
        m1.age = 10;
        m1.grade = 100;

        MemberInit m2 = new MemberInit();
        m2.name = "이";
        m2.age = 20;
        m2.grade = 90;

        MemberInit[] members = {m1, m2};

        for (MemberInit m : members) {
            System.out.println("name : " + m.name + ", age : " + m.age + ", grade : " + m.grade);
        }
    }
}
