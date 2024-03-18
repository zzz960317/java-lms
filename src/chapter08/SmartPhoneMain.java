package chapter08;

public class SmartPhoneMain {
    public static void main(String[] args) {

        Phone p = new Phone();
        p.name = "갤럭시";
        p.color = "블랙";
        p.company = "삼성";

        System.out.println("Phone 출력");
        System.out.println(p.name);
        System.out.println(p.company);
        System.out.println(p.color);
        p.call();
        p.receive();

        SmartPhone i = new SmartPhone();
        i.name = "아이폰";
        i.color = "화이트";
        i.company = "애플";

        System.out.println("SmartPhone 출력");
        System.out.println(i.name);
        System.out.println(i.color);
        System.out.println(i.company);
        i.call();
        i.receive();
        i.installApp();
    }
}
