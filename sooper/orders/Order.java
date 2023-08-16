package sooper.orders;

import java.util.HashSet;
import java.util.Set;

import sooper.IContainer;
import sooper.IOrder;
import sooper.IProduct;

public class Order implements IOrder {
	
	// Atributos
	private String reference;
	private Set<IContainer> containers;
	
	// Constructor
	public Order(String reference) {
		this.reference = reference;
		this.containers = new HashSet<>();
	}

	@Override
	public String getReference() {
		return reference;
	}

	@Override
	public Set<IProduct> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<IContainer> getContainers() {
		return containers;
	}

	@Override
	public void addContainer(IContainer container) {
		containers.add(container);
	}

	@Override
	public IContainer addProduct(IProduct product) {
		// TODO Auto-generated method stub
		return null;
	}

}
