package com.itacademy.project2.offset;

public class Task5 {

	public static void main(String[] args) {
		int n; //количество итераций/вычислений
		double a; //значение А
		
		n = 1;
		a = 1;
		
		System.out.println("---------------------------------------------------------");
		System.out.printf("|\t%2s\t|\t%3s\t|\t%8s\t|\n", "N", "X","Y");
		System.out.println("---------------------------------------------------------");

		double y; // функция Y
		for (double x = -2 * a; n <= 30; x = x + a / 5) {
			if (x <= 0) {
				y = (a / 2) * (Math.pow(Math.E, x / a) + Math.pow(Math.E, -x / a));
				System.out.printf("|\t%2d\t|\t%2.2f\t|\t%2.6f\t|\n", n,x,y);
				n++;
			}
			if (x > 0) {
				y = 4 * Math.pow(a, 3) / (Math.pow(x, 2) + 4 * Math.pow(a, 2));
				System.out.printf("|\t%d\t|\t%.2f\t|\t%.6f\t|\n", n,x,y);
				n++;
			}
		}
		System.out.println("---------------------------------------------------------");
	}

}
