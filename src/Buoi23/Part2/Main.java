package Buoi23.Part2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
/*
 * Comparator
 */
//		Comparator<Student> c1 = new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				// so s�nh o1 v� o2
//				// o1 > o2 return 1
//				// o1 == o2 return 0
//				// o1 < o2 return -1
//				if(o1.id > o2.id) {
//					return 1;
//				}else if(o1.id == o2.id) {
//					return 0;
//				}else {
//					return -1;
//				}
//			}
//			
//		};
		
		Comparator<Student> c1 = (o1, o2) -> {
			if(o1.id > o2.id) {
				return 1;
			}else if(o1.id == o2.id) {
				return 0;
			}else {
				return -1;
			}
		};
		
		Comparator<Student> c2 = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// so s�nh o1 v� o2
				// o1 > o2 return 1
				// o1 == o2 return 0
				// o1 < o2 return -1
				if(o1.age > o2.age) {
					return 1;
				}else if(o1.age == o2.age) {
					return 0;
				}else {
					return -1;
				}
			}
			
		};

		Student[] arr = Main.initializeStudentArray(10);
		
		System.out.println("Before sort");
		Main.printStudentArray(arr);
		
		System.out.println("After sort");
		Arrays.sort(arr, c1);
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
