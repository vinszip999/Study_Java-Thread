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
		System.out.println("프로그램 시작");
		Top2 t = new Top2();
		Thread thd = new Thread(t);
		thd.start();
		System.out.println("프로그램 종료");
		
	} // end of main

} // end of class
