public class OrderSentState implements OrderState {

    private OrderSentState() {};
    private static OrderSentState instance = new OrderSentState();
    public static OrderSentState getInstance() {
        return instance;
    }

    public String getState() {
        return "Sent";
    }
    
    public String confirm(Order order) {
        return "Order Was Already Confirmed";
    }
    
    public String cancel(Order order) {
        order.setState(OrderCanceledState.getInstance());
        return "Order Canceled";
    }
    
    public String delivered(Order order) {
        order.setState(OrderDeliveredState.getInstance());
        return "Order Delivered";
    }
    
    public String payed(Order order) { return "Order Was Already Payed"; }
    
    public String sent(Order order) { return "Order Sent";  }

}
