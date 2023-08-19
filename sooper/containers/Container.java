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
	private int resistance; /* Resistencia que tiene el contenedor */

	

	/* Constructores */ 
	
	public Container(String reference, int height, int weight, int resistance) {

		this.reference = reference;
		this.height = height;
		this.weight = weight;
		this.resistance = resistance;
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
	    // Calcula y devuelve el volumen disponible en el contenedor restando el volumen ocupado
	    // al volumen total del contenedor (obtenido mediante el metodo getVolume())
		return getVolume() - busyVolume();
	}

	private int busyVolume() {
	    // Inicializa la variable para almacenar el volumen ocupado
		int result = 0;
	    // Itera a través de los productos en el contenedor
		for (IProduct p : products) {
			result += p.getVolume();
		}
	    // Devuelve el volumen total ocupado por los productos
		return result;
	}
	
	@Override
	public int getResistance() {		
		return resistance;
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
		boolean volumeOk = product.haveSpace(this);
		
		boolean compatibilityOk = true;
        // Compruebo si el producto es compatible con el producto actual en el contenedor
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
	    // Compara la resistencia del contenedor con el peso del producto.
	    // Si la resistencia del contenedor es mayor que el peso del producto,
	    // devuelve true, lo que indica que el contenedor puede resistir el producto.
	    // De lo contrario, devuelve false.
		return resistance > product.getWeight();
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
