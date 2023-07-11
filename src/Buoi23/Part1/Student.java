package Buoi23.Part1;

public class Student implements Comparable<Student> {
	
	public int id;
	public String name;
	public int age;
	
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		// so sánh giữa this với o
		// this > o return 1
		// this == o return 0
		// this < o return -1
		
//		if(this.id > o.id) {
//			return 1;
//		}else if(this.id == o.id) {
//			return 0;
//		}else {
//			return -1;
//		}
		
//		if(this.id > o.id) {
//			return 1;
//		}else {
//			return -1;
//		}
		
//		if(this.id > o.id) {
//			return 1;
//		}else if(this.id == o.id) {
//			if(this.age > o.age) {
//				return 1;
//			}else {
//				return -1;
//			}
//		}else {
//			return -1;
//		}
		
		// this < o return 1
		// this == o return 0
		// this > o return -1
		if(this.id < o.id) {
			return 1;
		}else if(this.id == o.id) {
			return 0;
		}else {
			return -1;
		}
	}

}
