package sooper.products;

import sooper.IProduct;
import sooper.enums.Category;

public class Pets extends Product {

	public Pets(String reference, int weight, int volume) {
		super(reference, weight, volume);
	}

	@Override
	public Category getCategory() {
		return Category.MASCOTAS;
	}

	@Override
	public boolean itsCompatibleWith(IProduct p) {
		return Category.DROGUERIA.equals(p.getCategory());
	}

}
