package com.programaciongratis.aplicaciones;

import com.programaciongratis.abstraccion.MiClase;
import com.programaciongratis.abstraccion.MiClaseAbstracta;

public class AplicacionMain {
	
	public static void main(String[] args) {
		
		// Aqui creamos una variable con tipo MiClaseAbstracta
		// Esta variable solo puede invocar metodos de la clase MiClaseAbstracta.
		// No puede invocar metodos de la clase MiClase.
		MiClaseAbstracta variable = new MiClase();
		
		// esta variable si puede invocar metodos de la clase MiClaseAbstracta
		// que sean publicos. Caso contrario, no puede.
		MiClase variable2 = new MiClase();
		
		System.out.println("invocando restar: " + variable.restar(5, 2));
		
		System.out.println("invocado sumar: " + variable2.sumar(5, 2));
		
	}

}
