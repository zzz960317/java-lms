package ref;

public class OuterDataMainSol {
    public static void main(String[] args) {
        OuterData outerData = new OuterData();
        outerData.data = new Data();
        System.out.println("outerData.count: " + outerData.count);
        System.out.println("outerData.data: " + outerData.data);
        System.out.println("outerData.data.value: " + outerData.data.value);
    }
}
