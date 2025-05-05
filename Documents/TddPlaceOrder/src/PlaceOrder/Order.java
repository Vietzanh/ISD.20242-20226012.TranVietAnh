package PlaceOrder;

public class Order implements OrderInterface {
	@Override
	public String createOrder(Object... operands) {
//		order_id, customer_id, total_amount, payment_method, order_status, subtotal, tax
		if (operands.length != 7) {
			return "INVALID";
		}
		if (!(operands[0] instanceof Integer) || (Integer)operands[0] <= 0) {
			return "INVALID order_id";
		}
		if (!(operands[1] instanceof Integer) || (Integer)operands[1] <= 0) {
			return "INVALID customer_id";
		}
		if (!(operands[2] instanceof Float) || (Float)operands[2] <= 0) {
			return "INVALID total_amount";
		}
		if (!(operands[3] instanceof String) || !((String)operands[3]).matches("[a-zA-Z0-9]+")) {
			return "INVALID payment_method";
		}
		if (!(operands[4] instanceof String) || !((String)operands[4]).matches("[a-zA-Z0-9]+")) {
			return "INVALID order_status";
		}
		if (!(operands[5] instanceof Float) || (Float)operands[5] <= 0) {
			return "INVALID subtotal";
		}
		if (!(operands[6] instanceof Float) || (Float)operands[6] <= 0) {
			return "INVALID tax";
		}
		return "Order created";
	}
	
	@Override
	public String getOrder(Integer order_id) {
		if (order_id <= 0) {
			return "INVALID";
		}
		return "Order returned";
	}
}
