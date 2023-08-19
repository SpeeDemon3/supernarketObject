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
	/**
	 * Método que verifica si un producto es compatible con otro basado en sus categorías.
	 * En este caso, se verifica si el producto pertenece a la categoría de alimentación.
	 * @param p Producto con el que se verifica la compatibilidad.
	 * @return true si el producto es de la categoría de alimentación, false en caso contrario.
	 */
	public boolean itsCompatibleWith(IProduct p) {
		return Category.ALIMENTACION.equals(p.getCategory());
	}

}
