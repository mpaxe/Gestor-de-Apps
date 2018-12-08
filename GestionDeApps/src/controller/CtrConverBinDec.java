package controller;

import logic.LogConvBinADec;
import view.FrmConversorBinarioADecimal;

public class CtrConverBinDec {

	public static void convierteADecimal() {
		FrmConversorBinarioADecimal.lblResult.setText("Decimal: "+LogConvBinADec.convADecimal());
	}

}
