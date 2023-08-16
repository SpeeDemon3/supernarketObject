package sooper;

import sooper.containers.Bag;
import sooper.containers.Box;
import sooper.orders.Order;

public class Supermarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IOrder myOrder = new Order("test order"); 
		
		IContainer box = new Box("AAA", 10, 20, 25, 50, 100);
		IContainer bag = new Bag(5, 2, 3, "BBB", 20, 40);

		myOrder.addContainer(box);
		myOrder.addContainer(bag);
		
	}

}
