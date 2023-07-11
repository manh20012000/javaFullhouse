package javaFH;

public class statics {
      public static void main(String...db) {
    	   stt s=new stt("manh");
    	   System.out.println(s);
    	   stt s2=new stt("manh");System.out.println(s2.gtri); 
    	   System.out.println(s2);
    	   System.out.println(stt.gtri);
    	  
      }
}
 class stt{
	   static int gtri=1;
	   stt(String ten){
		  System.out.println(gtri++); 
		   System.out.println(ten);
	   }
}
