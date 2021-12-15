package com.java.salaryproject;

import java.util.Scanner;

public class SalaryMainApp {
	
	static Scanner sc;

	public static void main(String[] args) {
		
		SalaryManagement sm = new SalaryManagement();
		
		System.out.println("—————급여 관리 시스템—————");
		
		while(true) {
			boolean adcheck = false;
			System.out.println("1. 관리자 모드 2. 사용자 모드 3. 프로그램 종료");
			sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				sc = new Scanner(System.in);
				System.out.println("id와 pw를 입력하세요.");
				System.out.print("ID: ");
				int temp_id = sc.nextInt();
				System.out.print("Password: ");
				int temp_pw = sc.nextInt();
				
				if(sm.checkAdmin(temp_id, temp_pw)) {
					// 관리자 모드 진입
					sm.adminMode();
				} else {
					System.out.println("관리자 ID, PW가 맞지 않습니다. 권한이 없습니다.");
					adcheck = false;
					break;
				}
				// 관리자 모드
				break;
			case 2:
				sc = new Scanner(System.in);
				System.out.println("id와 pw를 입력하세요.");
				System.out.print("ID: ");
				int temp_id2 = sc.nextInt();
				System.out.print("Password: ");
				int temp_pw2 = sc.nextInt();
				
				sm.UserMode(temp_id2, temp_pw2);
				// 사용자 모드
				break;
			case 3:
				System.out.println("————급여 관리 시스템 종료————");
				return;
			}
		}

	}
	
	public static void printEnterMsg() {
		
	}

}
