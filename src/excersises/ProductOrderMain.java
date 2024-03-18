package excersises;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder[] orders = new ProductOrder[2];
        orders[0] = createOrder("카레라이스", 8000, 2); // 0x001 주소값이 들어가있다. 주소값을 따라가보면 카레라이스,8000,2 라는 배열의 데이터들을 참조하고 있다.
        // createOrder 라는 메소드는 order 라는 객체의 주소값을 리턴한다. order 의 주소값을 따라가보면
        orders[1] = createOrder("고등어구이정식", 8000, 2);

        printOrders(orders);

        int totalAmount = getTotalAmount(orders);
        System.out.println("총 금액 : " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order; // order의 주소값을 리턴한다
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
