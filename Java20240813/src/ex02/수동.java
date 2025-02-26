package ex02;

/*
 * 수동 형변환 또는 강제 형변환
 * 큰 자료형을 작은 자료형에 대입한다.
 */
public class 수동 {

	public static void main(String[] args) {
	 
		short s1;
		int num1 = -32768;
		
		s1 = (short)num1; // 강제 형변환 int를 short 로, short를 num1로.
		// 즉 50000 short(32767)공간에 넣겠다.
				
		System.out.println(s1);
		
		double d1 = 10.2;
		
		int num2 = (int)d1; // 강제 형변환
		
		System.out.println(num2);
		
		System.out.println("-----------------");

		/*
		 * 정수연산 점수 -> 점수
		 * 정수연산 실수 -> 실수
		 * 정수 또는 실수 연산 문자 -> 문자		 */
	
		double d2 = 10 + 10.2;
		
		String str1 = 10 + "20"; // "10" + "20+ ->  "1020"
			
		System.out.println(d2);
		System.out.println(str1);

		
	}

}
