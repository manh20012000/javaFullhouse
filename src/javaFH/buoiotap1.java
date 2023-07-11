package javaFH;
import java.util.Arrays;
import java.util.Scanner;
public class buoiotap1 {
	public static void main(String[] agrs)
	{
		// gtri 10 se tạo ra ố nhớ 
		
		
		int a=10;
		int b=a;
	    // int c=11;
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
//		int a[]= {1,2,3,4,5};
//		int b[]= {1,2,3,4,5};
//		
//		System.out.println(System.identityHashCode(a));
//		System.out.println(System.identityHashCode(a));
         Scanner sc=new Scanner(System.in);
         int c;
         c=sc.nextInt();
         System.out.println(System.identityHashCode(c));
         System.out.println(c);
	}
}
