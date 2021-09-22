package homework;

class DerivedThread extends Thread{
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.print(i+" \t");
		}
	}
}
public class Thread2Exam {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		DerivedThread d1 = new DerivedThread();
		DerivedThread d2 = new DerivedThread();
		d1.start();
		d2.start();
		System.out.println("프로그램 종료");
		
	} // end of main

} // end of class
