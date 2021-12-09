/*
 * 성적처리 프로그램
 * 1. 입력 ( 이름, 국, 영, 수)
 * 2. 검색 ( 이름검색, 평균검색 (50점이상))
 * 3. 출력 ( 전체출력)
 * 
 */

// https://cafe.naver.com/bitpocoict

package gradeprogram;

import java.util.Scanner;

public class GradeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------성적 프로그램---------");
		System.out.println("성적 처리할 학생 수를 입력하세요:");
		int numStudent = sc.nextInt();
		
		Student[] students = new Student[numStudent];
		System.out.println("(이름,국어,영어,수학) 형식으로 입력하세요. ex) 홍길동,100,90,50 ");
		
		sc = new Scanner(System.in);
		
		for(int i =0; i<numStudent; i++) {
			String input = sc.nextLine();
			String name = input.split(",")[0];
			int kor = Integer.parseInt(input.split(",")[1]);
			int eng = Integer.parseInt(input.split(",")[2]);
			int math = Integer.parseInt(input.split(",")[3]);
			
			students[i] = new Student(name, kor, eng, math);
		}
		
		while(true) {
			sc = new Scanner(System.in);
			System.out.println("1. 이름검색 2. 평균검색 3번 전체 출력 4번 종료");
			
			int num = sc.nextInt();
			
			switch (num) {
			
			// 이름 검색
			case 1:
				System.out.print("이름을 입력하세요: ");
				String name = sc.next();
				for(Student student : students) {
					if (student.getName().equals(name)) {
						student.printAll();
					}
				}
				break;
				// 평균 검색
			case 2:
				System.out.print("평균 50점 이상은 ");
				for(Student student : students) {
					if (student.overAvg()) {
						System.out.print(student.getName() + " ");
					}	
				}
				System.out.println();
				break;
				// 전체 출력
			case 3:
				for(Student student: students) {
					student.printAll();
				}
				break;
			case 4:
				System.out.println("---------성적 처리 프로그램 종료---------");
				sc.close();
				return;
			}
		}
	}
}
