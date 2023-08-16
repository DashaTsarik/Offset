package com.itacademy.project2.offset;

public class Task8 {

	public static void main(String[] args) {
		double x;// хранит значение х
		double h; // шаг для изменения х
		int n; //хранит значение количества итераций (вычислений функции)
		
		h = 0.1;
		n = 1;
		
		System.out.println("---------------------------------------------------------");
		System.out.printf("|\t%2s\t|\t%2s\t|\t%8s\t|\n", "N", "X","F");
		System.out.println("---------------------------------------------------------");
		
		double f; //хранит значение функции
		for (x = 0.1; x <= 10; x = x + h) {
			f = Math.pow(x, 2) - Math.pow(Math.E, 2 * x) + 4;
			System.out.printf("|\t%2d\t|\t%2.2f\t|\t%8.2f\t|\n", n,x,f);
			if (f < 0) {
				break;
			}
			n++;
		}
		System.out.println("---------------------------------------------------------");
	}

}
