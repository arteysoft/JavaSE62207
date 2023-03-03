package com.educacionit.condicionales;

public class CondicionaalAnidado {
	public static void main(String[] args) {
		int num1 = 2, num2 = 2, total = 0;

		char operador = ' ';

		if (operador == '+' || operador == 's') {
			total = num1 + num2;
		} else if (operador == '-' || operador == 'r') {
			total = num1 - num2;
		} else if (operador == '*') {
			total = num1 * num2;
		} else if (operador == '/' && num2 != 0) {
			total = num1 / num2;
		} else if (operador == '/' && num2 == 0) {
			System.out.println("No se puede dividir por cero");
		} else if (operador == '%') {
			total = num1 % num2;
		} else {
			System.out.println("[" + operador + "] no es valido");
		}

		/*
		 * else if (operador == '/') { if (num2==0) {
		 * System.out.println("No se puede dividir por cero"); }else { total = num1 /
		 * num2; } }
		 */

		System.out.println(total);
	}
}
