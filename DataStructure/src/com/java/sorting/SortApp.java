package com.java.sorting;

import java.util.Scanner;

class Sort {
	int[] arr;
	
	public Sort(int[] arr) {
		this.arr = arr;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
	
	public void insertSort() {
		int i,j,temp;
		
		for(i= 1; i< arr.length; i++) {
			temp = arr[i];
			
			for(j= i-1; j>=0 && arr[j] > temp; j--) {
				arr[j+1] = arr[j];
			}
			
			arr[j+1] = temp;
		}
	
	}
	
	public void printArr() {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");	
		}
		System.out.println();
	}
	
	public int[] binarySearch(int start, int end, int target, int cnt) {
		int pivot = (start + end) /2;
		int[] ret = {0,0};
		
		if (start <= end) {
			if(arr[pivot] == target) {
				ret[0] = pivot;
				ret[1] = cnt;
				return ret;
			} else if(arr[pivot] > target) {
				return binarySearch(start, pivot-1, target, cnt+1);
			} else { 
				return binarySearch(pivot+1, end, target, cnt+1);
			}
		}	
		
		return ret;
	}
	
	public void bubbleSort() {
		int[] result;
		
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j< arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(j, j+1);
				}
			}
		}
	}
	
	public void QuickSort(int start, int end) {
		if (start < end) {
			int pivot = partition(start, end);
			if(start < pivot-1)
				QuickSort(start, pivot-1);
			if(end>pivot)
				QuickSort(pivot, end);
		}
	}
	
	public int partition(int start, int end) {
		int pivot = arr[(start + end)/2];
		
		while(start<=end) {
			while(pivot > arr[start]) {
				start++;
			}
			while(pivot < arr[end]) {
				end--;
			}
			if(start <= end) {
				swap(start, end);
				start++;
				end--;
			}
		}
		return start;
	}
	
	public void swap(int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
}

public class SortApp {

	public static void main(String[] args) {
		
		int[] data = new int[100];
		
		for(int i =0; i< data.length; i++) {
			data[i] = (int)(Math.random()*100);
		}
		
		Sort s1 = new Sort(data);
		Sort s2 = new Sort(data);
		Sort s3 = new Sort(data);
		Sort s4 = new Sort(data);
		
//		s1.insertSort();
//		s1.printArr();
//		
//		s2.bubbleSort();
//		s2.printArr();
		
//		int[] arr = {7,4,2,8,3,5,1,6,10,9};
//		
//		s3.printArr();
//		s3.QuickSort(0, data.length-1);
//		s3.printArr();
		
		s4.QuickSort(0, data.length-1);
		s4.printArr();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("찾으려는 수는?");
		int target_num = sc.nextInt();
		int[] ret = s4.binarySearch(0, data.length-1, target_num, 0);
		
		if (ret[0] == 0 && ret[1] == 0) {
			System.out.println("찾는 수가 존재하지 않음.");
		} else {
			System.out.printf("%d는 %d째 인덱스, %d째 만에 찾음",
					target_num,
					ret[0],
					ret[1]);
		}	
	}
}
