public class OrderDeliveredState implements OrderState {

    private OrderDeliveredState() {};
    private static OrderDeliveredState instance = new OrderDeliveredState();
    public static OrderDeliveredState getInstance() {
        return instance;
    }
    
    public String getState() {
        return "Order Delivered";
    }
    
    public String confirm(Order order) {return "Order Was Already Confirmed";}
    
   public String cancel(Order order) {
        return "Order Cant be Canceled";
    }
   
   public String delivered(Order order) {
         return "Order Was Already Delivered";
   }
     
   public String payed(Order order) {
         return "Order Was Already Payed";
   }
   
   public String sent(Order order) {
         return "Order Was Already Sent";
   }

}
