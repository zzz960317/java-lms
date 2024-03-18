package chapter08;

public class AnimalMain {
    public static void main(String[] args) {

        Animal[] animals = new Animal[4];

        Animal eagle = new Eagle("조류", "독수리");
        Animal tiger = new Tiger("포유류", "호랑이");
        Animal lion = new Lion("포유류","사자");
        Animal shark = new Shark("어류","상어");

        animals[0] = eagle;
        animals[1] = tiger;
        animals[2] = lion;
        animals[3] =shark;

        for (Animal animal : animals) {
            animal.sleep();
        }


    }
}
