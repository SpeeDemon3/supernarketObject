package sooper.products;

import sooper.IProduct;
import sooper.enums.Category;

public class Pets extends Product {

	public Pets(String reference, int weight, int volume) {
		super(reference, weight, volume);
	}

	@Override
	public Category getCategory() {
	    // Devuelve la categoría del producto como "MASCOTAS"
		return Category.MASCOTAS;
	}

	@Override
	public boolean itsCompatibleWith(IProduct p) {
	    // Verifica si el producto pasado como parámetro no tiene la categoría "DROGUERIA"
	    // para determinar si es compatible con el producto actual
		return !Category.DROGUERIA.equals(p.getCategory());
	}

}
