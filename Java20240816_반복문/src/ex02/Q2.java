package ex02;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		/*문제2
		 * 다섯명의 학생 cm점수를 키보드로 입력 받아서 출력하기
		 * -> 입력시에도 반복분
		 * ->출력시에도 반복문
		 */

	/*	Scanner sc = new Scanner(System.in);
		
		System.out.println("컴퓨터 점수 >> ");
		int a;
		int[] nArr = new int[5];
				
		for(a=1; a<=5; a++);
		System.out.println(nArr[a]);
		
		int[] nArr1 = new int [5];
		
		int b;
		
		for(b=1; b<=5; b++);
		System.out.println(nArr1[b]);*/

		
		int[] com= new int[5]; // int크기 5명 방 설정
		
	Scanner sc = new Scanner(System.in);
	
		//입력
	for(int i=0; i<5; i++) {
			System.out.printf("%d번째 학생 com점수 입력 >> ", i+1);
				com[i] = sc.nextInt();
			}
		//출력
	for(int i=0; i<5; i++) {
			System.out.print(com[i] + ", ");}
	
	
	//최대값 구하기
	int max=0;
	for(int i=0; i<5; i++) {
		if(com[i]>max) //최대값 구함
			max = com[i];
	}
	System.out.println("최대값 : " + max);
				
		
	//총점과 평균 구하기
	
	/*int[] nArr = new int[5];
	
	int sum = 0;
	for(int a=1; a<=5; a=a+1) {
		sum+=a;}
	
	System.out.println("총 합 = " + sum);
	
	System.out.println("평균 = " + sum/5);
		}
		}*/

	int sum= 0;
	for(int i=0; i<5; i++)
	{sum += com[i];}
	System.out.println("총점 : " +sum);
	
	double avg = sum/5.0;
	System.out.printf("평균 : %.2f\n", avg);
			
	}
}
	
	
	
