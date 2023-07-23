package Sorting;

public class ThreeSortingAlgos {
	
	public static void selectionSort(int [] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}				
			}
		}	
	}//end of selectionSort
	
	public static void insertionSort(int [] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<i; j++) {
				
				if(arr[i] < arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;				
				}			
			}
		}	
	}//end of insertionSort 
	
	public static void bubbleSort(int [] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=1; j<arr.length-1; j++) {
				
				if(arr[j-1] > arr[j]) {
					
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;	
				}				
			}
		}		
	}//end of bubbleSort

}
