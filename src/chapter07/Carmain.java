package chapter07;

public class Carmain {
    public static void main(String[] args) {

        Car tico = new Car();
        Car pride = new Car();

        tico.color = "화이트";
        tico.company = "대우";
        tico.type = "경차";

        pride.color = "블랙";
        pride.company = "기아";
        pride.type = "소형";

        // 메소드 호출
        tico.go();
        pride.back();

        System.out.println("tico 자동차 색상 : "+ tico.color + ", 제조사 : " + tico.company + ", 타입 : " + tico.type);
        System.out.println("pride 자동차 색상 : "+ pride.color + ", 제조사 : " + pride.company + ", 타입 : " + pride.type);
    }
}
