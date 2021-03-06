package ch05;

/*
 * 날짜 : 2022/01/06
 * 이름 : 반석우
 * 내용 : 자바 싱글톤 객체 실습하기 p185
 */
public class Sub3_SingletonTest {
	
	public static void main(String[] args) {
	
		Calc c = Calc.getInstance();
		
		int r1 = c.plus(1, 2);
		int r2 = c.minus(1, 2);
		int r3 = c.multi(1, 2);
		int r4 = c.div(1, 2);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
	}
}
