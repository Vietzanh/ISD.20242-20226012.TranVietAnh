package PlaceOrder;

public interface OrderInterface {
	String createOrder(Object... operands);
	String getOrder(Integer order_id);
}
