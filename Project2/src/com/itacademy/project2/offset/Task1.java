package com.itacademy.project2.offset;

public class Task1 {

	public static void main(String[] args) {
		double x;
		x = 0.5;
		
		double f;
		f = Math.sqrt(Math.pow(Math.E, 2.2*x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3))) + 1.7;
		
		System.out.printf("При х = %.1f F = %.5f", x,f);
	

	}

}
