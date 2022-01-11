package service;
import model.MergeSort;

public class DisplayStocks {
	
	// Method to display stocks in ascending order
	public void displayInAsc(double[] stock){

		int size = stock.length;
		double[] arr = new double[size];
		for(int i=0;i<size;i++) {
			arr[i]=stock[i];
		}			
		
		// Sort the array using merge sort
		MergeSort ms = new MergeSort();
		ms.MergeSort(0, size-1, arr);
		
		// Sorted array output in ASC Order
		System.out.println("Stock prices in ascending order are :");
		for (int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	
	// Method to display stocks in descending order
	public void displayInDesc(double[] stock){

		int size = stock.length;
		double[] arr = new double[size];
		for(int i=0;i<size;i++) {
			arr[i]=stock[i];
		}
		
		// Sort the array using merge sort
		MergeSort ms = new MergeSort();
		ms.MergeSort(0, size-1, arr);
		
		// Sorted array output DESC Order
		System.out.println("Stock prices in descending order are :");
		for (int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
		
	}

}