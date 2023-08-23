package com.vineet;

//time camplicity O(n)
//space complicity O(1) 
// Advantage 
//Linear search can be used irrespective of whether the array is sorted or not. 
//It can be used on arrays of any data type.
//Does not require any additional memory.
//It is a well-suited algorithm for small datasets.

//Drawbacks of Linear Search:
//Linear search has a time complexity of O(N), which in turn makes it slow for large datasets.
//Not suitable for large arrays.

//When to use Linear Search?
//When we are dealing with a small dataset.
//When you are searching for a dataset stored in contiguous memory.


public class LinearSearchAlgorithum {
	
	public static int search(int arr[],int N,int x) {
		for(int i= 0; i<N; i++) {
			if(arr[i]==x) {
				return i ;
			}
			
		}
		return -1 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,5,3,40,10,50,21};
		
		int x = 10;
		
		int result = search(arr,arr.length,x);
		if(result == -1) {
			System.out.println("Element are not found");
		}
		else
			System.out.println("eleemnet are presnt at"+result);
	}

}
