package com.itacademy.project2.offset;

public class Task3 {

	public static void main(String[] args) {
		double x;// начальное значение х
		int n; // количество итераций
		
		x = 0.5;
		n = 20;
		
		double sum;// сумма произведений
		sum = 0;
		for (int k = 1; k <= n; k++) {
			sum = sum + Math.sqrt(n * Math.PI) * ((Math.sin(k * x / 2) + Math.sin((k * x - 1) / 2)) / Math.pow(Math.E, x - 1.0 / k));
		}
		System.out.println("Sum = " + sum);

	}

}
