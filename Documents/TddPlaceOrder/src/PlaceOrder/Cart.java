package PlaceOrder;
import java.util.List;

public class Cart implements CartInterface {
	
	@Override
	public String checkItemsAvailability(List<Integer> items_id, List<Integer> numbers) {
		if (items_id.size() != numbers.size()) {
			return "INVALID";
		}
		for (Integer item_id : items_id) {
			if (item_id <= 0) {
				return "INVALID";
			}
		}
		for (Integer number : numbers) {
			if (number < 0) {
				return "INVALID";
			}
		}
		for (Integer number : numbers) {
			if (number == 0) {
				return "False";
			}
		}
		
		return "True";
	}
	
	@Override
	public String calculatePrice(List<Integer> items_id, List<Float> prices) {
		float result = 0f;
		if (items_id.size() != prices.size()) {
			return "INVALID";
		}
		for (Integer item_id : items_id) {
			if (item_id <= 0) {
				return "INVALID";
			}
		}
		for (Float price : prices) {
			if (price <= 0) {
				return "INVALID";
			}
			else {
				result += price;
			}
		}
		
		return String.format("%.2f", result);
	}
}
