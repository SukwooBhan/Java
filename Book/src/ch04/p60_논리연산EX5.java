package ch04;

public class p60_������EX5 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		// AND ����
		System.out.println(a>b && a == 10);	// ture
		System.out.println(a>b && a == b);	// false
		
		// OR ����
		System.out.println(a>b || a == b);	// ture
		System.out.println(a<b || a == b);	// false
		
		// XOR ����
		System.out.println(a>b ^ a == 10);	// false
		System.out.println(a>b ^ a == b);	// true
		
		// NOT ����
		System.out.println(!(a>b));	// false
		System.out.println(!(a<b));	// true
	
	}
}
