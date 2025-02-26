package ex01;

import java.util.Scanner;

/*
 * 나이하고 이름을 키보드 통해서 입력 받아서
 * 출력
 */
public class InputNameAge{

	public static void main(String[] args) {
		/*
		 * 기본 자료형 -> 정수형
		 * byte, short, int, long
		 * 실수형
		 * 	float, duble
		 * 논리형
		 * 	boolean
		 * 문자형
		 * 	char
		 */
		Scanner sc = new Scanner(System.in); // 키보드 통해서 입력받을 때
		
		System.out.println("이름을 입력하세요 : ");
		
		String name = sc.nextLine();
		/* 
		 * String은 기본 자료형아니므로 참조자료형 문자열 입력 받을 때 사용
		*/
		
		System.out.println("나의 이름은 " + name + "입니다.");

		System.out.println("나이를 입력하세요 : ");
		
		int age = sc.nextInt();
		
		System.out.println( name + "님의 나이는 " + age + "세 입니다.");
		
		System.out.println("주소를 입력하세요.");
				
		String adress = sc.next();
		
		System.out.println(name + "님의 주소는 " + adress + "입니다.");
		
		
		
		System.out.println(adress + "에 거주하시는 " + age + "세의 " + name + "님, 환영합니다. " + "모든 정보가 확인되었습니다!");
		

	}

}
