package teacher.homework;
import java.io.*;

public class Problem1213_3 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split("");
		
		int result = 0;
		int idx = 0;
		
		for(String s : input) {
			if(s.equals("o")) {
				result += ++idx;
			} else {
				idx = 0;
			}
		}
		
		System.out.println(result);

	}

}
