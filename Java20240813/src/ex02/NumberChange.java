package ex02;

/*
 * num1 = 20;
 * num2 = 10;
 * 두 수 교환해서 출력
 */

public class NumberChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20;
		int num2 = 10;
		
		//sysout = > ctrl + space
		
		System.out.println("before------");
		System.out.println("num1 : " + num1 + ", num2 : "+ num2);
		
		//두 수를 바꾸기 (더미를 만들어서 서로 옮겨주기)
		
		int tmp = num1; //int를 사용하였으면 통일해주기(같은 바이트량)
		num1 = num2;
		num2 = tmp;
		
		System.out.println("after------");
		System.out.println("num1 : " + num1 + ", num2 : "+ num2);
		
	}

}
