package ch03;

public class P45_ScopeEx2 { // 1. 클래스 블럭
	
	int no; // 1-1 클래스 블럭 내에서 사용 가능한 변수
	
	public static void main(String[] args) { // 2.main 메서스 블럭
		
			String name; // 2-1 메서드 블럭 내에서 사용 가능한 변수
		
			if (true) {
				// 메서드 블럭 안에서 변수 ㅓㄴ언
				String emailString = "hong@est.com";
				
			}
			
			// if문 블럭 밖에서 email 변수를 사용하면 에러 발생
			
			email = "hong@test.com";
			
	}

}
