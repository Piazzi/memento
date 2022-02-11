public class OrderPayedState implements OrderState {

    private OrderPayedState() {};
    private static OrderPayedState instance = new OrderPayedState();
    public static OrderPayedState getInstance() {
        return instance;
    }

    public String getState() {
        return "Canceled";
    }

    public String confirm(Order order) {
        order.setState(OrderConfirmedState.getInstance());
        return "Order was confirmed";
    }

    public String cancel(Order order) {
        order.setState(OrderCanceledState.getInstance());
        return "Order was canceled";
    }

    public String delivered(Order order) {
        return "Order cant be delivered";
    }

    public String payed(Order order) {
        return "Order was already payed";
    }

    public String sent(Order order) {
        return "Order cant be sent";
    }

}
