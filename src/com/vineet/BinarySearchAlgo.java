package com.vineet;

// searching algorithm used in a sorted array 
//by repeatedly dividing the search interval in half. 
//reduce the time complexity to O(log N). 

/*
Conditions for when to apply Binary Search in a Data Structure:
The data structure must be sorted.
Access to any element of the data structure takes constant time.  */

//Iterative Binary Search Algorithm
//Recursive Binary Search Algorithm


//Iterative binary search ;
/*
public class BinarySearchAlgo {
	public static int binarysearch(int[] arr , int x) {
		
		int l = 0, r = arr.length-1 ;
		
		while(l<=r) {
			
			int m = l + (r-1)/2 ;
			
			if(arr[m]==x)
				return m ;
			
			if(arr[m]<x)
				l = m+1 ;
			
			else
				r = m-1 ;
		}
		
		return -1 ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchAlgo bn = new BinarySearchAlgo();
		int arr[] = {2,3,4,10,40};
		int n = arr.length;
		int x = 1;
		int result = bn.binarysearch(arr,x);
		
		if(result == -1) {
			System.out.println("Element are not present in array");
		}
		else
			System.out.println("element are present at index "+ result);
	}

} */



//recursive binary search 

public class BinarySearchAlgo {
	public static int binary(int[]arr ,int l ,int r , int x) {
		
		if(r>=l) {
			int mid = l + (r-l)/2 ;
			
			if(arr[mid]==x)
				return mid ;
		
		if(arr[mid]>x)
			return binary(arr,l,mid-1,x);
		
		return binary(arr,mid+1,r,x);
		
	}
		return -1 ;
	}
public static void main(String[] args) {
	
	
	int arr[] = {2,3,4,10,40};
	int n = arr.length;
	int x = 10;
	int result = binary(arr,0,n-1,x);
	
	if(result ==-1) {
		System.out.println("element are not presnt in array");
	}
	else
		System.out.println("Element are Presnt at index"+result);
}
	
	
}
