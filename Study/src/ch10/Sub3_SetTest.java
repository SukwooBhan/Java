package ch10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 날짜 : 2022/01/11
 * 이름 : 반석우
 * 내용 : 자바 컬렉션 리스트 실습하기 교재 p348
 */
public class Sub3_SetTest {
	public static void main(String[] args) {
		
		// Set 생성
		Set<Integer>	set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(3);
		
		System.out.println("set 원소 : "+set);
		System.out.println("set 크기 : "+set.size());
		
		// Set 출력
		for(int n : set) {
			System.out.println(n+" ");
		}
		System.out.print("\n");
		
		// 반복자(Iterator)를 이용한 출력
		Iterator<Integer> iter = set.iterator();
		
		while (iter.hasNext()) {
			
			int num = iter.next();
			System.out.println(num + " ");
			
		}
		System.out.print("\n");
		
	}
}
