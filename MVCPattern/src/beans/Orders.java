package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Orders {
	List<Order> orders = new ArrayList<Order>();

	public Orders() {
		orders.add(new Order("00000001", "This is the product 1", (float) 4.00, 2));
		orders.add(new Order("00000002", "This is the prodcut 2", (float) 3.00, 2));
		orders.add(new Order("00000003", "This is the product 3", (float) 2.50, 4));
		orders.add(new Order("00000004", "This is the product 4", (float) 5.50, 5));
		orders.add(new Order("00000005", "This is the product 5", (float) 7.50, 6));
		orders.add(new Order("00000006", "This is the product 6", (float) 8.50, 7));
		orders.add(new Order("00000007", "This is the product 7", (float) 2.50, 8));
		orders.add(new Order("00000008", "This is the product 8", (float) 1.50, 9));
		orders.add(new Order("00000009", "This is the product 9", (float) 3.50, 10));
		orders.add(new Order("00000010", "This is the product 10", (float) 2.50, 11));
		orders.add(new Order("00000011", "This is the product 11", (float) 1.50, 4));
		orders.add(new Order("00000012", "This is the product 12", (float) 7.50, 5));
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
