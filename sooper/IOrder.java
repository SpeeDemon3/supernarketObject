package sooper;

import java.util.Set;

/**
 * Interface de pedidos
 */
public interface IOrder {

	String getReference();
	Set<IProduct> getProducts();
	Set<IContainer> getContainers();
	void addContainer(IContainer container);
	IContainer addProduct(IProduct product);
	
}
