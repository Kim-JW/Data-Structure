package com.java.programming.homework;

import java.io.*;
import java.util.HashMap;
public class dijkstra {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		int node = Integer.parseInt(input[0]);
		int vertex = Integer.parseInt(input[1]);
		
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		
		for(int i=0; i< vertex; i++) {
			String[] inp = br.readLine().split(" ");
			int s = Integer.parseInt(inp[0]);
			int e = Integer.parseInt(inp[1]);
			int cost = Integer.parseInt(inp[2]);
			
			
		}
	}
}
