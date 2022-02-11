public class OrderConfirmedState implements OrderState {

    private OrderConfirmedState() {};
    private static OrderConfirmedState instance = new OrderConfirmedState();
    public static OrderConfirmedState getInstance() {
        return instance;
    }

    public String getState() {
        return "Ordered";
    }

    public String confirm(Order order) {
        return "Order already confirmed";
    }

    public String cancel(Order order) {
        order.setState(OrderCanceledState.getInstance());
        return "Order Canceled";
    }

    public String delivered(Order order) {
        return "Order need to be sent first";
    }

    public String payed(Order order) {
        return "Order Was Already Payed";
    }

    public String sent(Order order) {
        order.setState(OrderSentState.getInstance());
        return "Order Sent";
    }

}
