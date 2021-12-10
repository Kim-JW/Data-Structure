package teacher.homework;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input X Number : ");
		int first_num = sc.nextInt();
		
		System.out.print("Input Y Number : ");
		int second_num = sc.nextInt();
		int cnt =0;
		
		for(int i= first_num; i< second_num+1; i++) {
			if (isCorrectNum(i)) {
				System.out.print(i + " ");
				cnt++;
			}
		}
		System.out.println();
		System.out.println("Count : " + cnt);

	}
	
	public static boolean isCorrectNum(int num) {
		
		String[] strs = String.valueOf(num).split("");
		int[] arr = new int[strs.length];
		
		for(int i=0; i< arr.length; i++) {
			arr[i] = Integer.parseInt(strs[i]);
		}
		
		for(int i=1; i< arr.length; i++) {
			if(arr[i-1] >= arr[i]) {
				return false;
			}
		}
		
		return true;
	}

}
