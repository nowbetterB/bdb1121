package ex01;

public class ForEx01 {

	public static void main(String[] args) {

		int sum = 0;
		//시작값에서 끝값까지 반복한다.
		// 1~100 반복한다고 했을 때 1+2+3+4+... or 100+99+98+... 
		//
		// 초기값 -> 끝값(조건) -> 문장 -> 증가
		//      초기값  끝값  증가값(or 감소값)
		// for(int i=0; i<=5; i++) {
		//	sum += i; //문장 sum = sum +1}
		// 1~5까지의 합
		
		for(int i=1; i<=10; i=i+2) {
			sum+=i;}
		
		System.out.println("sum = " + sum);
	}
	}
	

