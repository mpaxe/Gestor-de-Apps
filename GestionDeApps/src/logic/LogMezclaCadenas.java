package logic;

public class LogMezclaCadenas {

	public static String mezclaCadenas(String cad1, String cad2) {
		String res = "";
		if(cad1.length() < cad2.length()) {
			for(int i = 0; i < cad1.length(); i++) {
				res += cad1.charAt(i)+"" + cad2.charAt(i);
				if(cad1.length()-1 == i) {
					res += cad2.substring(cad1.length());
				}
			}
		}else if(cad1.length() > cad2.length()) {
			for(int i = 0; i < cad2.length(); i++) {
				res += cad1.charAt(i)+"" + cad2.charAt(i);
				if(cad2.length()-1 == i) {
					res += cad1.substring(cad2.length());
				}
			}
		}else {
			for(int i = 0; i < cad2.length(); i++) {
				res += cad1.charAt(i)+"" + cad2.charAt(i);
			}
		}
		return res;
	}

}
