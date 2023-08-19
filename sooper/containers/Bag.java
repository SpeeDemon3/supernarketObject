package sooper.containers;

import sooper.enums.ContainerType;

public class Bag extends Container {
	
	private int width; /* Ancho de la bolsa */
	private int longBag; /* Largo  de la bolsa */
	
	
	/* Constructor */
	
	public Bag(String reference, int height, int weight, int resistance, int width, int longBag) {
		
		super(reference, weight, height, resistance);
		this.width = width;
		this.longBag = longBag;
		
	}

	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getLongBag() {
		return longBag;
	}


	public void setLongBag(int longBag) {
		this.longBag = longBag;
	}
	
	/**
	 * Calcula y devuelve el diámetro del círculo formado por el contenedor.
	 * @return Diámetro del círculo del contenedor.
	 */
	private int getDiameter() {
		return (int) ((2 * width) / Math.PI);
	}
	
	@Override
	public ContainerType getType() {
		return ContainerType.BAG;
	}
	
	@Override
	/**
	 * Calcula y devuelve la superficie del círculo formado por el contenedor.
	 * @return Superficie del círculo del contenedor.
	 */
	public int getSurface() {

		int radius = getDiameter() / 2;
		
		return (int) (Math.PI * radius * radius);
	}


}
