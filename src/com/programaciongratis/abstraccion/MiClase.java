package com.programaciongratis.abstraccion;

public class MiClase extends MiClaseAbstracta {

	@Override
	public int restar(int argumento1, int argumento2) {
		return argumento1 - argumento2;
	}

	// Como sumar tiene modificador de acceso "protected"
	// solo puede ser accedido por una clase que lo hereda.
	// por eso creamos una clase public que internamente
	// llama al metodo protected de la clase publica.
	public int sumar(int argumento1, int argumento2) {
		
		// para llamar al metodo de la clase padre
		// usamos la palabra clave "super".
		return super.sumar(argumento1, argumento2);
	}
}
