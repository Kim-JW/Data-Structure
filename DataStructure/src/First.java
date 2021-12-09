
public class First {
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
	
	// static method는 인스턴스 필드값 못 쓴다.
	// 1. 객체를 구별할 수 없다.
	// 2. 객체를 만들지 않은 시점에서 메모리에 애초에 없다. 시점이 다르다.
	
	// main은 외부라고 생각하고 작성
	public static void main(String[] args) {
		
		First aa = new First();
		First bb = new First(10);
		First cc = new First(20,30);
		
		System.out.println(aa.getA() + "\t" + aa.getB()); // 0,0
		System.out.println(bb.getA() + "\t" + bb.getB()); // 10, 0
		System.out.println(cc.getA() + "\t" + cc.getB()); // 20, 30
		
		
	}

}
