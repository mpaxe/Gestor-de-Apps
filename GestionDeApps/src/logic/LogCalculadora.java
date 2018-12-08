package logic;

import javax.swing.JButton;

import view.FrmCalculadora;

public class LogCalculadora {

	private static Double operador1, operador2;
	private static Double resultado = 0.0;
	private static String operacion = "";
	private static Boolean signo = false;	//false igual positivo

	public static void impresionPantalla(JButton btn) {
		
		switch (btn.getText()) {
		case "1":
			if(signo) {
				FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"-");
				signo = false;
			}
			FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"1");
			break;
		case "2":
			if(signo) {
				FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"-");
				signo = false;
			}
			FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"2");
			break;
		case "3":
			if(signo) {
				FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"-");
				signo = false;
			}
			FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"3");
			break;
		case "4":
			if(signo) {
				FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"-");
				signo = false;
			}
			FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"4");
			break;
		case "5":
			if(signo) {
				FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"-");
				signo = false;
			}
			FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"5");
			break;
		case "6":
			if(signo) {
				FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"-");
				signo = false;
			}
			FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"6");
			break;
		case "7":
			if(signo) {
				FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"-");
				signo = false;
			}
			FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"7");
			break;
		case "8":
			if(signo) {
				FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"-");
				signo = false;
			}
			FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"8");
			break;
		case "9":
			if(signo) {
				FrmCalculadora.txtPantalla.setText(FrmCalculadora.txtPantalla.getText()+"-");
				signo = false;
			}
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

	public static void operacionLog(JButton btn) {

		switch (btn.getText()) {
		case "+":
			if(!FrmCalculadora.txtPantalla.getText().equals("")) {
				if(signo) {
					operador1 = Double.parseDouble(FrmCalculadora.txtPantalla.getText())*(-1);
				}else{
					operador1 = Double.parseDouble(FrmCalculadora.txtPantalla.getText());				
				}
				FrmCalculadora.txtPantalla.setText(null);
				operacion = "+";
			}
			break;
		case "-":
			if(!FrmCalculadora.txtPantalla.getText().equals("")) {
				if(signo) {
					operador1 = Double.parseDouble(FrmCalculadora.txtPantalla.getText())*(-1);
				}else{
					operador1 = Double.parseDouble(FrmCalculadora.txtPantalla.getText());				
				}
				FrmCalculadora.txtPantalla.setText(null);
				operacion = "-";
			}else {
				signo = true;
			}
			
			break;
		case "×":
			if(!FrmCalculadora.txtPantalla.getText().equals("")) {
				if(signo) {
					operador1 = Double.parseDouble(FrmCalculadora.txtPantalla.getText())*(-1);
				}else{
					operador1 = Double.parseDouble(FrmCalculadora.txtPantalla.getText());				
				}
				FrmCalculadora.txtPantalla.setText(null);
				operacion = "×";
			}
			break;
		case "÷":
			if(!FrmCalculadora.txtPantalla.getText().equals("")) {
				if(signo) {
					operador1 = Double.parseDouble(FrmCalculadora.txtPantalla.getText())*(-1);
				}else{
					operador1 = Double.parseDouble(FrmCalculadora.txtPantalla.getText());				
				}
				FrmCalculadora.txtPantalla.setText(null);
				operacion = "÷";
			}
			break;
		case "√":
			if(!FrmCalculadora.txtPantalla.getText().equals("")) {
				operador1 = Double.parseDouble(FrmCalculadora.txtPantalla.getText());
				resultado = Math.sqrt(operador1);
				FrmCalculadora.txtPantalla.setText(resultado.toString());
			}
			break;
		case "%":
			if(!FrmCalculadora.txtPantalla.getText().equals("")) {
				operador1 = Double.parseDouble(FrmCalculadora.txtPantalla.getText());
				FrmCalculadora.txtPantalla.setText(null);
				operacion = "%";
			}
			break;
		case "=":
			if(!FrmCalculadora.txtPantalla.getText().equals("")) {
				operador2 = Double.parseDouble(FrmCalculadora.txtPantalla.getText());				
			}
			switch (operacion) {
			case "+":
				resultado = operador1 + operador2;		
				operador1 = 0.0;
				operador2 = 0.0;
				break;
			case "-":
				resultado = operador1 - operador2;
				operador1 = 0.0;
				operador2 = 0.0;
				break;
			case "×":
				resultado = operador1 * operador2;	
				operador1 = 0.0;
				operador2 = 0.0;
				break;
			case "÷":
				resultado = operador1 / operador2;
				operador1 = 0.0;
				operador2 = 0.0;
				break;
			case "%":
				resultado = (operador1 * operador2)/ 100;
				operador1 = 0.0;
				operador2 = 0.0;
				break;
			}
			FrmCalculadora.txtPantalla.setText(resultado.toString());
			resultado = 0.0;
		}
	}

}
