package sooper.products;

import sooper.IProduct;
import sooper.enums.Category;

public class Hygiene extends Product{

	public Hygiene(String reference, int weight, int volume) {
		super(reference, weight, volume);
	}

	@Override
	public Category getCategory() {
	    // Devuelve la categoría del producto como "HIGIENE"
		return Category.HIGIENE;
	}

	@Override
	public boolean itsCompatibleWith(IProduct p) {
	    // Verifica si el producto pasado como parámetro no tiene la categoría "ALIMENTACION"
	    // para determinar si es compatible con el producto actual
		return !Category.ALIMENTACION.equals(p.getCategory());
	}

}
