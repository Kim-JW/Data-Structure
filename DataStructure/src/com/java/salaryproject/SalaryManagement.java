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
		System.out.println("-------------관리자 모드 ----------------");

		sc = new Scanner(System.in);
		

		boolean total_flag = false;

		while (true) {
			sc = new Scanner(System.in);
			System.out.println("1.정규직 근로자 관리 2.비정규직 근로자 관리 3.되돌아가기");
			int type_num = sc.nextInt();

			boolean flag = false;

			if (type_num == 1) {
				while (true) {
					sc = new Scanner(System.in);
					System.out.println("1.번 등록 2.수정 3.삭제 4.검색 5.전체 조회 6.되돌아가기");
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
						System.out.println("---------------관리자 모드 종료 -----------------");
						break;

					}
				}
			} else if (type_num == 2) {
				boolean Part_flag = false;
				while (true) {
					sc = new Scanner(System.in);
					System.out.println("1.번 등록 2.수정 3.삭제 4.검색 5.전체 조회 6.되돌아가기");
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
						System.out.println("---------------관리자 모드 종료 -----------------");
						break;
					}
				}
			} else {
				break;
			}

		}

	}

	public void UserMode(int id, int pw) {
		System.out.println("------------사원 모드 ----------------");

		Scanner sc = new Scanner(System.in);
		boolean flag = false;

		while (true) {
			sc = new Scanner(System.in);
			System.out.println("1.조회");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				sc = new Scanner(System.in);
				System.out.println("id와 pw를 입력하세요.");
				System.out.print("ID: ");
				int temp_id = sc.nextInt();
				System.out.print("Password: ");
				int temp_pw = sc.nextInt();

				fm.userSearch(temp_id, temp_pw);
				pm.userSearch(temp_id, temp_pw);
				break;
			}

			if (flag) {
				System.out.println("---------------관리자 모드 종료 -----------------");
				break;

			}

		}
	}
}
