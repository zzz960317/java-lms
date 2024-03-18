package oop1;

public class MusicPlayer {

    /*
    요구사항
    1. 뮤직 플레이어를 on / off 할 수 있어야 한다
    2. 뮤직 플레이어의 볼륨은 up / down 할 수 있어야 한다
    3. 뮤직 플레이어의 현재 상태를 확인할 수 있어야 한다
     */

    boolean isOn = false;
    int volumn = 0;

    void on() {
        isOn = true;
        System.out.println("music player ON");
    }

    void off() {
        isOn = false;
        System.out.println("music player OFF");
    }

    void volumnUp() {
        volumn++;
        System.out.println("music player VOLUMN UP : " + volumn);
    }

    void volumnDown() {
        volumn--;
        System.out.println("music player VOLUMN DOWN : " + volumn);
    }

    void showStatus() {
        System.out.println("music player STATUS NOW");
        if (isOn) {
            System.out.println("music player ON, VOLUMN : " + volumn);
        }
        else {
            System.out.println("music player OFF, VOLUMN : " + volumn);
        }
    }
}
