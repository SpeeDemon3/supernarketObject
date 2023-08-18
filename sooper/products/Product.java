package sooper.products;

import sooper.IContainer;
import sooper.IProduct;

public abstract class Product implements IProduct {
	
	// Atributos
	private String reference; /* Referencia */
	private int weight; /* Peso */
	private int volume; /* Volumen */
	private IContainer container;

	// Constructor
	public Product(String reference, int weight, int volume) {
		
		this.reference = reference;
		this.weight = weight;
		this.volume = volume;
		
	}
	
	// Metodos
	@Override
	public String getReference() {
		return reference;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public int getVolume() {
		return volume;
	}

	@Override
	public boolean haveSpace(IContainer container) {
		return container.availableVolume() > volume;
	}

	@Override
	public void put(IContainer container) {
		this.container = container;
	}
	
	@Override
	public String toString() {
		return "Referencia: " + this.reference + " Peso: " + this.weight + " Volumen: " + this.volume;
	}

}
