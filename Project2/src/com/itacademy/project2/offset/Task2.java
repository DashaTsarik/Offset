package com.itacademy.project2.offset;

public class Task2 {

	public static void main(String[] args) {
		
		int n;
		double a;
		double b;
		
		n = 1;
		a = 0.5;
		b = 1.0;
		
		System.out.println("-----------------------------------------------------------------");
		System.out.printf("|\t%2s\t|\t%8s\t|\t%8s\t|\n", "n", "x","F");
		System.out.println("-----------------------------------------------------------------");
		
		double f;
		for (double x = a; x <= b; x = x + 0.05) {
			f = Math.sqrt(Math.pow(Math.E, 2.2*x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3))) + 1.7;
			System.out.printf("|\t%d\t|\t%.6f\t|\t%.6f\t|\n", n,x,f);
			n++;
		}
		System.out.println("-----------------------------------------------------------------");
	}

}
