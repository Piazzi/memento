public class OrderCanceledState implements OrderState {

    private OrderCanceledState() {};
    private static OrderCanceledState instance = new OrderCanceledState();
    public static OrderCanceledState getInstance() {
        return instance;
    }

    public String getState() {
        return "Canceled";
    }

    public String confirm(Order order) {
        return "Order not confirmed";
    }

    public String cancel(Order order) {
        return "Order not canceled";
    }

    public String delivered(Order order) {
        return "Order cant be delivered";
    }

    public String payed(Order order) {
        return "Order cant be payed";
    }

    public String sent(Order order) {
        return "Order cant be sent";
    }

}
