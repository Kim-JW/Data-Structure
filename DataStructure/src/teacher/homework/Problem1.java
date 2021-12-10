package teacher.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
//		int[] test_case = new int[] {2033,1000,5782,1719,4577,8888,1112,1051,1100,1694};
//		
//		for(int i : test_case) {
//			System.out.println(i + "\t" + processing(i));
//		}
		
		String ret = processing(num);
		
		System.out.println(ret);
		
	}
	
	public static String processing(int num) {
		int result = 0;
		
		String str = String.valueOf(num);
		String[] strs = str.split("");
		
		int[] arr = new int[strs.length];
		
		for(int i=0; i< arr.length; i++) {
			arr[i] = Integer.parseInt(strs[i]);
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i< arr.length; i++) {
			strs[i] = String.valueOf(arr[i]);
		}
		
		str = String.join("", strs);
		
		String new_str = "";
		int zero_cnt = 0;
		
		while(true) {
			for(int i=0; i< str.length(); i++) {
				if (str.charAt(i) == '0') {
					zero_cnt++;
				} else {
					break;
				}
			}
			new_str = "";
			new_str += str.charAt(zero_cnt);
			for(int i=0; i< zero_cnt; i++) {
				new_str += '0';
			}
			new_str += str.substring(zero_cnt+1, str.length());
			str = new_str;
			
			if(str.charAt(0) != 0) {
				break;
			}
		}
		
		return new_str;
	}

}
