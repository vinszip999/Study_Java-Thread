import java.awt.*;
import javax.swing.*;

class FlickeringLabel extends JLabel implements Runnable {
	private long delay; 
	public FlickeringLabel(String text, long delay) {
		super(text);
		this.delay = delay;
		setOpaque(true);
		Thread th = new Thread(this);
		th.start();
	}
	@Override
	public void run() {
		int n=0;
		while(true) {
			if(n == 0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if(n == 0) n = 1;
			else n = 0;
			try {
				Thread.sleep(delay); 
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class FlickeringLabelEx extends JFrame {
	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
		// �����̴� ���̺� ���� 0.5�� �ֱ�� ������.
		FlickeringLabel fLabel = new FlickeringLabel("����",500);

		// �������� �ʴ� ���̺� ����
		JLabel label = new JLabel("�ȱ���");
		
		// �����̴� ���̺� ���� 0.3�� ���� ������.
		FlickeringLabel fLabel2 = new FlickeringLabel("���⵵ ����",300);

		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
	
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlickeringLabelEx();
	}
}
