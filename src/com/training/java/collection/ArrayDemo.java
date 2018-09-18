package com.training.java.collection;

public class ArrayDemo {

	public static void main(String args[]) {

		System.out.println("==================== Single Dimension Primitive Array ===========================");
		// declares an Array of integers.
		int[] arr;
		

		// allocating memory for 5 integers.
		arr = new int[5];
		
		//int[] testArr = new int[5];

		// initialize the first elements of the array
		arr[0] = 10;

		// initialize the second elements of the array
		arr[1] = 20;

		// so on...
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element at index " + i + " : " + arr[i]);
		}

		System.out.println("==================== Single Dimension Object Array ===========================");

		// declares an Array of integers.
		Student[] studentArr;

		// allocating memory for 5 objects of type Student.
		studentArr = new Student[5];

		// initialize the first elements of the array
		studentArr[0] = new Student(1, "aman");

		// initialize the second elements of the array
		studentArr[1] = new Student(2, "vaibhav");

		// so on...
		studentArr[2] = new Student(3, "shikar");
		studentArr[3] = new Student(4, "dharmesh");
		studentArr[4] = new Student(5, "mohit");

		// accessing the elements of the specified array
		for (int index = 0; index < studentArr.length; index++) {
			System.out
					.println("Element at " + index + " : " + studentArr[index].roll_no + " " + studentArr[index].name);
		}

		System.out.println("==================== Multi Dimension Primitive Array ===========================");

		// declaring and initializing 2D array
		int multidimArr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

		// printing 2D array
		for (int index2 = 0; index2 < 3; index2++) {
			for (int j = 0; j < 3; j++)
				System.out.print(multidimArr[index2][j] + " ");
			System.out.println();
		}
	}

	// Arrays are always created in HEAP.
	// Arrays can contain both Primitives and Objects.
	// Size of Array cannot be included in Declaration.
	// The declaration doesn’t create array object in heap.

}

class Student {
	public int roll_no;
	public String name;

	Student(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
	}
}