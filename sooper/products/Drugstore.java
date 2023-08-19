package sooper.products;

import sooper.IProduct;
import sooper.enums.Category;

public class Drugstore extends Product{

	public Drugstore(String reference, int weight, int volume) {
		super(reference, weight, volume);
	}

	@Override
	public Category getCategory() {
	    // Devuelve la categoría del producto como "DROGUERIA"
		return Category.DROGUERIA;
	}

	
	@Override
	/**
	 * Verifica si el producto actual es compatible con el producto pasado como parámetro en función de las categorías.
	 * @param p Producto con el que se va a verificar la compatibilidad.
	 * @return True si el producto actual es compatible con el producto dado, basado en sus categorías; de lo contrario, False.
	 */
	public boolean itsCompatibleWith(IProduct p) {
		return !Category.ALIMENTACION.equals(p.getCategory())
				&& !Category.MASCOTAS.equals(p.getCategory());
	}

}
