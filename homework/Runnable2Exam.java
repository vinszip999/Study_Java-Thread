package homework;

class Top3 implements Runnable{
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.print(i+" \t");
		}
	}
}
public class Runnable2Exam {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		//1. Runnable�� �����ϴ� ��ü �����
		Top3 t = new Top3();
		//2. Runnable�� ������ �� ��¥ Thread �����
		Thread thd1 = new Thread(t);
		Thread thd2 = new Thread(t);
		//3. Thread ���۽�Ű��
		thd1.start();
		thd2.start();
		System.out.println("���α׷� ����");
	} // end of main

} // end of class
