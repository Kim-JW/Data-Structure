package com.java.thread;

class ATM implements Runnable {
	
	private long depositeMoney = 10000;

	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		// 동기화 처리는 기아 상태가 발생하면 안됨. 공정하게
		// wait, notify
		synchronized (this) { // Lock 을 걸 수 있다. 먼저 선점하면 장땡
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
			System.out.printf("잔액은 %,d원 %n", getDepositeMoney());
		} else {
			System.out.printf("잔액이 부족합니다.");
		}
	}
	
}

public class ThreadAsynEx {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mom_th = new Thread(atm, "mom"); // 스레드 이름 부여
		Thread son_th = new Thread(atm, "son");
		mom_th.start();
		son_th.start();
		

	}

}
