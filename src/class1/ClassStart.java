package class1;

public class ClassStart {
    public static void main(String[] args) {

        // int형 배열 scores 를 10개 생선한다
//        int[] score = new int[10];

        // 이름, 성적, 나이의 배열 생성
        String[] studentName = {"김", "나", "박", "이"};
        int[] ages = {45, 46, 43, 43};
        int[] scores = {99, 98, 100, 97};

        for (int i = 0; i < studentName.length; i++) {
            System.out.println("이름 : " + studentName[i] + ", 점수 : " + scores[i] + ", 나이 : " + ages[i]);
        }

        // Student 형 배열 students 를 2개 생성한다
//        Student students = new Student[2];

    }
}
