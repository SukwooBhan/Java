package ch09;
/*
 * 날짜 : 2020/01/10
 * 이름 : 반석우
 * 내용 : 자바 String 클래스	실습하기 교재 p314
 */
public class Sub3_WrapperTest {

	public static void main(String[] args) {
		
		// 기본타입 변수(primitive type)
		int 	var1 = 1;
		double	var2 = 2.14;
		boolean	var3 = true;
		
		// Wrapper 클래스로 포장(Auto-Boxing)
		Integer w1 = var1;
		Double	w2 = var2;
		Boolean w3 = var3;
		
		System.out.println("w1 : "+w1);
		System.out.println("w2 : "+w2);
		System.out.println("w3 : "+w3);
		
		// 문자열 -> 기본타입 변환
		String str1 = "1";
		String str2 = "2.3";
		String str3 = "false";
		
		int		rs1 = Integer.parseInt(str1);
		double	rs2 = Double.parseDouble(str2);
		boolean	rs3 = Boolean.parseBoolean(str3);
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
		
		// 문자열 -> Wrapper 변환
		Integer	wr1 = Integer.valueOf(str1);
		Double	wr2 = Double.valueOf(str2);
		Boolean	wr3 = Boolean.valueOf(str3);
		
		System.out.println("wr1 : "+wr1);
		System.out.println("wr2 : "+wr2);
		System.out.println("wr3 : "+wr3);
		
		// Wrapper -> 문자열 변환
		String	s1 = wr1.toString();
		String	s2 = wr2.toString();
		String	s3 = wr3.toString();
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		
		
		// Wrapper -> 기본타입 변환(Auto-Unboxing)
		int		v1 = wr1;
		double	v2 = wr2;
		boolean	v3 = wr3;
		
		System.out.println("v1 : "+v1);
		System.out.println("v2 : "+v2);
		System.out.println("v3 : "+v3);
		
	}
}
