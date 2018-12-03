package controller;

import logic.LogNumAleatorios;

public class CtrNumAleatorios {

	public static Integer calcularAleatorio() {
		
		Integer random = LogNumAleatorios.generarAleatorio();
		
		return random;
	}
}
