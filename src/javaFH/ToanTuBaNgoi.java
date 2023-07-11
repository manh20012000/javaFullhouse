package javaFH;

public class ToanTuBaNgoi {
public static void main(String...adt) {
	  int a=6;
	  int b=9;
	  int max= a>=b ?a:b;
	  System.out.println("gtr max1 "+max);
	int a1=4;int c=9; int b1=22;
	int max2=((a1>=b1 ?a1:b1)>=c ?(a1>=b1?a1:b1):c);
	System.out.println("gtri maxw"+max2);
}
}
