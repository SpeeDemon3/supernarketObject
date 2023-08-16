package sooper.containers;
import java.util.Set;

import sooper.IContainer;
import sooper.IProduct;

public abstract class Container implements IContainer {
	
	/* ATRIBUTOS */
	
	private String reference;
	private Set<IProduct> products; /* Coleccion de productos */ 
	private int height; /* Alto del contenedor */
	private int weight;/* Peso del contenedor */
	private int maxWeightSopportedBox = 15; /* Peso maximo soportado por el contenedor 'caja' */
	private int maxWeightSopportedBag = 5;/* Peso maximo soportado por el contenedor 'bolsa' */		
	

	/* Constructores */ 
	
	public Container(String reference, int height, int weight, int maxWeightSopportedBox) {

		this.reference = reference;
		this.height = height;
		this.weight = weight;
		this.maxWeightSopportedBox = maxWeightSopportedBox;
	}
	
	public Container(int height, int weight, int maxWeightSopportedBag, String reference) {

		this.height = height;
		this.weight = weight;
		this.maxWeightSopportedBag = maxWeightSopportedBag;
		this.reference = reference;
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
		
		if(this.weight <= 3) {
			return maxWeightSopportedBag;
		}
		
		return maxWeightSopportedBox;
	}

	@Override
	public Set<IProduct> getProducts() {
		return products;
	}

//	@Override
//	public String getType() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public boolean put(IProduct product) {
		// TODO Auto-generated method stub
		return false;
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

	
	
}
