package homework;

class Top2 implements Runnable{
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.print(i+" \t");
		}
	}
}
public class Runnable1Exam {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		Top2 t = new Top2();
		Thread thd = new Thread(t);
		thd.start();
		System.out.println("���α׷� ����");
		
	} // end of main

} // end of class
