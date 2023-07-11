package keThua;

public class Main {
	public static void main(String[]args) {
			cha Cha= new cha("manh",112,21);
			System.out.println(Cha.name);
			Cha.getinformation();
		   lopCon con=new lopCon("manh",112,21,"pm5", 218,"cntt");
		   con.getinformation();
		   con.lamviec();
		   System.out.println("-------ngan cach------");
		   
		   con.getinfor();
		chau c=new chau("a",12,1);
		System.out.println("lop con ");
		System.out.println("ten tu la ="+c.name);
		c.getinformation();
		System.out.println("lop cha ");
		Cha.getinformation();
	
	}		
}
