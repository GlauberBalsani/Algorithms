package com.selectionSort;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {64, 25, 12, 22, 11};
		selectionSort(arr);
		System.out.println("Ordenando");
		printArr(arr);
		
		
		
	}
	
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i ++) {
			int minIndex = i;
			for (int j = i + 1; j < n - 1; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
					
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void printArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		System.out.println();
		}
	}

}
