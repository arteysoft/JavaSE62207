package com.educacionit.arreglos;

public class Unidimesionales {
	public static void main(String[] args) {
		int[] numeros1 = { 2, 3, 67, 89 };// {"",""} {'',''} {true,false}
		long numeros2[];
		numeros2 = new long[3216516];

		for (int i = 0; i < numeros1.length - 1; i++) {
			System.out.println(numeros1[i]);
		}
		System.out.println("*********************************");
		for (int i = 0; i < numeros2.length; i++) {
			numeros2[i] = Math.round(Math.random()*100);
			System.out.println(numeros2[i]);
			
		}
		

		/*
		 * int num = 5; numeros2[0] = 6; numeros2[1] = 5; numeros2[2] = -5;
		 * System.out.println(num); System.out.println(numeros1[0]);
		 * System.out.println(numeros2[0]); System.out.println(numeros2[1]);
		 * System.out.println(numeros2[2]); System.out.println(numeros1.length);
		 * System.out.println(numeros2.length);
		 */

	}
}
