package Sorting;

public class HeapSort {
	
	public static void heapSort(int [] arr, int length) {
		
		if(length <= 1) {
			return;
		}
		
		for(int i=length-1; i>0; i--) {
			
			if(arr[i] > arr[(i-1)/2]) {
				
				int temp = arr[i];
				arr[i] = arr[(i-1)/2];
				arr[(i-1)/2] = temp;
				
			}			
		}
		
		int temp = arr[0];
		arr[0] = arr[length-1];
		arr[length-1] = temp;
		
		heapSort(arr, length-1);		
	}
	

}
