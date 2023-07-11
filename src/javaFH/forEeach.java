package javaFH;
//import java.util.Arrays;
import java.util.Scanner;
public class forEeach {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
			
	int mang[]=new int[4];
	for(int i=0;i<4;i++) {
		System.out.println("nhap gtr"+i);
		mang[i]= sc.nextInt();
	}
	//vòng lặp for ear
	for(int a:mang)
	System.out.println(a);
			sc.close();
}
}
