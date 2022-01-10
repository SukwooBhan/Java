package ch09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * ��¥ : 2020/01/10
 * �̸� : �ݼ���
 * ���� : �ڹ� ��Ÿ ����Ŭ����(API)	�ǽ��ϱ� ���� p311~ 323
 */
public class Sub4_EtcAPITest {
	public static void main(String[] args) {
		
		// Math Ŭ����
		System.out.println("�ø��� 1.2 : "+Math.ceil(1.2));
		System.out.println("�ø��� 1.8 : "+Math.ceil(1.8));
		System.out.println("������ 1.2 : "+Math.floor(1.2));
		System.out.println("������ 1.8 : "+Math.floor(1.8));
		System.out.println("�ݿø� 1.2 : "+Math.round(1.2));
		System.out.println("�ݿø� 1.8 : "+Math.round(1.8));
		
		double num1 = Math.random();
		System.out.println("num1 : "+num1);
		
		double num2 = num1 * 10;
		System.out.println("num2 : "+num2);
		
		double num3 = Math.ceil(num2)	;
		System.out.println("num3 : "+num3);
		
		double result = Math.ceil(Math.random()*45);
		System.out.println("������ �� : "+result);
		
		// Date Ŭ����
		
		Date date = new Date();
		System.out.println("data : "+date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(date);
				
		System.out.println("now : "+now);
		
		// Calendar Ŭ����
		Calendar cal = Calendar.getInstance();
		
		int year	= cal.get(Calendar.YEAR);
		int month	= cal.get(Calendar.MONTH);
		int dt 		= cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%d-%d %d:%d:%d", year, month, dt, hour, min, sec);
	}

}