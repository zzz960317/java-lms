package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data(); // dataA 에는 참조값(주소, 0x001)
        dataA.value = 10;  // 0x001.value = 10
        System.out.println("메소드 호출 전: dataA.value= "+dataA.value);
        changeRef(dataA);  // arguments ,인자, 인수
        System.out.println("메소드 호출 후: dataA.value= "+dataA.value);// 20
    }
    static void changeRef(Data dataX){  // parameter, 매개변수
        System.out.println("dataX" + dataX);
        dataX.value = 20;
    }
}
