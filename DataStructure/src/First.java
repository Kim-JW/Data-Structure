
/*
 * class 관계
 * 1.Has ~ A관계 (~가 ~를 가지고 있다.) => 임베디드오브젝트 - 포함 관계
 * 2.Is ~ A관계 (~는 ~이다.) => 상속, is a Like와 같이 애매하게 쓰면 안된다.
 * 확장성을 염두에 두고 코드를 짜야한다.
 * 
 * class는 독립적으로 만들어라.
 * 데이터 관리 클래스 ( 클래스들을 모아서 새로운 걸 만든다 )
 * 
 * final 사용 -> 메서드, 클래스, 상수
 * 문법적으로는 대문자로
 * 
 * final - has A 관계로만 써라, 더 이상 상속 하지 않는다. extends 못쓴다.
 * 
 * final method - 더 이상 변경하지 않겠다. 확장, 즉 오버라이드 금지.
 *
 * 추상 클래스는 상속을 목적으로 만들어진
 * 
 * 일부분이 추상화 시킨 것.
 * 
 * abstract method는 반드시 오버라이드 해야한다. (강제성 부여)
 * 
 * 동적바인딩 사용가능 범위
 * - 부모가 알고 있는 범위까지
 * - 자식의 따로 추가한 것은 접근 불가능
 * 
 * 부모의 레퍼런스로 자식을 접근 - 동적 바인딩
 * 
 * 동적 바인딩
 * - 부모 레퍼런스로 자식 접근
 * 
 * 왜 추상화 시키는가?
 * 1. Super class를 
 * 
 */

interface ss {
	final static int num = 100;
//	int num = 100; final static 생략되어 있다.
	void disp(); // abstract 생략되어있다.
}


interface sss extends ss{
	final static int num = 100;
//	int num = 100; final static 생략되어 있다.
	void disp(); // abstract 생략되어있다.
}


interface ssss extends ss, sss {
	final static int num = 100;
//	int num = 100; final static 생략되어 있다.
	void disp(); // abstract 생략되어있다.
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

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

}
