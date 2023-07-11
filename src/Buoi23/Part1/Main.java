package Buoi23.Part1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
/*
 * Comparable
 */
//		int[] arr = new int[] {4, 2, 5, 1, 0, 9, 4, 8};
//		System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		Student[] arr = Main.initializeStudentArray(10);
		
		System.out.println("Before sort");
		Main.printStudentArray(arr);
		
		System.out.println("After sort");
		Arrays.sort(arr);
		Main.printStudentArray(arr);
		
	}
	public static Student[] initializeStudentArray(int n) {
		Random r = new Random();
		r.setSeed(1000);
		
		Student[] arr = new Student[n];
		for(int i = 0; i < n; i++) {
			int id = r.nextInt(5) + 1;
			String name = "Student " + (r.nextInt(5) + 1);
			int age = r.nextInt(100) + 1;
			arr[i] = new Student(id, name, age);
		}
		return arr;
	}
	
	public static void printStudentArray(Student[] arr) {
		for(Student s : arr) {
			System.out.println(s);
		}
	}
	
}
