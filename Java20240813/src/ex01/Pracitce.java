package ex01;

public class Pracitce {

	public static void main(String[] args) {
		
		char c1 = 'A';
		char c2 = 65;
		float c3 = 23;
		double c4 = 54521.02022222021;
		byte c5 = 127;
		long c6 = 5152315;
		

		
		boolean stop = true;
		if(stop) {
			System.out.println("확인해주세요.");
		} else {
			System.out.println("확인되었습니다.");
		}
		int x = 23;
		boolean result1 = (x == 20);
		boolean result2 = (x != 20);
		boolean result3 = (x > 20);
		boolean result4 = ( 0  < x && x < 20);
		boolean result5 = ( x < 0 || x > 30);
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);

	}
}
