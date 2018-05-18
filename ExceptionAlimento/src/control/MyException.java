package control;

import java.util.ArrayList;

import exception.BadFoodException;

public class MyException {

	private static ArrayList<String> alimentosAdequados = new ArrayList<String>();

	// construtor estático
	static {
		alimentosAdequados.add("tomate");
		alimentosAdequados.add("cebola");
		alimentosAdequados.add("alface");
	}

	static void checkFood(String nomeAlimento) throws BadFoodException {
		if (nomeAlimento != null) {
			nomeAlimento = nomeAlimento.toLowerCase();
		}

		if (alimentosAdequados.contains(nomeAlimento)) {
			System.out.println(nomeAlimento + " é um alimento adequado");
		} else {
			throw new BadFoodException();
		}
	}

	public static void main(String[] args) {
		try {
			checkFood("cebola");
			checkFood("pizza");
			checkFood("tomate");
			checkFood("alface");
		} catch (BadFoodException e) {
			System.out.println("Alimento inadequado");
		}
	}

}