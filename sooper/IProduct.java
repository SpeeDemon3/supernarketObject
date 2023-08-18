package sooper;

import sooper.enums.Category;

/**
 * Interface de producto
 */
public interface IProduct {

	String getReference();
	int getWeight();
	int getVolume();
	Category getCategory();
	boolean itsCompatibleWith(IProduct p); /* Metodo para saber si un producto puede ir en el mismo contenedor que otro */
	boolean haveSpace(IContainer container); /* Metodo para saber si cabe o no en el contenedor */
	void put(IContainer container); /* Metodo para meter un producto en el contenedor */
	
}
