package excersises;

public class AccountMain {
    public static void main(String[] args) {

        // 만원 입금 -> 구천원 출금 -> 이천원 출금 -> 잔액 출력

        Account account = new Account();
        account.balance = 10000;

        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(12000);
        account.deposit(50000);
        account.status();
    }
}
