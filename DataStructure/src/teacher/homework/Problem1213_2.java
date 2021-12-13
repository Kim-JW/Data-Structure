package teacher.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1213_2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		double aX = stoi(input[0]); double aY = stoi(input[1]);
		
		String[] input2 = br.readLine().split(" ");
		double bX = stoi(input2[0]); double bY = stoi(input2[1]);
		
		System.out.println(bX);
		System.out.println(bY);
		
		String operand = br.readLine();
		
		if(operand.equals("+")) {
			System.out.printf("%.2f %.2f", aX+bX, aY + bY);
		} else {
			System.out.printf("%.2f %.2f", aX-bX, aY - bY);
		}
				
	}
	
	public static int stoi(String s) { 
		return Integer.parseInt(s);
	}

}
