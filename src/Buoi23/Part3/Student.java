package Buoi23.Part3;

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
		if(this.id > o.id) {
			return 1;
		}else {
			return -1;
		}
	}

}
