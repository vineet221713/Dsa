package com.vineet;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubArray {

	/*
	[1, 2, 3, 4], There are 10 non-empty sub-arrays.
	The subarrays are (1), (2), (3), (4), (1,2), (2,3), (3,4), (1,2,3), (2,3,4) and (1,2,3,4).
	In general, for an array/string of size n, there are n*(n+1)/2 non-empty subarrays/substrings. */
	
	  static int arr[] = new int[]{1, 2, 3, 4};
      
	  static ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
	
	    static void subArray( int n)
	    {
	        // Pick starting point
	        for (int i=0; i <n; i++)
	        {
	            // Pick ending point
	            for (int j=i; j<n; j++)
	            {
	            	 ArrayList<Integer> temp = new ArrayList<>();
	                // Print subarray between current starting
	                // and ending points
	                for (int k=i; k<=j; k++)
	                 temp.add(arr[k]);
	                    System.out.println(temp+" ");
	            }
    
	       
	        }
	    }
	
	public static void main(String[] args) {
		
		
		SubArray s1 = new SubArray();
		s1.subArray(4);

	}

}
