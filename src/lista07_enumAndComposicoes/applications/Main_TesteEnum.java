package lista07_enumAndComposicoes.applications;
import lista07_enumAndComposicoes.entities.Order;
import lista07_enumAndComposicoes.entities.OrderStatus;

import java.util.Date;

public class Main_TesteEnum {

    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);
    }
}
