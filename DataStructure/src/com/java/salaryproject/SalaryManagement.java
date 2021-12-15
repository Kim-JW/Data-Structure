package com.java.salaryproject;

import java.util.Scanner;

public class SalaryManagement {
	public Scanner sc;
	private final int adminId = 007;
	private final int adminPw = 007;
	FulltimeManage fm = new FulltimeManage();
	ParttimeManage pm = new ParttimeManage();

	public boolean checkAdmin(int id, int pw) {
		if (this.adminId == id && this.adminPw == pw) {
			return true;
		}
		return false;
	}

	public void adminMode() {
		System.out.println("-------------������ ��� ----------------");

		sc = new Scanner(System.in);
		

		boolean total_flag = false;

		while (true) {
			sc = new Scanner(System.in);
			System.out.println("1.������ �ٷ��� ���� 2.�������� �ٷ��� ���� 3.�ǵ��ư���");
			int type_num = sc.nextInt();

			boolean flag = false;

			if (type_num == 1) {
				while (true) {
					sc = new Scanner(System.in);
					System.out.println("1.�� ��� 2.���� 3.���� 4.�˻� 5.��ü ��ȸ 6.�ǵ��ư���");
					int num = sc.nextInt();

					switch (num) {
					case 1:
						fm.input();
						break;
					case 2:
						fm.modifi();
						break;
					case 3:
						fm.delete();
						break;
					case 4:
						fm.search();
						break;
					case 5:
						fm.allOutput();
						break;
					case 6:
						flag = true;
						break;
					}

					if (flag) {
						System.out.println("---------------������ ��� ���� -----------------");
						break;

					}
				}
			} else if (type_num == 2) {
				boolean Part_flag = false;
				while (true) {
					sc = new Scanner(System.in);
					System.out.println("1.�� ��� 2.���� 3.���� 4.�˻� 5.��ü ��ȸ 6.�ǵ��ư���");
					int num = sc.nextInt();

					switch (num) {
					case 1:
						pm.input();
						break;
					case 2:
						pm.modifi();
						break;
					case 3:
						pm.delete();
						break;
					case 4:
						pm.search();
						break;
					case 5:
						pm.allOutput();
						break;
					case 6:
						Part_flag = true;
						break;
					}

					if (Part_flag) {
						System.out.println("---------------������ ��� ���� -----------------");
						break;
					}
				}
			} else {
				break;
			}

		}

	}

	public void UserMode(int id, int pw) {
		System.out.println("------------��� ��� ----------------");

		Scanner sc = new Scanner(System.in);
		boolean flag = false;

		while (true) {
			sc = new Scanner(System.in);
			System.out.println("1.��ȸ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				sc = new Scanner(System.in);
				System.out.println("id�� pw�� �Է��ϼ���.");
				System.out.print("ID: ");
				int temp_id = sc.nextInt();
				System.out.print("Password: ");
				int temp_pw = sc.nextInt();

				fm.userSearch(temp_id, temp_pw);
				pm.userSearch(temp_id, temp_pw);
				break;
			}

			if (flag) {
				System.out.println("---------------������ ��� ���� -----------------");
				break;

			}

		}
	}
}
