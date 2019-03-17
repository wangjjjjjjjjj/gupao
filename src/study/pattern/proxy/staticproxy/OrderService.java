package study.pattern.proxy.staticproxy;

public class OrderService implements IOrderService {
    private OrderDao dao = new OrderDao();

    @Override
    public void createOrder(Order order) {
        dao.InsertOrder(order);
    }
}
