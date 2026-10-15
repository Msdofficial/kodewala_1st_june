package finance.oneloan;

import java.sql.SQLException;

public class Driver {

	public static void main(String[] args) {

		OrderHistory order = new OrderHistory();

		try {
			order.getOrderHistory();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
