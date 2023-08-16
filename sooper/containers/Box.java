package sooper.containers;

import sooper.enums.ContainerType;

public class Box extends Container {
	
	/* Atributos propios */
	private int width; /* Ancho de la caja */
	private int longBox; /* Largo  de la caja */
	
	/* Constructor */
	public Box (String reference, int height, int weight,  int maxWeightSopportedBox, int width, int longBox) {
		
		super(reference, height, weight, maxWeightSopportedBox);
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
		return ContainerType.BOX;
	}

	@Override
	public int getSurface() {
		return width * longBox;
	}

}
