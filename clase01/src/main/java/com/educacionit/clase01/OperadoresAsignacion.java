package com.educacionit.clase01;

public class OperadoresAsignacion {
	public static void main(String[] args) {
		int num1 = 5, num2 = 6;
		int total = 0;

		total = num1 + num2;
		System.out.println(total);
		total = total + 8;
		System.out.println(total);
		total += 8;
		System.out.println(total);
		total -= 9;
		System.out.println(total);
		total *= 15;
		System.out.println(total);
		total /= 3;
		System.out.println(total);
		total %= 3;
		System.out.println(total);
		total += 1;
		System.out.println(total);
		total++;
		System.out.println(total);
		total -= 1;
		System.out.println(total);
		total--;

	}
}
