package ex04;

import java.util.Scanner;

public class new1 {

	public static void main(String[] args) {
	 
		 Scanner sc = new 	Scanner(System.in);
		
		System.out.println("나이를 입력하세요.");
			
		int age = sc.nextInt();
			
		if(age >= 18) {
			System.out.println("성인입니다.");
			System.out.println("18세 이상은 성인입니다.");}
	
		else {
			System.out.println("미성년입니다.");
			System.out.println("18세 이하는 미성년입니다.");}
		
	}

}
