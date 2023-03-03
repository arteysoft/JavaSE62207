package com.educacionit.ciclos;

public class Para {
	public static void main(String[] args) {
		int total = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println(i);

			if (i == 5) {
				continue;
			}

			if (total >= 30) {
				break;
			}
			total += i;
			System.out.println("Total\t" + total);

		}

	}
}
