package ex1;

import java.util.Scanner;

public class PasswordValidator {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String S = ent.nextLine();
		char aux;
		boolean maiuscula = false;
		boolean minuscula = false;
		boolean digito = false;
		boolean especial = true;

		if (S.length() >= 6 && S.length() <= 32) {
			for (int i = 0; i < S.length(); i++) {
				aux = S.charAt(i);
				if (Character.isDigit(aux)) {
					digito = true;
				} else if (Character.isUpperCase(aux)) {
					maiuscula = true;
				} else if (Character.isLowerCase(aux)) {
					minuscula = true;
				} else if (!S.matches("[^a-zA-Z0-9 ]")) {
					especial = false;
				}
			}
			if (maiuscula && minuscula && digito && especial) {
				System.out.println("Senha valida");
			} else {
				System.out.println("Senha invalida");
			}
		}
		ent.close();
	}

}
