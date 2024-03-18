package ref;

public class NullMain {
    public static void main(String[] args) {
        Data data = null;  // data에는 아직 참조할 주소가 정해지지 않았다.
        System.out.println("data : " + data);
        data = new Data();  //data에 참조값이 대입됩니다.
        System.out.println("data : "+ data);
        data = null;
        System.out.println("data : "+ data);
    }
}
