
/*
 * class ����
 * 1.Has ~ A���� (~�� ~�� ������ �ִ�.) => �Ӻ���������Ʈ - ���� ����
 * 2.Is ~ A���� (~�� ~�̴�.) => ���, is a Like�� ���� �ָ��ϰ� ���� �ȵȴ�.
 * Ȯ�强�� ���ο� �ΰ� �ڵ带 ¥���Ѵ�.
 * 
 * class�� ���������� ������.
 * ������ ���� Ŭ���� ( Ŭ�������� ��Ƽ� ���ο� �� ����� )
 * 
 * final ��� -> �޼���, Ŭ����, ���
 * ���������δ� �빮�ڷ�
 * 
 * final - has A ����θ� ���, �� �̻� ��� ���� �ʴ´�. extends ������.
 * 
 * final method - �� �̻� �������� �ʰڴ�. Ȯ��, �� �������̵� ����.
 *
 * �߻� Ŭ������ ����� �������� �������
 * 
 * �Ϻκ��� �߻�ȭ ��Ų ��.
 * 
 * abstract method�� �ݵ�� �������̵� �ؾ��Ѵ�. (������ �ο�)
 * 
 * �������ε� ��밡�� ����
 * - �θ� �˰� �ִ� ��������
 * - �ڽ��� ���� �߰��� ���� ���� �Ұ���
 * 
 * �θ��� ���۷����� �ڽ��� ���� - ���� ���ε�
 * 
 * ���� ���ε�
 * - �θ� ���۷����� �ڽ� ����
 * 
 * �� �߻�ȭ ��Ű�°�?
 * 1. Super class�� 
 * 
 */

interface ss {
	final static int num = 100;
//	int num = 100; final static �����Ǿ� �ִ�.
	void disp(); // abstract �����Ǿ��ִ�.
}


interface sss extends ss{
	final static int num = 100;
//	int num = 100; final static �����Ǿ� �ִ�.
	void disp(); // abstract �����Ǿ��ִ�.
}


interface ssss extends ss, sss {
	final static int num = 100;
//	int num = 100; final static �����Ǿ� �ִ�.
	void disp(); // abstract �����Ǿ��ִ�.
}

public class First implements ssss{
	// method
	
	// field
	private int A;
	private int B;
	
	// constructor
	public First() {
		//a = b = 0;
		this(0,0);
	}
	
	public First(int A) {
		this(A, 0);
	}
	
	public First(int A, int B) {
		this.A = A;
		this.B = B;
	}

	public int getA() {
		return A;
	}

	public int getB() {
		return B;
	}
	
	// static method�� �ν��Ͻ� �ʵ尪 �� ����.
	// 1. ��ü�� ������ �� ����.
	// 2. ��ü�� ������ ���� �������� �޸𸮿� ���ʿ� ����. ������ �ٸ���.
	
	// main�� �ܺζ�� �����ϰ� �ۼ�
	public static void main(String[] args) {
		
		First aa = new First();
		First bb = new First(10);
		First cc = new First(20,30);
		
		System.out.println(aa.getA() + "\t" + aa.getB()); // 0,0
		System.out.println(bb.getA() + "\t" + bb.getB()); // 10, 0
		System.out.println(cc.getA() + "\t" + cc.getB()); // 20, 30
		
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

}
