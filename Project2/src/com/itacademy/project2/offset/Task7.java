package com.itacademy.project2.offset;

public class Task7 {

	public static void main(String[] args) {
		int n; //количество значений Х
		int m; //общее количество значений Z
		
		double hX; //шаг для изменения Х
		double hZ; //шаг для изменения Z
		
		n = 1;
		m = 1;
		
		hX = 0.5;
		hZ = 0.2;
		
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.printf("|\t%s\t|\t%s\t|\t%3s\t|\t%3s\t|\t%8s\t|\n", "N", "M","X","Z","F");
		System.out.println("-----------------------------------------------------------------------------------------");
		
		double f; // функция F
		
		for (double x = -5; x <= 0; x = x + hX) {
			int k = 1; //считает количество значений z при заданном значении x
			for (double z = 0.2; z <= 1; z = z + hZ) {
				f = Math.sqrt(Math.pow(z, 2) + Math.pow(x, 2)) * Math.log(z) + 
					Math.abs(Math.log(z)) / Math.sqrt(Math.pow(x, 2) - Math.pow(z, 2) + 3.2);
				if (k > 1) {
					System.out.printf("|\t\t|\t%d\t|\t%3.2f\t|\t%3.2f\t|\t%10.5f\t|\n", m,x,z,f);
				} else {
				System.out.printf("|\t%d\t|\t%d\t|\t%3.2f\t|\t%3.2f\t|\t%10.5f\t|\n", n,m,x,z,f);
				}
				k++;
				m++;
			}
			n++;
			
		}
		System.out.println("-----------------------------------------------------------------------------------------");

	}

}
