package com.selectionSort;

public class SelectionSort {
	public static void main(String[] args) {
		
		
		
	}
	
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length -1; i ++) {
			int minIndex = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
					
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

}
