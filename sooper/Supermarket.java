package sooper;

import sooper.containers.Bag;
import sooper.containers.Box;
import sooper.orders.Order;
import sooper.products.Fresh;
import sooper.products.Frozen;
import sooper.products.Hygiene;

public class Supermarket {

	public static void main(String[] args) {

		// Creo un nuevo pedido
		IOrder myOrder = new Order("test order"); 
		
		// Creo 2 contenedores
		IContainer box = new Box("AAA", 10, 20, 1000, 25);
		IContainer bag = new Bag("BBB", 40, 25, 900, 20, 2040);

		// Añado al pedido los 2 contenedores
		myOrder.addContainer(box);
		myOrder.addContainer(bag);
		
		System.out.println("Mi pedido con contenedores: " + myOrder);
		
		// Creo productos
		IProduct apples = new Fresh("m", 500, 1500);
		IProduct iceCream = new Frozen("h", 20, 1000);
		IProduct toiletPaper = new Hygiene("w", 250, 2500);
		IProduct pears = new Fresh("p", 450, 1300);
		
		// Añado los productos a los contenedores
		IContainer contApples = myOrder.addProduct(apples);
		IContainer contIceCream = myOrder.addProduct(iceCream);
		IContainer contToiletPaper = myOrder.addProduct(toiletPaper);
		IContainer contPears = myOrder.addProduct(pears);
		
		System.out.println("My pedido con productos " + myOrder);
		
		
	}

}
