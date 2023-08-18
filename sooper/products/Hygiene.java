package sooper.products;

import sooper.IProduct;
import sooper.enums.Category;

public class Hygiene extends Product{

	public Hygiene(String reference, int weight, int volume) {
		super(reference, weight, volume);
	}

	@Override
	public Category getCategory() {
		return Category.HIGIENE;
	}

	@Override
	public boolean itsCompatibleWith(IProduct p) {
		return !Category.ALIMENTACION.equals(p.getCategory());
	}

}
