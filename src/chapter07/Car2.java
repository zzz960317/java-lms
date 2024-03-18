package chapter07;

public class Car2 {

    // 속성 or 멤버변수
    String color;
    String company;
    String  type;

    Car2(String color, String company, String type) {

        this.color = color;
        this.company = company;
        this.type = type;

//    Car2(String col, String com, String typ) {

        // 매개변수와 속성의 이름을 다르게 해준다면 this를 쓰지 않아도 된다
//        color = col;
//        company = com;
//        type = typ;
    }

    Car2() {
        this("white", "기아", "경차");
    }

    // Car2 클래스는 toString() 메소드를 오버라이딩하여 객체의 색상,회사,유형 정보를 포함하여 문자열을 반환한다.
    // 오버라이드 override 의 뜻은 덮어쓰다
    // 상속받은 조상의 메소드를 자신에게 맞게 변경하는 것이 오버라이딩이다
    public String toString(){
        return color + "-" + company + "-" + type;
    }


}
