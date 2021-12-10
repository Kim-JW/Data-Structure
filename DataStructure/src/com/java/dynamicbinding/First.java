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
		
		h = abe; // ���� ���ε� : �θ��� ���۷����� �ڽ��� �����ϴ� ���.
		h.disp(); // �ս��� ����, �ڵ� ���δ�.
		
		h = me;
		h.disp();
		
		halbe.disp();
		abe.disp();
		me.disp();
		
		
	}
}
