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
		System.out.println("프로그램 시작");
		//1. Runnable을 구현하는 객체 만들기
		Top3 t = new Top3();
		//2. Runnable을 장착한 후 진짜 Thread 만들기
		Thread thd1 = new Thread(t);
		Thread thd2 = new Thread(t);
		//3. Thread 동작시키기
		thd1.start();
		thd2.start();
		System.out.println("프로그램 종료");
	} // end of main

} // end of class
