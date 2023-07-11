package javaFH;

public class Onho {
   public static void main(String...dns) {
	   int  a=10;
	   int b=a;	   ;
	   a=11;//trong java thi gtri quyeets ddinh ddeen o nho
	   System.out.println(System.identityHashCode(a));
	   System.out.println(System.identityHashCode(b));
	   Integer c=10;
	   Integer d=c;
	   System.out.println(System.identityHashCode(c));
	   System.out.println(System.identityHashCode(d));
	   
	   Integer g=10;
	   Integer h=g;
	   g=11;
	   System.out.println("gtr cuar  "+g+"  "+System.identityHashCode(g));
	   System.out.println("gtr cuar  "+h+"  "+System.identityHashCode(h));
	   
	   
	   Integer e=new Integer(11);
	   Integer f=new Integer(11);
	   System.out.println(System.identityHashCode(e));
	   System.out.println(System.identityHashCode(f));
	   System.out.println(e==f);// sai
   }
}
