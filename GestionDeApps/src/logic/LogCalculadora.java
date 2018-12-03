package logic;

import view.FrmCalculadora;

public class LogCalculadora {

	private static Double operador1, operador2;
	private static Double resultado = 0.0;
	private static String operacion = "";

	public static void impresionPantalla(String num) {
		
		switch (num) {
		case "1":
			FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"1");
			break;
		case "2":
			FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"2");
			break;
		case "3":
			FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"3");
			break;
		case "4":
			FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"4");
			break;
		case "5":
			FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"5");
			break;
		case "6":
			FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"6");
			break;
		case "7":
			FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"7");
			break;
		case "8":
			FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"8");
			break;
		case "9":
			FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"9");
			break;
		case "0":
			FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"0");
			break;
		case ".":
			if(!FrmCalculadora.txtPantalla.getText().equals("") && !FrmCalculadora.txtPantalla.getText().contains(".")) {
				FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+".");
			}	
			break;
		default:
			break;
		}
		
	}

	public static void borraPantallaLog() {
		FrmCalculadora.txtPantalla.setText(null);
	}

	public static void borraUltimoNumLog() {
		if(!FrmCalculadora.txtPantalla.getText().equals("")) {
			FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText().substring(0, FrmCalculadora.txtPantalla.getText().length() - 1));
		}
	}

	public static void operacionLog(String op) {

		switch (op) {
		case "+":
			operador1 = Double.parseDouble(FrmCalculadora.txtPantalla.getText());
			FrmCalculadora.txtPantalla.setText(null);
			operacion = "+";
			break;
		case "-":
			operador1 = Double.parseDouble(FrmCalculadora.txtPantalla.getText());
			FrmCalculadora.txtPantalla.setText(null);
			operacion = "-";
			break;
		case "×":
			operador1 = Double.parseDouble(FrmCalculadora.txtPantalla.getText());
			FrmCalculadora.txtPantalla.setText(null);
			operacion = "×";
			break;
		case "÷":
			operador1 = Double.parseDouble(FrmCalculadora.txtPantalla.getText());
			FrmCalculadora.txtPantalla.setText(null);
			operacion = "÷";
			break;
		case "√":
			operador1 = Double.parseDouble(FrmCalculadora.txtPantalla.getText());
			resultado = Math.sqrt(operador1);
			FrmCalculadora.txtPantalla.setText(resultado.toString());
			break;
		case "%":
			operador1 = Double.parseDouble(FrmCalculadora.txtPantalla.getText());
			FrmCalculadora.txtPantalla.setText(null);
			operacion = "%";
			break;
		case "=":
			operador2 = Double.parseDouble(FrmCalculadora.txtPantalla.getText());
			switch (operacion) {
			case "+":
				resultado = operador1 + operador2;				
				break;
			case "-":
				resultado = operador1 - operador2;				
				break;
			case "×":
				resultado = operador1 * operador2;				
				break;
			case "÷":
				resultado = operador1 / operador2;				
				break;
			case "%":
				resultado = (operador1 * operador2)/ 100;				
				break;
			}
			FrmCalculadora.txtPantalla.setText(resultado.toString());
			resultado = 0.0;
		}
	}

}
