package Ch07;

class P167Student {
	// �ʵ�
	String name; // �л���
	int grade; // �г�
	String department; // �а�
	
			
	
	// �⺻ ������
		
	// 1�� ������
	P167Student(){
			
	}
	// 2�� ������
	P167Student(String n){
		name = n;
	}
	// 3�� ������
	P167Student(String n, int g){
		name	= n;
		grade	= g;
	}
	// 4�� ������
	P167Student(String n, int g, String d) {
		name 	= n;
		grade	= g;
		department	= d;
	}
	// �а��� �г��� �Ű������� �޴� ������(���� �߻�)
	/*P167Student(String d, int g){
		department = d;
		grade = g;
		
	}
	*/
}

public class P167 {
	public static void main(String[] args) {
		
		P167Student stu = new P167Student("ȫ�浿", 4, "����Ʈ�������");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
		P167Student stu2 = new P167Student("�̼���", 3, "������");
		
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
		
		// �⺻ �����ڷ� ��ü ����
		
		P167Student stu0 = new P167Student();
	
		P167Student stu1 = new P167Student(); // 1�� ������
		P167Student stu5 = new P167Student("ȫ�浿"); // 2�� ������
		P167Student stu3 = new P167Student("ȫ�浿", 4); // 3�� ������
		P167Student stu4 = new P167Student("ȫ�浿", 4, "����Ʈ�������"); // 4�� ������
		
	}
	
}