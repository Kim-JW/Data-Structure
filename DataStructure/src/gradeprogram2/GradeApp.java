package gradeprogram2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class GradeApp {
	
	static Scanner sc;
	static ArrayList<Student> al_stu = new ArrayList<Student>();
	static HashMap<String, Student> hs_stu = new HashMap<String, Student>();
	static Set<Student> set_stu = new HashSet<Student>();

	public static void main(String[] args) {
		
		System.out.println("---------성적 프로그램---------");
		
		while(true) {
			sc = new Scanner(System.in);
			
			System.out.println("1. ArrayList  2. HashMap  3. Set  4. 종료 ");
			int num = sc.nextInt();
			
			// ArrayList
			if(num == 1) {
				boolean flag = false;
				while(!flag) {
					data_func();
					sc = new Scanner(System.in);
					int num2 = sc.nextInt();
					
					switch(num2) {
					case 1:
						sc = new Scanner(System.in);
						inser_msg();
						String input = sc.nextLine();
						String name = input.split(",")[0];
						int[] grade = grade_input(input);
						al_stu.add(new Student(name, grade[0], grade[1], grade[2]));
						break;
					case 2:
						sc = new Scanner(System.in);
						search_msg();
						String searchName = sc.nextLine();
						for(Student s : al_stu) {
							if (s.getName().equals(searchName)) {
								System.out.println(s.toString());
								break;
							}
						}
						break;
					case 3:
						sc = new Scanner(System.in);
						System.out.println("삭제할 이름을 입력하세요.");
						String removeName = sc.nextLine();
						for(Student student : al_stu) {
							if (student.getName().equals(removeName)) {
								al_stu.remove(student);
								break;
							}
						}
						break;
					case 4:
						for(Student student : al_stu) {
							System.out.println(student.toString());
						}
						break;
					case 5:
						flag = true;
						break;
					}
				}
			} else if (num == 2) { // HashMap
				boolean flag = false;
				while(!flag) {
					data_func();
					sc = new Scanner(System.in);
					int num2 = sc.nextInt();
					
					switch(num2) {
					case 1:
						sc = new Scanner(System.in);
						inser_msg();
						String input = sc.nextLine();
						String name = input.split(",")[0];
						int[] grade = grade_input(input);
						hs_stu.put(name, new Student(name,  grade[0], grade[1], grade[2]));
						break;
					case 2:
						sc = new Scanner(System.in);
						search_msg();
						String searchName = sc.nextLine();
						for(Entry<String, Student> entry : hs_stu.entrySet()) {
							if (entry.getKey().equals(searchName)) {
								System.out.println(entry.getValue().toString());
								break;
							}
						}
						break;
					case 3:
						sc = new Scanner(System.in);
						System.out.println("삭제할 이름을 입력하세요.");
						String removeName = sc.nextLine();
						for(Entry<String, Student> entry : hs_stu.entrySet()) {
							if(entry.getKey().equals(removeName)) {
								hs_stu.remove(removeName);
								break;
							}
						}
						break;
					case 4:
						for(Entry<String, Student> entry : hs_stu.entrySet()) {
							System.out.println(entry.getValue().toString());
						}
						break;
					case 5:
						flag = true;
						break;
					}
				}
				
			} else if (num == 3) { // Set
				boolean flag = false;
				while(!flag) {
					data_func();
					sc = new Scanner(System.in);
					int num2 = sc.nextInt();
					
					switch(num2) {
					case 1:
						sc = new Scanner(System.in);
						inser_msg();
						String input = sc.nextLine();
						String name = input.split(",")[0];
						int[] grade = grade_input(input);
						set_stu.add(new Student(name, grade[0], grade[1], grade[2]));
						break;
					case 2:
						sc = new Scanner(System.in);
						search_msg();
						String searchName = sc.nextLine();
						for(Student s : set_stu) {
							if (s.getName().equals(searchName)) {
								System.out.println(s.toString());
								break;
							}
						}
						break;
					case 3:
						sc = new Scanner(System.in);
						System.out.println("삭제할 이름을 입력하세요.");
						String removeName = sc.nextLine();
						for(Student student : set_stu) {
							if (student.getName().equals(removeName)) {
								set_stu.remove(student);
								break;
							}
						}
						break;
					case 4:
						for(Student student : set_stu) {
							System.out.println(student.toString());
						}
						break;
					case 5:
						flag = true;
						break;
					}
				}
			} else { // 종료
				System.out.println("-------- 성적 프로그램 종료 ---------");
				break;
			}
		}

	}
	
	public static void data_processing(Object o) {
		
	}
	
	public static void inser_msg() {
		System.out.println("(이름,국어,영어,수학)으로 입력하세요.");
	}
	
	public static void search_msg() {
		System.out.println("이름을 입력하세요.");
	}
	
	public static void data_func() {
		System.out.println("1. 삽입  2. 검색  3. 삭제  4. 출력  5. 되돌아가기");
	}
	
	public static int[] grade_input(String input) {
		int[] a = new int[3];
		
		a[0] = Integer.parseInt(input.split(",")[1]);
		a[1] = Integer.parseInt(input.split(",")[2]);
		a[2] = Integer.parseInt(input.split(",")[3]);
		
		return a;
	}

}
