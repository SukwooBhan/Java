package ch03;
/*
 *  ��¥ : 2022/01/04
 *  �̸�	: �ݼ���
 *  ����	: �ڹ� While�� �ǽ��ϱ� ���� p79
 */
public class Sub3_WhileTest {
	public static void main(String[] args) {
	
	// continue
	int tot = 0;
	int j = 0;
	
	while( j <= 10) {
		
		j++;
		
		if( j%2 == 1) {
			continue; // �ݺ��� ó������ �̵�
			
		}
		
		tot += j;
		
	}
	
	System.out.println("1���� 10���� ¦���� : "+tot);
	}
}
