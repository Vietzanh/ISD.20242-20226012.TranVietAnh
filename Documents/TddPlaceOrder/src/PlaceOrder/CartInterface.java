package PlaceOrder;
import java.util.List;

public interface CartInterface {
	String checkItemsAvailability(List<Integer> items, List<Integer> number);
	String calculatePrice(List<Integer> items, List<Float> prices);
}
