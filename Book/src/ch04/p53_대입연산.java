package ch04;
/*
 *  날짜 : 2022/01/03
 *  이름	: 반석우
 *  내용	: 자바대입연산 예제 교재 p53
 */
public class p53_대입연산 {
	public static void main(String[] args) {
		
		int number1 = 10;
		System.out.println("number1 = 10 -> "+number1);	// 10출력
		number1 += 10;
		System.out.println("number1 += 10 -> "+number1);	// 20출력
		number1 -= 10;
		System.out.println("number1 -= 10 -> "+number1);	// 10출력
		number1 *= 2;
		System.out.println("number1 *= 2 -> "+number1);	// 20출력
		number1 /= 2;
		System.out.println("number1 /= 2 -> "+number1);	// 10출력
		number1 %= 3;
		System.out.println("number1 %= 3 -> "+number1);	// 1출력
	
	}
}
