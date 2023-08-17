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
		// Recorro los contenedores
		for (IContainer container : containers) {
			// Compruebo si el contenedor en el que estamos admite o no el producto que se desea añadir
			if (container.put(product)) { // Si retorna true
				// Retornamos el contenedor
				return container;
			}
			
		}
		// Si no encontramos ningun contenedor en el que añadir el producto retornamos null
		return null;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Pedido: " + reference + "\n");
		
		for (IContainer container : containers) {
			sb.append("\t" + container + "\n");
		}
	
		return sb.toString();
		
	}

}
