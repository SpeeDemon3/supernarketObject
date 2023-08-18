package sooper.products;

import sooper.IProduct;
import sooper.enums.Category;

public class Drugstore extends Product{

	public Drugstore(String reference, int weight, int volume) {
		super(reference, weight, volume);
	}

	@Override
	public Category getCategory() {
		return Category.DROGUERIA;
	}

	@Override
	public boolean itsCompatibleWith(IProduct p) {
		return !Category.ALIMENTACION.equals(p.getCategory())
				&& !Category.MASCOTAS.equals(p.getCategory());
	}

}
