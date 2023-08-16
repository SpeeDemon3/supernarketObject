package sooper.containers;

import sooper.enums.ContainerType;

public class Bag extends Container {
	
	private int width; /* Ancho de la bolsa */
	private int longBag; /* Largo  de la bolsa */
	
	
	/* Constructor */
	
	public Bag(int height, int weight, int maxWeightSopportedBag, String reference, int width, int longBag) {
		
		super(height, weight, maxWeightSopportedBag, reference);
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
	
	private int getDiameter() {
		return (int) ((2 * width) / Math.PI);
	}
	
	@Override
	public ContainerType getType() {
		return ContainerType.BAG;
	}
	
	@Override
	public int getSurface() {

		int radius = getDiameter() / 2;
		
		return (int) (Math.PI * radius * radius);
	}

}
