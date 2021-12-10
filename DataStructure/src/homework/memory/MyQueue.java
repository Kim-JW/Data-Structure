package homework.memory;

public class MyQueue extends Memory{
	
	private int front = 0;

	@Override
	void push(int num) {
		if(front == 0 && rear == arr.length) {
			overflow();
		} else if (front > 0 && rear == arr.length){
			shift();
			arr[++rear] = num; 
		} else {
			arr[rear++] = num; 
		}
	}

	@Override
	void overflow() {
		System.err.println("Overflow");
	}

	@Override
	void underflow() {
		System.out.println("Underflow");
		
	}

	@Override
	void pop() {
		if(front == 0 && rear == 0) {
			underflow();
		} else {
			System.out.println(arr[front]);
			arr[front++] = 0;
		}
		printAll();
	}
	
	public void shift() {
		int idx = 0;
		for(int i = front; i< arr.length; i++) {
			arr[idx++] = arr[i];
			arr[i] = 0;
		}
		front = 0;
		rear = idx-1;
		
	}
	
	public void printAll() {
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
