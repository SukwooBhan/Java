package ch08;

import ch05.Calc;

/*
 * 날짜 : 2020/01/10
 * 이름 : 반석우
 * 내용 : 자바 예외처리 실습하기 교재 p273
 */
public class Sub2_ThrowsTest {
	public static void main(String[] args) {
	
		Calc c = Calc.getInstance();
		
		int r1 = c.plus(1, 4);
		int r2 = c.minus(1, 4);
		int r3 = c.multi(2, 4);
		int r4 = 0;
		
		try {
			r4 = c.div(1, -1);
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
	}
}
