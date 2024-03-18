package excersises;

public class Rectangle {

    /*
    설계도를 만들 때 해야하는 것은,
    멤버변수를 선언하고, 메소드를 만들고.
     */

    int width;
    int height;

    int getArea() {
        return width * height;
    }

    int getPerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
