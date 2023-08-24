package com.vineet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Test
{

		 public static void main(String[] args) {
				// TODO Auto-generated method stub
			 
//1st way 			 
		/*	 
		 int[] arr = {5,8,71,121,55,89};
		 
		  int max = arr[0];
		  
		  for(int i =0; i<arr.length; i++) {
			  if(arr[i]<max) {
				  max = arr[i];
			  }
		  }
		  System.out.println(max);

			
			
			*/
			 
			 
			 
			 
			   /*  2nd way 
			 
			 
			 int[] arr = {5,8,71,121,55,89};
			 
			 List<Integer> list = new ArrayList<>();
			 
			 for(int i =0; i<arr.length; i++) {
				 list.add(arr[i]);
			 }
			 System.out.print(Collections.max(list));
			 
			 */
			 
			 
			//3rd way 
			 
			 int[] arr = {5,8,71,121,55,89};
			 
             int max = Arrays.stream(arr).min().getAsInt();
			 System.out.println(max);
			 
		 }
}