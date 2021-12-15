package com.java.salaryproject;

import java.util.ArrayList;
import java.util.Scanner;

public class ParttimeManage implements IPayrollManage {
	ParttimeEmployee fe;
	ArrayList<ParttimeEmployee> felist;
	int hired_type = 0;

	private ParttimeManage sm; // �޿�����Ŭ����
	private int numOfRegular; // ������ �ִ� �ο���

	public ParttimeManage() {
		this(0);
	}

	public ParttimeManage(int numOfRegular) {
		this.numOfRegular = numOfRegular;

		// ��� �� ��ŭ ������ ���� ����
		felist = new ArrayList<>();
		sm = null;
	}

	// setter,getter
	public ArrayList<ParttimeEmployee> getFe() {
		return felist;
	}

	public void setFe(ArrayList<ParttimeEmployee> list) {
		this.felist = list;
	}

	public ParttimeManage getSm() {
		return sm;
	}

	// �Է�
	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.println("�������� " + (felist.size() + 1) + "��° ���� ���� �Է�");

		System.out.print("���� �̸� �Է� : ");
		String name = sc.next();
		System.out.println();

		System.out.print("���� ��� �Է� : ");
		int id = sc.nextInt();
		System.out.println();

		System.out.print("���� �μ� �Է�: ");
		String depart = sc.next();
		System.out.println();

		System.out.print("���� ��й�ȣ �Է� : ");
		int pw = sc.nextInt();
		System.out.println();

		System.out.print("���� �Ի��� �Է� : (yyyyMMdd ���·�)");
		String date = sc.next();
		System.out.println();

		System.out.print("���� ����� �Է� : ");
		String exdate = sc.next();
		System.out.println();

		Position pos = Position.valueOf("P1");
		double pay = getSalary(pos);
		fe = new ParttimeEmployee(name, id, depart, pw, date, pay, pos, hired_type, exdate);
//		fe = new ParttimeEmployee(name, id, depart, pw, date, pay, pos, pw, exdate);
		fe.setEmployee_pay(pay);

		felist.add(fe);

	}

	@Override
	public double getSalary(Position pos) {

		return 1000;

	}

	// ����
	public void modifi() {

		Scanner sc = new Scanner(System.in);

		System.out.print("�����ϰ� ���� ���� �̸��� �Է��ϼ��� : ");
		String tmpName = sc.next();

		boolean exist = false;

		for (int i = 0; i < felist.size(); i++) {
			if (felist.get(i).getEmployee_name().equals(tmpName)) {
				exist = true;

				System.out.println("�����ϰ� ���� �����͸� �����ϼ���..");
				System.out.println("1.�̸� 2.�μ� 3.��й�ȣ ");
				System.out.print("-> ");
				int num = sc.nextInt(); // ��ȣ ����

				String sTmp = "";
				int iTmp = 0;
				long salary = 0;

				switch (num) {
				case 1: // �̸�����
					System.out.print("������ �����͸� �Է��ϼ��� : ");
					sTmp = sc.next();
					felist.get(i).setEmployee_name(sTmp);
					break;
				case 2: // �μ� ����
					System.out.print("������ �����͸� �Է��ϼ��� : ");
					sTmp = sc.next();
					felist.get(i).setEmployee_department(sTmp);
					break;
				case 3: // ���
					System.out.print("������ �����͸� �Է��ϼ��� : ");
					iTmp = sc.nextInt();
					felist.get(i).setEmployee_pw(iTmp);
					break;

				default:
					System.out.println("�߸� �Է��Ͽ����ϴ�.");
				}
				System.out.println();
				System.out.println("�����Ϸ�!!");
			}
			if (!exist)
				System.out.println("�˻��Ͻ� " + tmpName + " ������ ���� ������ �����ϴ�.");

		}
	}

	// ����
	public void delete() {

		Scanner sc = new Scanner(System.in);

		System.out.print("������ ������ �̸��� �Է��ϼ��� : ");
		String tmpName = sc.next();

		boolean exist = false;

		for (int i = 0; i < felist.size(); i++) {
			if (felist.get(i).getEmployee_name().equals(tmpName)) {
				felist.remove(i);
				exist = true;
			}
			System.out.println("�����Ϸ�!!");
		}
		if (!exist)
			System.out.println("�˻��Ͻ� " + tmpName + " ������ ���� ������ �����ϴ�.");

	}

	// �˻�
	public void search() { // �̸� �˻�

		Scanner sc = new Scanner(System.in);

		System.out.print("�˻��ϰ� ���� ���� �̸��� �Է��ϼ��� : ");
		String tmpName = sc.next();

		boolean exist = false;

		for (int i = 0; i < felist.size(); i++) {
			if (felist.get(i).getEmployee_name().equals(tmpName)) {
				disp(felist.get(i));

				exist = true;
			}
		}
		if (!exist)
			System.out.println("�˻��Ͻ� " + tmpName + " ������ ���� ������ �����ϴ�.");

		exist = !exist;

	}

	// ���
	public void allOutput() {

		System.out.println("-----------------------------------");
		System.out.println("----------�������� ���� ��ü ���----------");
		System.out.println("-----------------------------------");

		for (int i = 0; i < felist.size(); i++) {
			System.out.println(felist.get(i).toString());
		}
	}

	// �����˻�
	public void userSearch(int num, int password) { // ����ڿ��� ����� �̸��� �޾ƿ�

		boolean exist = false;

		for (int i = 0; i < felist.size(); i++) {

			ParttimeEmployee data = new ParttimeEmployee();
			data = felist.get(i);

			if (num == data.getEmployee_id() && password == data.getEmployee_pw()) {
//				disp(fe);
				System.out.println(data.toString());

				exist = true;
			}
			if (!exist)
				System.out.println("�������� ���� ������ ����");

			exist = !exist;

		}
	}

	// ���
	public void disp(ParttimeEmployee fe) {
		System.out.println("----------------------------------------");
		System.out.println("��� : " + fe.getEmployee_id()); // ���
		System.out.println("�̸� : " + fe.getEmployee_name()); // �̸�
		System.out.println("�ҼӺμ� : " + fe.getEmployee_department()); // �ҼӺμ�
		System.out.println("�޿� : " + fe.getEmployee_pay()); // �޿�
		System.out.println("�Ի��� : " + fe.getEmployee_startdate()); // �ټӳ⵵
		System.out.println("������� : " + fe.getEmployee_contract()); // �ټӳ⵵
		System.out.println("����� : " + fe.getExitdate()); // �ټӳ⵵
		System.out.println("----------------------------------------");
	}
}