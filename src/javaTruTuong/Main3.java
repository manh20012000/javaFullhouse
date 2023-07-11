package javaTruTuong;

import java.util.Scanner;

public class Main3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	  Amanage ma=new quanli();
	  System.out.println("nhap gia tri");
	  for(int i=0;i<3;i++) {
		 String a= sc.nextLine();
		 String b=sc.nextLine();
		 //ma.add(new emily("id","ten")';
		  ((Amanage) ma).add(new emily(a,b));
		  
	  }
}
}
