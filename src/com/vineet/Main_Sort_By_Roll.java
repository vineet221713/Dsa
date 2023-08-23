package com.vineet;

import java.util.Arrays;

public class Main_Sort_By_Roll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr = {
				new Student(111, "ajay", "delhi"),
				new Student(101, "vijay", "Mumbai"),
				new Student(222, "radha", "govindpur")
				
				
		};
		Arrays.sort(arr,new SortByRoll());

		System.out.println(Arrays.toString(arr));
	}

}
