package sooper;

import sooper.containers.Bag;
import sooper.containers.Box;
import sooper.orders.Order;
import sooper.products.Drugstore;
import sooper.products.Fresh;
import sooper.products.Frozen;
import sooper.products.Hygiene;
import sooper.products.NonPerishable;
import sooper.products.Pets;
/**
 * @author Antonio Ruiz Benito -> SpeedDemoN
 */
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
		
		// Ampliacion 2 cajas 4 bolsas
		for (int i = 0; i < 2; i++) {
			IContainer box2 = new Box("BPP" + i, 30, 40, 30, 50);
			myOrder.addContainer(box2);
		}
		
		for (int i = 0; i < 4; i++) {
			IContainer bag2 = new Bag("BPP" + i, 3000, 30, 25, 500, 30);
		}
		
		// Añado productos
		for (int i = 0; i < 10; i++) {
			
			IProduct milk = new NonPerishable("Milk" + i, 500, 700);
			myOrder.addProduct(milk);
			
		}
		
		myOrder.addProduct(new Pets("Pet1", 1000, 3000));
		myOrder.addProduct(new Pets("Pet2", 11000, 3000));
		myOrder.addProduct(new Pets("Pet3", 12000, 3000));
		myOrder.addProduct(new Hygiene("H2", 1200, 1000));
		myOrder.addProduct(new Drugstore("Dorg1", 100, 500));
		myOrder.addProduct(new Pets("Dorgp", 2000, 2000));

		for (int i = 0; i < 24; i++) {
			myOrder.addProduct(new Fresh("FF" + i, 100, 200));
		}
		
		myOrder.addProduct(new NonPerishable("aaA", 1000, 1500));
		
		for (int i = 0; i < 7; i++) {
			myOrder.addProduct(new NonPerishable("nomn" +  i, 300, 989));
		}
			
		System.out.println("Mi pedido actializado:\n" + myOrder);

		// Añado una caja mas grande
		myOrder.addContainer(new Bag("BigBox", 50, 75, 60, 100, 50));
		
		System.out.println("Mi pedido actializado:\n" + myOrder);

	}

}
