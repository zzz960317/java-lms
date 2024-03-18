package chapter07;

public class PersonMain {
    public static void main(String[] args) {

        Person father = new Person();
        Person mother = new Person();

        father.name = "홍길동";
        father.gender = "남자";
        father.age = 39;
        father.height = 174;
        father.weight = 65;

        mother.name = "춘리";
        mother.gender = "여성";
        mother.age = 38;
        mother.height = 160;
        mother.weight = 50;

        System.out.println("아빠 이름 : " + father.name+ ", 성별 : " + father.gender + ", 키 : " + father.height + ", 나이 : " + father.age + ", 몸무게 : " + father.weight);
        System.out.println("엄마 이름 : " + mother.name+ ", 성별 : " + mother.gender + ", 키 : " + mother.height + ", 나이 : " + mother.age + ", 몸무게 : " + mother.weight);
    }
}
