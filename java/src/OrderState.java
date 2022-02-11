public interface OrderState {
    
    String getState();
    
    String confirm(Order order);
    
    String cancel(Order order);
    
    String delivered(Order order);
    
    String payed(Order order);
    
    String sent(Order order);

}
