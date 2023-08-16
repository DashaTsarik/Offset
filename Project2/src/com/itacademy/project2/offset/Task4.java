package com.itacademy.project2.offset;

public class Task4 {

	public static void main(String[] args) {
		int n; //счетчик количества точек в указанной области
		
		n = 0;
		
		for (int x = -2; x <= 2; x++) {
			if (x >= -2 && x <= -1) {
				for(int y = 0; y <=2; y++) {
					n++;
				}	
			} else if(x == 0) {
				for (int y = -1; y <= 2; y++) {
					n++;
				}
			} else {
				for (int y = -1; y <= 1; y++) {
					n++;
				}
			}
			
		}
		System.out.println ("Количество точек заданной области n = " + n);

	}

}
