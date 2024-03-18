package excersises;

public class Account {

    // 멤버변수와 메소드 생성

    int balance;

    void deposit(int deposit) {
        balance += deposit;
        System.out.println("잔액 : " + balance);
//        return balance;
    }

    void withdraw(int withdraw) {
        if (balance >= withdraw) {
            balance -= withdraw;
            System.out.println("잔액 : " + balance);
        } else {
            System.out.println("잔액이 부족하여 " + withdraw + "원 출금불가능. 현재 잔액 : " + balance);
        }
//        return balance;
    }

    void status() {
        System.out.println("현재 잔액 : " + balance);
    }
}
