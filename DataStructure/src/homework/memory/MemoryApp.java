package homework.memory;

import java.util.Scanner;

public class MemoryApp {

	public static void main(String[] args) {
		Memory mq = new MyQueue();
		Memory ms = new MyStack();
		
		/*
		 * MyQueue mq = new MyQueue();
		 * MyStack ms = new MyStack();
		 * 
		 * Memory m = null; 
		 * 
		 * 이렇게 해도 됨.
		 */
		
		
		Scanner sc;
		
		while(true) {
			sc = new Scanner(System.in);
			System.out.println("1번 스택  2번 큐  3번 break");
			
			int num = sc.nextInt();
			
			// Stack
			if(num == 1) {
				while(true) {
					System.out.println("1. Push  2. Pop  3. break");
					sc = new Scanner(System.in);
					int num2 = sc.nextInt();
					
					if(num2 == 1) {
						sc = new Scanner(System.in);
						System.out.println("수를 입력하세요.");
						int input_num = sc.nextInt();
						
						ms.push(input_num);
					} else if (num2 == 2) {
						ms.pop();
						break;
					} else {
						break;
					}
				}
				
			} else if(num == 2) { // Queue
				while(true) {
					System.out.println("1. Push  2. Pop  3. break");
					sc = new Scanner(System.in);
					int num2 = sc.nextInt();
					
					if(num2 == 1) {
						sc = new Scanner(System.in);
						System.out.println("수를 입력하세요.");
						int input_num = sc.nextInt();
						
						mq.push(input_num);
					} else if (num2 == 2) {
						mq.pop();
						break;
					} else {
						break;
					}
				}
			} else {
				return;
			}
		}
		
	}

}
