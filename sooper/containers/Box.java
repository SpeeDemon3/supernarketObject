package sooper.containers;

import sooper.IProduct;
import sooper.enums.ContainerType;

public class Box extends Container {
	
	/* Atributos propios */
	private int width; /* Ancho de la caja */
	private int longBox; /* Largo  de la caja */
	
	/* Constructor */
	public Box (String reference, int height, int weight, int width, int longBox) {
		
		super(reference, height, weight, 0);
		this.width = width;
		this.longBox = longBox;
		
	}
	
	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getLongBox() {
		return longBox;
	}


	public void setLongBox(int longBox) {
		this.longBox = longBox;
	}
	
	
	@Override
	public ContainerType getType() {
	    // Devuelve el tipo de contenedor como "BOX"
		return ContainerType.BOX;
	}

	@Override
	public int getSurface() {
	    // Calcula y devuelve el area superficial del contenedor multiplicando su ancho por su largo
		return width * longBox;
	}
	
	@Override
	public boolean resist(IProduct product) {
		return true;
	}
	
	

}
