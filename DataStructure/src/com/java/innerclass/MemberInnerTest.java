package com.java.innerclass;

import com.java.innerclass.Outter.Inner;

// ���� ��Ŭ���� ����Ű ����


class Outter {
	private int num = 10;
	static int num2 = 3;
	
	class Inner {
		public void disp() {
			System.out.println(num);
			System.out.println(num2);
		}
	}
	
}

public class MemberInnerTest {

	public static void main(String[] args) {
		
		Outter outc = new Outter();
		Outter.Inner in = outc.new Inner();
		in.disp();
		
		Outter.Inner in2 = new Outter().new Inner();

	}

}
