package com.java.dynamicbinding;

class Halbe {
	public void disp() {
		System.out.println("halbe");
	}
}

class Abe extends Halbe {
	public void disp() {
		System.out.println("Abe");
	}
}

class Me extends Abe {
	public void disp() {
		System.out.println("me");
	}
}

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Halbe halbe = new Halbe();
		Abe abe = new Abe();
		Me me = new Me();
		
		Halbe h;
		h = halbe;
		h.disp();
		
		h = abe; // 동적 바인딩 : 부모의 레퍼런스로 자식을 접근하는 방식.
		h.disp(); // 손쉽게 접근, 코드 줄인다.
		
		h = me;
		h.disp();
		
		halbe.disp();
		abe.disp();
		me.disp();
		
		
	}
}
