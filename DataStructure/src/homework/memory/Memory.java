package homework.memory;

abstract public class Memory {
	protected int[] arr = new int[5]; // ���� �ڵ��� �ƴ�. ũ�� �̸� �����ϴ°� ������
	// �̸� �����Ϸ��� �����ڿ��� ����� �Ѵ�.
	// �߰� �ɰ��� ������ �ؾ��Ѵ�.
	// ������� ���忡�� ����� �ؾ���. 
	// 
	
	protected int rear=0; // �� �κе� �����ڿ��� ���ִ°� ����.
	
//	void push(int num) {
//		if(rear == arr.length -1) {
//			System.out.println("����");
//		} else {
//			arr[rear] = num;
//			rear++;
//		}
//	}
	
	abstract void push(int num); // �ݵ�� �� ����Ѵ�. ������ final�� ����
	abstract void overflow();
	abstract void underflow();
	abstract void pop(); 
}
