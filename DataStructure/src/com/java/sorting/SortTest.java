package com.java.sorting;

import java.util.Random;


public class SortTest {

	public static void main(String[] args) {
		int[] data = new int[100];
		
		for(int i =0; i< data.length; i++) {
			data[i] = (int)(Math.random()*100);
		}
		
		printArr(data);
		
		int[] ret = insertSort(data);
		
		printArr(ret);
		
		int[] arr = {7,4,2,8,3,5,1,6,10,9};
		
		QuickSort(arr, 0, arr.length-1);
		
		printArr(arr);
		
		

	}
	
	public static int[] insertSort(int arr[]) {
		int i,j,temp;
		
		for(i= 1; i< arr.length; i++) {
			temp = arr[i];
			
			for(j= i-1; j>=0 && arr[j] > temp; j--) {
				arr[j+1] = arr[j];
			}
			
			arr[j+1] = temp;
		}
		
		return arr;
	}
	
//	public static int[] insertSort(int arr[]) {
//		int temp;
//		for(int i = 1; i< arr.length; i++) {
//			temp = arr[i];
//			
//			for(int j= i-1; j> -1; j--) {
//				if(arr[j] > temp) {
//					arr[j+1] = arr[j];
//				} else {
//					arr[j] = temp;
//					break;
//				}
//			}
//		}
//		
//		return arr;
//	}
	public static void QuickSort(int[] arr, int start, int end) {
		if (start < end) {
			int pivot = partition(arr, start, end);
			if(start < pivot-1)
				QuickSort(arr, start, pivot-1);
			if(end>pivot)
				QuickSort(arr, pivot, end);
		}
	}
	
	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start + end)/2];
		
		while(start<=end) {
			while(pivot > arr[start]) {
				start++;
			}
			while(pivot < arr[end]) {
				end--;
			}
			if(start <= end) {
				swap(arr, start, end);
				start++;
				end--;
			}
		}
		return start;
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void printArr(int arr[]) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");	
		}
		System.out.println();
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
}
