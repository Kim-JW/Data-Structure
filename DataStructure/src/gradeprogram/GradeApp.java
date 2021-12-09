/*
 * ����ó�� ���α׷�
 * 1. �Է� ( �̸�, ��, ��, ��)
 * 2. �˻� ( �̸��˻�, ��հ˻� (50���̻�))
 * 3. ��� ( ��ü���)
 * 
 */

// https://cafe.naver.com/bitpocoict

package gradeprogram;

import java.util.Scanner;

public class GradeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------���� ���α׷�---------");
		System.out.println("���� ó���� �л� ���� �Է��ϼ���:");
		int numStudent = sc.nextInt();
		
		Student[] students = new Student[numStudent];
		System.out.println("(�̸�,����,����,����) �������� �Է��ϼ���. ex) ȫ�浿,100,90,50 ");
		
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
			System.out.println("1. �̸��˻� 2. ��հ˻� 3�� ��ü ��� 4�� ����");
			
			int num = sc.nextInt();
			
			switch (num) {
			
			// �̸� �˻�
			case 1:
				System.out.print("�̸��� �Է��ϼ���: ");
				String name = sc.next();
				for(Student student : students) {
					if (student.getName().equals(name)) {
						student.printAll();
					}
				}
				break;
				// ��� �˻�
			case 2:
				System.out.print("��� 50�� �̻��� ");
				for(Student student : students) {
					if (student.overAvg()) {
						System.out.print(student.getName() + " ");
					}	
				}
				System.out.println();
				break;
				// ��ü ���
			case 3:
				for(Student student: students) {
					student.printAll();
				}
				break;
			case 4:
				System.out.println("---------���� ó�� ���α׷� ����---------");
				sc.close();
				return;
			}
		}
	}
}
