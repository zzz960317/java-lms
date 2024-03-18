package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // 0x001 라는 참조값이 복사되어 대입된다.
        System.out.println("dataA.value = "+ dataA.value + " ,dataB.value"+ dataB.value);

        //dataA변경
        dataA.value = 20;
        System.out.println("dataA.value = "+ dataA.value + " ,dataB.value"+ dataB.value);

        //dataB변경
        dataB.value = 30;
        System.out.println("dataA.value = "+ dataA.value + " ,dataB.value"+ dataB.value);

    }
}
