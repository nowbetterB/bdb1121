package ex01;

import java.util.Scanner;

public class return1 {
	/*
	 * 문제 1
	 * 양의 정수 N을 입력받아서
	 * 1부터 N까지의 홀수의 합을 구한다.
	 */
/*	public static void main(String[] args) {
	
		int sum = 0;
			
		for(int i=1; i<=27; i= i+2) {
				sum += i;}
		System.out.println("Sum = " + sum);
	*/
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("양의 정수 입력 >> ");
		
		int N = SC.nextInt();
		int sum = 0;
		
		for(int i=1; 1<=N; 1++) {
			if(i% 2 ==1)
				sum += i;
		}
		System.out.println("N까지의 홀수 합: " + sum)
		}
		}

	}

}
