package study.pattern.proxy.staticproxy;

import java.text.SimpleDateFormat;

public class OrderServiceStaticProxy implements IOrderService {
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy");


    @Override
    public void createOrder(Order order) {
        String createTime = order.getCreateTime();
        String year = sdf.format(createTime);
        DynamicDataSourceEntry ddse = new DynamicDataSourceEntry();
        DynamicDataSourceEntry.set(year);
        OrderService service = new OrderService();
        service.createOrder(order);
    }
}
