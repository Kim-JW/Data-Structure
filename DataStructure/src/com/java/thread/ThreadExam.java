package com.java.thread;

public class ThreadExam implements Runnable{//extends Thread{
	private int[] arr;
	
	public ThreadExam() {
		arr = new int[4];
		
		for(int i=0; i< arr.length; i++) {
			arr[i] = i;
		}
	}
	
	public void run() {
		for(int i=0; i< arr.length; i++) {
			try {
				Thread.sleep(1000); // Interrupt �߻� ���ɼ��� �־ ���� ó�� �������.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread() + " " + arr[i]);
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExam te = new ThreadExam();
		//te.start(); // Runnable ����
		Thread th = new Thread(te); // ���� ���ε� ���� ����
		th.start();
	}

}
