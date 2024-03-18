package oop1;

public class MusicPlayerMain {
    public static void main(String[] args) {

        MusicPlayer mp3 = new MusicPlayer();

        // mp3 켜기 -> 볼륨 증가 -> 볼륨 감소 -> mp3 현상태 출력

        mp3.isOn = true;
        System.out.println("mp3 시작합니다.");
        mp3.volumn++;
        System.out.println("volumn +1 : " + mp3.volumn);
        mp3.volumn++;
        System.out.println("volumn +1 : " + mp3.volumn);
        mp3.volumn--;
        System.out.println("volumn -1 : " + mp3.volumn);

        System.out.println("mp3의 현재상태 확인");
        if (mp3.isOn) {
            System.out.println("mp3는 ON 상태이고, 볼륨은 " + mp3.volumn);
        } else {
            System.out.println("mp3 상태는 OFF");
        }
    }
}
