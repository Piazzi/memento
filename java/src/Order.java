import java.util.ArrayList;
import java.util.List;

public class Order {
    
    private String name;
    private OrderState state;
    private List<OrderState> memento = new ArrayList<OrderState>();

    public Order() {
        this.state = OrderSentState.getInstance();
    }
    
    public void setState(OrderState state) {
        this.state = state;
        this.memento.add(this.state);
    }

    public OrderState getState() {
        return state;
    }

    public String confirm() {
        return state.confirm(this);
    }
    
    public String cancel() {
        return state.cancel(this);
    }
    
    public String delivered() {
        return state.delivered(this);
    }
    
    public String payed() {
        return state.payed(this);
    }
    
    public String sent() {
        return state.sent(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OrderState> getStates() { return this.memento;}

    public void restoreState(int index) {
        if(index < 0 || index > this.memento.size() - 1)
            throw new IllegalArgumentException("Invalid index");
        this.state = this.memento.get(index);
    }
}
