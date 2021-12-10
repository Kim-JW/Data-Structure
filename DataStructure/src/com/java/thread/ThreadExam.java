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
				Thread.sleep(1000); // Interrupt 발생 가능성이 있어서 예외 처리 해줘야함.
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
		//te.start(); // Runnable 상태
		Thread th = new Thread(te); // 동적 바인딩 접근 가능
		th.start();
	}

}
