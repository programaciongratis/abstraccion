package com.programaciongratis.abstraccion;

/**Una clase abstracta como ejemplo
 * para demostrar abstraccion en Java.
 * 
 * @author lnoria
 *
 */
public abstract class MiClaseAbstracta {
	// una propiedad normal como en cualquier clase
	// puedes crear getters and setters para esta propiedad
	private int propiedad;
	
	// una constante
	public static final int CONSTANTE = 1;
	
	// un metodo normal como en cualquier clase
	protected int sumar(int argumento1, int argumento2) {
		return argumento1 + argumento2;
	}
	
	// un metodo abstracto que tiene que ser
	// implementado por la clase que herede esta
	// clase abstracta.
	public abstract int restar(int argumento1, int argumento2);

}
