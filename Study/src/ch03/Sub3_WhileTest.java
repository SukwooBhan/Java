package ch03;
/*
 *  날짜 : 2022/01/04
 *  이름	: 반석우
 *  내용	: 자바 While문 실습하기 교재 p79
 */
public class Sub3_WhileTest {
	public static void main(String[] args) {
	
	// continue
	int tot = 0;
	int j = 0;
	
	while( j <= 10) {
		
		j++;
		
		if( j%2 == 1) {
			continue; // 반복문 처음으로 이동
			
		}
		
		tot += j;
		
	}
	
	System.out.println("1부터 10까지 짝수합 : "+tot);
	}
}
