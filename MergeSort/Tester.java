package Sorting;

import static Sorting.HeapSort.heapSort;
import static Sorting.MergeSort.mergeSort;

public class Tester {

	public static void main(String[] args) {

		int[] Arr = { 4, 6, 2, 10, 8, 20, 12, 18, 14, 16 };

		System.out.println(" ");
		System.out.print(" | Unsorted Array :- ");
		for (int i = 0; i < Arr.length; i++) {

			System.out.print(Arr[i] + " | ");
		}
		
		
		System.out.println(" ");
		System.out.print(" | After Merge Sort :- ");
		
		MergeSort.mergeSort(Arr, 0, Arr.length-1);
		
		for (int i = 0; i < Arr.length; i++) {

			System.out.print(Arr[i] + " | ");
		}

	}

}
