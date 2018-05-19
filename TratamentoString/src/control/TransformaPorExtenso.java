package control;

public class TransformaPorExtenso {
	
	public static void main(String[] args) {
		String numeroExtenso = transformaEmExtenso(616516516);
		System.out.println(numeroExtenso);
		
	}
	
	public static String transformaEmExtenso(int numero) {
		
		String numeroString = Integer.toString(numero);
		char[] caracteresNumeros = numeroString.toCharArray();
		
		
		String extenso = "";
		
		for (int i = 0; i < caracteresNumeros.length; i++) {
			extenso += mapeiaDigitoPalavra(caracteresNumeros[i]);
			if(i != caracteresNumeros.length-1) {
				extenso += ", ";
			}
		}
		return extenso;
	}
	
	private static String mapeiaDigitoPalavra(char digito) {
		
		switch (digito) {
		case '0':
			return "zero";
			
		case '1':
			return "um";
		case '2':
			return "dois";
		case '3':
			return "três";
		case '4':
			return "quatro";
		case '5':
			return "cinco";
		case '6':
			return "seis";
		case '7':
			return "sete";
		case '8':
			return "oito";
		case '9':
			return "nove";
	
		
		
		}
		return "";
		
		
	}

}
