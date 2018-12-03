package logic;

import view.FrmNumaleatorios;

public class LogNumAleatorios {

	public static Integer generarAleatorio() {
		Integer num1 = Integer.parseInt(FrmNumaleatorios.sprNum1.getValue().toString());
		Integer num2 = Integer.parseInt(FrmNumaleatorios.sprNum2.getValue().toString());
		int random = (int)(Math.random() * (num1-(num2+1)) + (num2 +1));
		return random;
	}
}
