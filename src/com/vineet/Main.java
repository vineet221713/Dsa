package com.vineet;

import java.util.Scanner;

public class Main {
	
	
	
	/*
	// Prime Factor
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 1440 ;
		
		for(int div =2;  div*div <n; div++) {
			
			while(n%div==0) {
				
				n = n/div ;
				
				System.out.println(div + " ");
			}
			
			
		}
		if(n != 1) {
			System.out.println(n);
		}
		

	} */

	
	
	//Paithgoush Therum ;
	
	public static void main(String[] args) {
	
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		
//		int max = a;
//		if(b>=max) {
//			max =b ;
//		}
//		if(c>=max) {
//			max = c ;
//		}
//	
//		if(max==a) {
//			
//		}
		
//		
//		double a = 100;
//		System.out.println(Math.sqrt(a));
//		
//		int n = 5;
//		
//		for(int i =1; i<=n; i++) {
//			
//			for(int j =i; j<=n; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
		
		/*
		int str = 5;
		int sp = 0;
		for(int i =1; i<=5; i++) {
			
			for(int j =0; j<sp; j++ ) {
				System.out.print("\t");
			}
			
			for(int k = 1; k<=str; k++) {
				System.out.print("*\t");
			}
			
			str--;
			sp++;
			System.out.println();
		}
		
		*/
		
		
		
		/*
		
		//vehicle -->wheel problem ;
		//200 --800-540 = 260/2 = 130 ---> two wheel ;
		//now total wheel is =200-130 = 70 ;
		
		int v = 200;
		int w = 540;
		
		float res = ((4*v)-w)/2 ;
		
		//800-540=260/2=130
		//v-res=200-130= 70 
		if(w>=2 && (w%2==0) && v<w)              
            System.out.println("TW= "+(int)(res)+" FW= "+(int)(v-res));
            else                
            System.out.println("INVALID INPUT");
            
            */
		
		
		/*
		
		String str = "*#*##**#*";
		
		int count1 = 0;
		int count2 = 0;
		
		for(int i = 0; i<str.length(); i++) {
			
			if(str.charAt(i)=='*') {
				count1++ ;
			}
			else if(str.charAt(i)=='#') {
				count2++ ;
			}
		}
		System.out.println(count1-count2);
		
		
		*/
		
		    /*
		    int count = 0 ;
		  
	        int arr[]=  {5,5,9,8,3,2} ;
	        int max = -0;
	        for(int i=0 ; i<arr.length; i++)
	                {
	                    max=arr[i];
	                    count++;
	                }
	            
	            System.out.println(count);
		*/
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int coll = sc.nextInt();
		
		int arr[][] = new int[row][coll] ;
		
		for(int i =0; i<row; i++) {
			
			for(int j =0; j<coll; j++) {
			
			arr[i][j]= sc.nextInt();
			int max = 0,count = 0,index = 0;
			
			for(int k=0; k<row; k++) {
				
				count = 0;
				for(int l =0;l<coll ; l++) {
					
					if(arr[i][j]==1)
						count++;
				}
				if(count>max) {
					max=count ;
					index=i+1;
				}
				
				
			}
			System.out.println(index);
			
			}
		}
		
	}

}
