package excersises;

import java.util.Scanner;

public class ProductOrderMainScan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("주문 수량을 입력하세요 : ");
        int n = scanner.nextInt();
        scanner.nextLine(); // 왜 이 코드를 넣지??, \n(역슬래쉬 n) 이라는 enter 값을 없애기 위해서...? 불러오기를 하면은 enter 값을 먼저 불러오니까...??

        ProductOrder[] orders = new ProductOrder[n];
        for (int i = 0; i < orders.length; i++) {
            System.out.print("메뉴명 : ");
            String productName = scanner.nextLine();

            /*
            입력해주는 문자열을 productName 이란 변수값으로 가지겠다. 그런데 이전에 수량을 입력하면서, '숫자'를 입력하고 'enter'를 눌렀다면
            사실상 '숫자'와 '공백 or \n'이라는 '문자열'을 입력한 셈이다. 그렇기 때문에 이미 이전에 입력한 "공백"이란 문자열을 입력받은 걸로 인식하는 에러가 생기는 것이다
            이것을 방지하기 위해 'scanner.nextLine(); 을 써서 'enter'를 눌러서 생기는 '공백'이란 '문자열'을 입력받았다 치고, 새로운 메뉴명 '문자열'을 입력받기 위한
            String productName = scanner.nextLine(); 코드를 쓰는 것이다.. 횡설수설..
            즉, 이 에러는 'enter'이란 '문자열'을 입력한 후에 곧바로 숫자를 받아야하는 scanner.nextInt 가 아닌 '문자열'을 입력받아야하는 scanner.nextLine 을 쓸 때 생기는 에러이고,
            이걸 방지하기 위함이다.
             */

            System.out.print("가격 : ");
            int price = scanner.nextInt();

            System.out.print("수량 : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName,price,quantity);
        }
        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총금액 : " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) { // 리턴 타입은 productOrder 타입
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order; // order 라는 객체의 주소를 리턴한다
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            /*
             "오른쪽에, 반복 가능한 배열인 orders 의 첫번째 요소부터 차례대로,
             왼쪽에 선언한 변수, ProductOrder 라는 클래스타입의 order라는 객체에 대입되는 것이다" 라는 의미
             */
            System.out.println("메뉴명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) { // ProductOrder 타입의 order 라는 객체를 선언하고, orders 라는 배열주소를 처음부터 끝까지 들고오겠다?? 인덱스를 생략하는 거니깐...??
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
