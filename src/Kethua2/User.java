package Kethua2;

public class User {
     private String name;
     private  String pass;
     private int age;
	public User(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	public User(String name, String pass, int age) {
		super();
		this.name = name;
		this.pass = pass;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	public void information() {
		      System.out.println("cha"+this.getName());
		      
		      System.out.println("cha"+this.getPass());
		  	
	}
	public void test() {
		System.out.println("tesr của lớp cha");
	}
    
}
