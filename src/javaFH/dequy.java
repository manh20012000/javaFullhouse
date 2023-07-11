package javaFH;

public class dequy {
	
	   public static int  tong(int n){
		     if(n<1) {
		    	 return 0;
		     }else {
		    	 return n+tong(n-1);
		     }
		   
		   
	   }
	   public static int tong=0;
	  public static void sum(int n) {
		 
		  if(n==0) {
			  return ;
		  }else{
			  tong=tong+n;
			  sum(n-1);
		  }
	  }
	public static void main(String[]args) {
	
			System.out.println("gia tri cua de ưuy tong la"+dequy.tong(6));
			sum(6);
			System.out.println("tong2="+tong);
	}

}
