package sooper.containers;
import java.util.HashSet;
import java.util.Set;

import sooper.IContainer;
import sooper.IProduct;

public abstract class Container implements IContainer {
	
	/* ATRIBUTOS */
	
	private String reference;
	private Set<IProduct> products; /* Coleccion de productos */ 
	private int height; /* Alto del contenedor */
	private int weight;/* Peso del contenedor */

	

	/* Constructores */ 
	
	public Container(String reference, int height, int weight) {

		this.reference = reference;
		this.height = height;
		this.weight = weight;
		products = new HashSet<>();
		
	}
	
	
	/* METODOS */
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String getReference() {
		return reference;
	}

	@Override
	public int getVolume() {
		return height * getSurface();
	}

	@Override
	public int availableVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getResistance() {

		
		return 0;
	}

	@Override
	public Set<IProduct> getProducts() {
		return products;
	}

	@Override
	public boolean put(IProduct product) {
		// Compruebo si el contenedor resiste el producto
		boolean resitanceOk = resist(product); 
		// Compruebo si el producto tiene espacio en este contenedor
		boolean volumeOk = product.haveSpace();
		
		boolean compatibilityOk = true;
		for (IProduct p : products) {
			boolean compatibleOk = product.itsCompatibleWith(p);
			compatibilityOk &= compatibleOk; 
		}
		
		
		// Compruebo la compatibilidad
		boolean accept = resitanceOk && volumeOk && compatibilityOk;
		
		// Si lo acepta
		if (accept) {
			products.add(product); // Añado el producto
			product.put(this); // Informo al producto que a sido metido en este contenedor
		}
		
		return accept;
	}

	@Override
	public boolean resist(IProduct product) {
		// TODO Auto-generated method stub
		
		/* Podria hacer un condicional comprobando el
		 * peso del producto y saber si puede ser aguantado 
		 * por ese contenedor en concreto
		 */
		return false;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder("Contenedor: " + reference + " ["
				 + getType()
				 + "] (sup " + getSurface() + "cm2 - vol " + getVolume()
				 + "cm3 - resistencia " + getResistance() + "g).\n");
		
		if (products.isEmpty()) { // Si esta vacio
			sb.append("\t\tvacío\n");
		}
		
		for (IProduct p : products) {
			sb.append("\t\t" + p + "\n");
		}
		
		sb.append("\t\t>> Disponible vol " + availableVolume() + "cm3");
		
		return sb.toString();
	}
	
	
}
