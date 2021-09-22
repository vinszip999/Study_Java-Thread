import javax.rmi.CORBA.StubDelegate;

class SharedBoard{
	private int sum = 0; // 집계판의 합
	public synchronized void add() {
		int n = sum;
		Thread.yield(); // yield : 양보한다. / 현재 실행중인 스레드 양보(책에 안나옴. 시험X)
		n+=10;
		sum = n;
		System.out.println(Thread.currentThread().getName()
				+ " : " + sum);
	}
	public int getSum() {
		return sum;
	}
}

class StudentThread extends Thread{
	private SharedBoard board;
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			board.add();
		}
	}
	
	
}

public class SynchronizedEx {

	public static void main(String[] args) {
		SharedBoard board = new SharedBoard();
		Thread th1 = new StudentThread("mirim", board);
		Thread th2 = new StudentThread("이형섭", board);
		th1.start();
		th2.start();

	} // end of main

} // end of class
