package chapter07;

public class ReturnMain {
    public static void main(String[] args) {

        Return obj = new Return();

        String name = obj.getName();
        int age = obj.getAge();

        System.out.println(name);
        System.out.println(age);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
