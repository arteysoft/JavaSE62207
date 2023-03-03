package com.educacionit.condicionales;

public class CondicionalSwitch {
	public static void main(String[] args) {
		int num1 = 7, num2 = 0, total = 0;
		char operador = '*';

		// permisos
		// menus
		// enumerados
		//
		switch (operador) {
		case 's':
		case '+':
			total = num1 + num2;
			break;
		case 'r':
		case '-':
			total = num1 - num2;
			break;
		case 'm':
		case '*':
			total = num1 * num2;
			break;
		case 'd':
		case '/':
			if (num2 == 0) {
				System.out.println("No se puede dividir por cero");
			} else {
				total = num1 / num2;
			}
			break;
		default:
			System.out.println("[" + operador + "] no es valido");
			break;
		}

		System.out.println(total);
	}
}
