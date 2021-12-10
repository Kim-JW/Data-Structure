package homework.memory;

abstract public class Memory {
	protected int[] arr = new int[5]; // 좋은 코딩이 아님. 크기 미리 설정하는거 안좋음
	// 미리 설정하려면 생성자에서 해줘야 한다.
	// 잘게 쪼개는 연습을 해야한다.
	// 사용자의 입장에서 고민을 해야함. 
	// 
	
	protected int rear=0; // 이 부분도 생성자에서 해주는게 좋다.
	
//	void push(int num) {
//		if(rear == arr.length -1) {
//			System.out.println("오버");
//		} else {
//			arr[rear] = num;
//			rear++;
//		}
//	}
	
	abstract void push(int num); // 반드시 꼭 써야한다. 싶으면 final로 정의
	abstract void overflow();
	abstract void underflow();
	abstract void pop(); 
}
