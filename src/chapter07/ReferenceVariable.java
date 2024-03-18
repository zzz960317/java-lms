package chapter07;

public class ReferenceVariable {
    public static void main(String[] args) {

        int[] n = new int[]{0, 1, 2, 3, 4};
        System.out.println("adress of n = " + n);

        int[] refN = n; // n 참조변수에 있는 주소를 읽어 주소값을 refN에 복사합니다.
        System.out.println("address of refN = " + refN);

        for (int i : refN) {
            System.out.println(i);
        }

        for (int i = 0; i < n.length; i++) {
            n[i] = i * 2;
        }

        for (int i : refN) {
            System.out.println("data of refN = " + i);
        }
    }
}
