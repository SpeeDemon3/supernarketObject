package sooper.products;

import sooper.IProduct;
import sooper.enums.Category;

/*
 * Clase alimentacion
 */
public class Feeding extends Product {

	public Feeding(String reference, int weight, int volume) {
		super(reference, weight, volume);
	}

	@Override
	public Category getCategory() {
		return Category.ALIMENTACION;
	}

	@Override
	public boolean itsCompatibleWith(IProduct p) {
		// TODO Auto-generated method stub
		return false;
	}

}
