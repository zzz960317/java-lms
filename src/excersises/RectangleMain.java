package excersises;

public class RectangleMain {
    public static void main(String[] args) {

        // 객체지향

        /*
        main 메소드에서 하는 것은,
        객체 생성하고, 메소드 호출하는 것
         */

        Rectangle rectangle = new Rectangle();
        rectangle.width = 4;
        rectangle.height = 5;

        int area = rectangle.getArea();
        System.out.println("넓이 : " + area);

        int perimeter = rectangle.getPerimeter();
        System.out.println("둘레 길이 : " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형이면 true, 직사각형이면 false : " + square);

    }
}
