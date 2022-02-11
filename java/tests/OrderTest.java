import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class OrderTest {

    @Test
    void shouldStoreStates() {
        Order order = new Order();
        order.setState(OrderConfirmedState.getInstance());
        order.setState(OrderSentState.getInstance());
        assertEquals(2, order.getStates().size());
    }

    @Test
    void shouldReturnToInitialState() {
        Order order = new Order();
        order.setState(OrderConfirmedState.getInstance());
        order.setState(OrderSentState.getInstance());
        order.restoreState(0);
        assertEquals(OrderConfirmedState.getInstance(), order.getState());
    }

    @Test
    void shouldReturnPreviousState() {
        Order order = new Order();
        order.setState(OrderConfirmedState.getInstance());
        order.setState(OrderPayedState.getInstance());
        order.setState(OrderSentState.getInstance());
        order.setState(OrderDeliveredState.getInstance());
        order.restoreState(2);
        assertEquals(OrderSentState.getInstance(), order.getState());
    }

    @Test
    void shouldReturnInvalidIndexException() {
        try {
            Order order = new Order();
            order.restoreState(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid index", e.getMessage());
        }
    }

}