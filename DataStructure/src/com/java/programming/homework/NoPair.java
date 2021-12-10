package com.java.programming.homework;

import java.io.*;
import java.util.*;

class NoPair {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] str = br.readLine().split(" ");
		
		int[] arr = new int[str.length];
		
		for(int i=0; i< arr.length; i++){
			arr[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(arr);
		
		Stack<Integer> stack = new Stack<>();
		
		boolean flag = true;
		
		int sum =0;
		
		for(int i: arr){
			if (flag) {
				sum +=i;
			} else {
				sum -=i;
			}
			flag = !flag;
		}
		System.out.println(sum);
		
	}
}