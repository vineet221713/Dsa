package com.vineet;

public class LargestNumberOfArrays {

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
		/* 
		 int[] arr = {5,8,71,121,55,89};
		 
        int max = Arrays.stream(arr).max().getAsInt();
		 System.out.println(max);
		 */
		 
		 
		 //4th way 
		 
		 /*
		 int arr[]={12,45,67,89,100,23,3456,897,452,444,899,700};
         Arrays.sort(arr);
         System.out.println("Largest number from given array: "+arr[arr.length-1]);
         
         
         time cplicty = nlogn
		 */
		 
//		 othrs have o(n);
	 }
}
