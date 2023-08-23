package com.vineet;

public class SubString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "vineet";
		int n = str.length();
		for(int i =0; i<n; i++) {
			String bag = "";
			for(int j =i; j<n; j++) {
				bag+=str.charAt(j);
				System.out.println(bag);
				
			}
		
			
		}
	}
}
