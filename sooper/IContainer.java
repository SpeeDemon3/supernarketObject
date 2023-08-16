package sooper;

import java.util.Set;

import sooper.enums.ContainerType;

/*
 * Interface de contenedor
 */
public interface IContainer {

	String getReference();
	int getVolume();
	int availableVolume();
	int getResistance();
	Set<IProduct> getProducts();
	ContainerType getType();
	boolean put(IProduct product); /* Metodo para comprobar si entra un producto en el contenedor */
	boolean resist(IProduct product); /* Metodo para comprobar si el contenedor resiste a ese producto */
	int getSurface(); /* Metodo para obtener la superficie del contenedor */
	
}
