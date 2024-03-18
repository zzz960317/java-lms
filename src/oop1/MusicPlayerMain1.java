package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {

        // 객체지향

        MusicPlayer mp3 = new MusicPlayer();

        // mp3 켜기 -> 볼륨 증가 -> 볼륨 감소 -> mp3 현상태 출력

        mp3.on();

        /*
         메소드르 불러올 때, 그 메소드가 같은 클래스 안에 들어있으면 바로 메소드 이름을 써서 이용할 수 있다.
         하지만 다른 클래스에 담겨져 있다면 먼저 그 클래스를 호출하고 온점. 을 써서 거기에 담긴 메소드를 이용해야 한다.
         */

        mp3.volumnUp();
        mp3.volumnUp();
        mp3.volumnUp();
        mp3.volumnDown();
        mp3.showStatus();
        mp3.off();
    }
}
