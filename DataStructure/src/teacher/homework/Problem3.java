package teacher.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백없이 입력하세요");
		String str = sc.nextLine();
		
		babyGin(str);
	}
	
	public static void babyGin(String str) {
		String[] strs = str.split("");
		int[] arr = new int[strs.length];
		
		for(int i=0; i< arr.length; i++) {
			arr[i] = Integer.parseInt(strs[i]);
		}
		
		Arrays.sort(arr);
		
		if(isBabyGin(arr)) {
			System.out.println("Baby-Gin!!!");
		} else {
			System.out.println("Lose!!!");
		}
	}
	
	public static boolean isBabyGin(int[] arr) {
		int[] first = new int[3];
		int[] second = new int[3];
		
		int cnt = 0;
		
		for(int i=0; i< 3; i++) {
			first[i] = arr[i];
			second[i] = arr[i+3];
		}
		
		if(isRun(first) || isTriplete(first)) {
			cnt++;
		}
		
		if(isRun(second) || isTriplete(second)) {
			cnt++;
		}
		
		if(cnt == 2) {
			return true;
		} 
		
		return false;
	}
	
	public static boolean isRun(int[] arr) {
		int comparison = arr[0];
		for(int i=1; i< 3; i++) {
			if(arr[i] != comparison) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isTriplete(int[] arr) {
		int comparison = arr[0];
		for(int i=1; i< 3; i++) {
			if(arr[i] >= comparison) {
				return false;
			}
		}
		return true;
	}

}
