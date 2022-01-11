package service;
import model.MergeSort;

public class SearchStocks {
	
	public void search(double[] stock, double key){
		
		// Sort the array and apply binary search for searching
		int size = stock.length;
		double[] arr = new double[size];
		for(int i=0;i<size;i++) {
			arr[i]=stock[i];
		}
		
		// Sort the input array using MergeSort
		MergeSort ms = new MergeSort();
		ms.MergeSort(0, size-1, arr);
		
		// Binary search algorithm
		int start =0;
		int end = size-1;
		
		while(start<=end){
			int mid = (start+end)/2;
			if (arr[mid]==key){
				System.out.println("Stock of value "+ key+ " is present");
				return;
			}
			else if (arr[mid]>key){
				end = mid-1;
			}
			else{
				start = mid+1;
			}	
		}
		System.out.println("Value not found");
		return;	
	}
	
}
	