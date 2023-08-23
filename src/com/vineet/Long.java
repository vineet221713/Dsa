package com.vineet;

public class Long {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "axyesonp";
		
		String str2 = "aeiou";
		
		int count = 0 ;
		for(int i =0; i<str1.length(); i++) {

			for(int j =0; j<str2.length(); j++) {
				
				if(str1.charAt(i)==str2.charAt(j)) {
					count++;
				}
				
				if (count==2) {
					System.out.println(i +" "+ j);
						
					}

				}
			
		
			}
			
			  
			  
		}

	}


