package com.java.innerclass;

//import com.java.innerclass.Outter.Inner;

// 숙제 이클립스 단축키 정리

//class Outter {
//private int num = 10;
//static int num2 = 3;
//
//public void output() {
//	class Inner {
//		public void disp() {
//			System.out.println(num);
//			System.out.println(num2);
//		}
//	}
//	
//	Inner in = new Inner();
//	in.disp();
//}
//
//}

abstract class Abs {
	abstract void disp(); // "disp"
}

class Outter {
	private int num = 10;
	private static int num2 = 3;
	
	public void output() {
		new Abs() {

			@Override
			void disp() {
				System.out.println(num);
				System.out.println(num2);
				
			}
		}.disp();
	}
}

public class MemberInnerTest {

	public static void main(String[] args) {
		
//		Outter outc = new Outter();
//		Outter.Inner in = outc.new Inner();
//		in.disp();
		
//		Outter.Inner in2 = new Outter().new Inner();
//		Outter.Inner in3 = new Outter.Inner();
//		in3.disp();
		
		Outter out = new Outter();
		out.output();
		
	

	}

}
