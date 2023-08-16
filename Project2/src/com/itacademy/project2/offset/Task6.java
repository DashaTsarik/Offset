package com.itacademy.project2.offset;

public class Task6 {

	public static void main(String[] args) {
		double a; //значение А
		double b; //значение В
		double m; //значение М
		int n; // счетчик количества значений функции F для 20 значений K
		int quantityOfK; /*общее количество значений, 
		которые можжет принимать аргумент K в указанном диапазоне*/
		
		a = 3 * Math.pow(10, 3);
		b = 6 * Math.pow(10, 4);
		m = 4;
		
		double t1; // начало первого диапазона для значений F
		double t2; // конец первого диапазона для значений F
		double t3; //начало второго диапазона для значений F
		double t4; //конец второго диапазона для значений F
		
		t1 = Math.sqrt(a + b + m);
		t2 = m * Math.sqrt(a + b);
		t3 = Math.sqrt(a * b * m);
		t4 = m * Math.sqrt(a * b);
		
		System.out.println("---------------------------------------------------------");
		System.out.printf("|\t%2s\t|\t%2s\t|\t%8s\t|\n", "N", "K","F");
		System.out.println("---------------------------------------------------------");
		
		double f; //функция f
		n = 1;
		quantityOfK = 0;
		for (int k = -30; k <= 60; k++) {
			f = Math.pow(k, 3) - 25 * Math.pow(k, 2) + 50 * k + 1000;
			if (k > - 6) {
				if ((f >= t1 && f <= t2 && n <= 20) || (f >= t3 && f <= t4 && n <= 20) ) {
					System.out.printf("|\t%2d\t|\t%2d\t|\t%8.2f\t|\n", n,k,f);
			    } else if (n <= 20){
					System.out.printf("|\t%2d\t|\t%2d\t|\t\t\t|\n", n,k);
				}
				n++;
			} 
			quantityOfK++;
		}
		System.out.println("---------------------------------------------------------");
		System.out.println("Общее количество значений аргумента K в указанном диапазоне  = " + quantityOfK);
	}
}
