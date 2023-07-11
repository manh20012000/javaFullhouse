package Buoi23.Part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
/*
 * Arrays <-> Comparable, Comparator		
 */

/*
 * Collections <-> Comparable, Comparator
 */
		ArrayList<Student> list = Main.initializeStudentList(10);
		
		System.out.println("Before sort");
		Main.printStudentList(list);
		
		System.out.println("After sort");
//		Collections.sort(list);
		
		Comparator<Student> c1 = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.id > o2.id) {
					return 1;
				}else {
					return -1;
				}
			}
			
		};
		
		Comparator<Student> c2 = (o1, o2) -> {
			if(o1.age > o2.age) {
				return 1;
			}else {
				return -1;
			}
		};
		
		Collections.sort(list, c2);
		Main.printStudentList(list);
		
	}
	
	public static ArrayList<Student> initializeStudentList(int n) {
		Random r = new Random();
		r.setSeed(1000);
		
		ArrayList<Student> list = new ArrayList<Student>();
		for(int i = 0; i < n; i++) {
			int id = r.nextInt(5) + 1;
			String name = "Student " + (r.nextInt(5) + 1);
			int age = r.nextInt(100) + 1;
			list.add(new Student(id, name, age));
		}
		return list;
	}
	
	public static void printStudentList(ArrayList<Student> list) {
		for(Student s : list) {
			System.out.println(s);
		}
	}
	
}
