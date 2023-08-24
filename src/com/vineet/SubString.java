package com.vineet;

public class SubString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "vineet";
		int n = str.length();
		for(int i =0; i<n; i++) {
			
			for(int j =i; j<n; j++) {
				String bag = "";
				for(int k =i; k<=j; k++) {
					bag+=str.charAt(k);
				}
				System.out.println(bag);
				
			}
		
			
		}
	}
}
