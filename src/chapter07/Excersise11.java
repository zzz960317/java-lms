package chapter07;

public class Excersise11 {
    public static void main(String[] args) {

        int[] arr = {9, 5, 24, 13, 3, 21};

        Math1 m = new Math1();
        int max = m.max(arr);
        int min = m.min(arr);

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}

class Math1 {

    static int max(int[] x) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < x.length; i++) {
            if (max <= x[i]) {
                max = x[i];
            }
        }
        return max;
    }
    static int min(int[] y) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < y.length; i++) {
            if (min >= y[i]) {
                min = y[i];
            }
        }
        return min;
    }
}
