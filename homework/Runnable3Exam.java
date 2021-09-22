package homework;

class Top4 implements Runnable{
	public void run() {
		for(int i=0; i<30; i++) {
			System.out.print((Thread.currentThread()).getName() + i + " \t");
		}
	}
}
public class Runnable3Exam {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Top4 t = new Top4();
		Thread thd1 = new Thread(t, "a");
		Thread thd2 = new Thread(t, "b");
		System.out.println(thd1.getPriority());
		System.out.println(thd2.getPriority());
		thd1.start();
		thd2.start();
		System.out.println("프로그램 종료");
		
	}

}
