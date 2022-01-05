package Ch07;

class P167Student {
	// 필드
	String name; // 학생명
	int grade; // 학년
	String department; // 학과
	
			
	
	// 기본 생성자
		
	// 1번 생성자
	P167Student(){
			
	}
	// 2번 생성자
	P167Student(String n){
		name = n;
	}
	// 3번 생성자
	P167Student(String n, int g){
		name	= n;
		grade	= g;
	}
	// 4번 생성자
	P167Student(String n, int g, String d) {
		name 	= n;
		grade	= g;
		department	= d;
	}
	// 학과와 학년을 매개변수로 받는 생정자(에러 발생)
	/*P167Student(String d, int g){
		department = d;
		grade = g;
		
	}
	*/
}

public class P167 {
	public static void main(String[] args) {
		
		P167Student stu = new P167Student("홍길동", 4, "소프트웨어공학");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
		P167Student stu2 = new P167Student("이순신", 3, "디자인");
		
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
		
		// 기본 생성자로 객체 생성
		
		P167Student stu0 = new P167Student();
	
		P167Student stu1 = new P167Student(); // 1번 생성자
		P167Student stu5 = new P167Student("홍길동"); // 2번 생성자
		P167Student stu3 = new P167Student("홍길동", 4); // 3번 생성자
		P167Student stu4 = new P167Student("홍길동", 4, "소프트웨어공학"); // 4번 생성자
		
	}
	
}