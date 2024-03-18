package chapter07;

public class Excersise11Iter {
    public static void main(String[] args) {

        int[] arr = {9, 5, 24, 13, 3, 21};

        Math1Iter m = new Math1Iter();
        int max = m.max(arr);
        int min = m.min(arr);

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}

class Math1Iter {

    static int max(int[] x) {

        int max = Integer.MIN_VALUE;

        for (int i : x) {
            if (max <= i) {
                max = i;
            }
        }
        return max;
    }
    static int min(int[] y) {

        int min = Integer.MAX_VALUE;

        for (int i : y) {
            if (min >= i) {
                min = i;
            }
        }
        return min;
    }
}
