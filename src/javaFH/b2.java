package javaFH;
 import java.util.Scanner;
public class b2 {
  public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("moi ban nhap vao 1 so bki");
	       int a = scan.nextInt();
	       System.out.println("gtri a "+a);
	       scan.nextLine();
	       //nhập vao chuoi
	       String hoVaTen= scan.nextLine();
	       System.out.println("ten vua nhap "+hoVaTen);
	       System.out.println("lay ra ki tu bat ki: "+hoVaTen.charAt(4));
	       float diem;
	       diem=scan.nextFloat();
	       System.out.println("diem cu ban la "+diem);
  }
}
