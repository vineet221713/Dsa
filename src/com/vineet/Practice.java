package com.vineet;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {5,55,3,77,20,7,6,51,11};
		
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
//
//		for(Integer intr : arr) {
//			System.out.println(intr);
//		}
//		
	}

}
