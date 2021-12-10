package homework.memory;

abstract public class Memory {
	protected int[] arr = new int[5];
	protected int rear=0;
	
//	void push(int num) {
//		if(rear == arr.length -1) {
//			System.out.println("¿À¹ö");
//		} else {
//			arr[rear] = num;
//			rear++;
//		}
//	}
	
	abstract void push(int num);
	abstract void overflow();
	abstract void underflow();
	abstract void pop();
}
