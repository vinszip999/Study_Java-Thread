import javax.rmi.CORBA.StubDelegate;

class SharedBoard{
	private int sum = 0; // �������� ��
	public synchronized void add() {
		int n = sum;
		Thread.yield(); // yield : �纸�Ѵ�. / ���� �������� ������ �纸(å�� �ȳ���. ����X)
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
		Thread th2 = new StudentThread("������", board);
		th1.start();
		th2.start();

	} // end of main

} // end of class
