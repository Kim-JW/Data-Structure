package teacher.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1213_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		String[][] str = new String[num][num];
		
		for(int i = 0; i< num; i++) {
			str[i] = br.readLine().split(" ");
		}
		
		printArr(str);

	}
	
	public static void printArr(String[][] str) {
		String result = "";
		for(int i=str.length-1; i> -1; i--) {
			for(int j =0; j< str.length; j++) {
				result += str[j][i];
			}
		}
		System.out.println(result);
	}

}
