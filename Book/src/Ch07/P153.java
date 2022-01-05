package Ch07;

class Param{
	void add (int x , int y) {
		int z = x + y;
		System.out.println(z);
		}
	void add2 (double x , double y) {
		double z = x + y;
		System.out.println(z);
	}
}
public class P153 {
	public static void main(String[] args) {
		
		Param p = new Param();
		p.add(10,5);
		// p.add("10", "5"); // 에러
		
		p.add2(10, 5);
		
		Param p1 = new Param();
		//p.add(10.5, 5.5); 에러
		
		p1.add((int)10.5, (int)5.5);
	}

}
