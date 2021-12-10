package com.java.thread;

class ATM implements Runnable {
	
	private long depositeMoney = 10000;

	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		// ����ȭ ó���� ��� ���°� �߻��ϸ� �ȵ�. �����ϰ�
		// wait, notify
		synchronized (this) { // Lock �� �� �� �ִ�. ���� �����ϸ� �嶯
			for (int i =0; i< 10; i++) {
				this.notify();
				try {
					this.wait();
					Thread.sleep(1000);
					//this.wait();
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				if (getDepositeMoney() <= 0)
					break;
				withDraw(1000);
			}
		}
	}

	public long getDepositeMoney() {
		return depositeMoney;
	}
	
	public void withDraw(long howMuch) {
		System.out.print(Thread.currentThread().getName() + ", ");
		if(getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.printf("�ܾ��� %,d�� %n", getDepositeMoney());
		} else {
			System.out.printf("�ܾ��� �����մϴ�.");
		}
	}
	
}

public class ThreadAsynEx {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mom_th = new Thread(atm, "mom"); // ������ �̸� �ο�
		Thread son_th = new Thread(atm, "son");
		mom_th.start();
		son_th.start();
		

	}

}
