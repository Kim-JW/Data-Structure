package com.java.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] data = {90, 78,100,30,55};
		int[] ret;
		
		ret = bubbleSort(data);
		
		for(int i : ret) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] bubbleSort(int arr[]) {
		int[] result;
		
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j< arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr,j, j+1);
				}
			}
		}
		
		return arr;
	}
	
	public static void swap(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
