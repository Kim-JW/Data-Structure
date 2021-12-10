package homework.memory;

public class MyStack extends Memory{
	
	@Override
	void push(int num) {
		if(rear == arr.length) {
			overflow();
		} else {
			arr[rear++] = num;
		}
	}

	@Override
	void overflow() {
		// TODO Auto-generated method stub
		System.err.println("Overflow");
	}

	@Override
	void underflow() {
		// TODO Auto-generated method stub
		System.out.println("Underflow");
	}

	@Override
	void pop() {
		if(rear == 0) {
			underflow();
		} else {
			System.out.println(arr[--rear]);
			arr[rear] = 0;
		}
	}
	
	
}
