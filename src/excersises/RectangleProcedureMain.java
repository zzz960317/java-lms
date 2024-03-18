package excersises;

public class RectangleProcedureMain {
    public static void main(String[] args) {

        // 절차지향

        int width = 5;
        int height = 4;
        int area = getArea(width, height);

        System.out.println("가로가 " + width + "이고, 높이가 " + height + "인 사각형의 넓이는 " + area);

        int perimeter = getPerimeter(width,height);
        System.out.println("사각형의 길이는 " + perimeter);

        boolean square = isSquare(width, height);
        System.out.println("정사각형이면 true, 직사각형이면 false : " + square);
    }

    static int getArea(int width, int height) {
        return width * height;
    }

    static int getPerimeter(int width, int height) {
        return 2 * (width + height);
    }

    static boolean isSquare(int width, int height) {
        if (width == height) {
            return true;
        }
        else {
            return false;
        }
    }
}
