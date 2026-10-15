package e.com.order.mngmnt;

public class DiscountCalculator {

	public int discountCalculator(int price, String type, int discount) {

		int finalAmount = 0;
		try {
			switch (type) {
			case "REGULAR":
				finalAmount = price - (price * discount) / 100;
				break;

			case "GOLD":
				finalAmount = price - (price * discount) / 100 - 100;
				break;

			case "PLATINUM":
				finalAmount = price - (price * discount) / 100 - 150;
				break;

			default:
				finalAmount = price;
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return finalAmount;
	}

}
