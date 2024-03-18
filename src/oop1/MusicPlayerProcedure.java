package oop1;

public class MusicPlayerProcedure {
    public static void main(String[] args) {

        // 절차지향...??
        // mp3 켜기 -> 볼륨 증가 -> 볼륨 감소 -> mp3 현상태 출력

       int volumn = 0;
       boolean isOn = false;

        isOn = true;
        System.out.println("mp3 시작합니다.");

        volumn++;
        System.out.println("volumn +1 : " + volumn);

        volumn++;
        System.out.println("volumn +1 : " + volumn);

        volumn--;
        System.out.println("volumn -1 : " + volumn);

        System.out.println("mp3의 현재상태 확인");
        if (isOn) {
            System.out.println("mp3는 ON 상태이고, 볼륨은 " + volumn);
        } else {
            System.out.println("mp3 상태는 OFF");
        }
    }
}
