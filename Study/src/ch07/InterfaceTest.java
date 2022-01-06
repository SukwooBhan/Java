package ch07;

/*
 * ��¥ : 2022//01/06
 * �̸� : �ݼ��� 
 * ���� : �ڹ� �������̽� �ǽ��ϱ� ���� p228 * 
 */

public class InterfaceTest {
	public static void main(String[] args) {
		
		
		// �������̽��� ���� Ŭ���� ���� ����
		RemoteControl		lg		= new RemoteLG();
		RemoteControl	samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.powerOff();
		lg.soundDown();
		lg.powerOff();
		
		samsung.powerOn();
		samsung.chUp();
		samsung.soundUp();
		samsung.powerOff();

		// �������̽��� �̿��� ���յ� ��ȭ
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.swichOn();
		socket.swichOff();
		
	}

}
