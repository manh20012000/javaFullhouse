package javaFH;
import java.util.Scanner;
import java.util.Arrays;
public class mang1chieub3 {
	public static void main(String[]agrs) {
  //de tao ra mnag ta co the khai bao 
		Scanner sc= new Scanner(System.in);
		//cach 1
//	  int mang1[]=new int[5];
//	  for(int i=0;i<5;i++) {
//		  System.out.println("vitri: "+i+"=");
//		   mang1[i]=sc.nextInt();
//		    
//	     }
//	  System.out.println("xuta mang "+Arrays.toString(mang1));
//	   //thay doi 1 phan tu cua mang
//	  mang1[3]=4;
//	    System.out.println("xuta mang "+Arrays.toString(mang1));
//	  // cacsh 2;
//		    int mang2[]={2,3,4,5,6};
//		    System.out.println("xut mang2 "+Arrays.toString(mang2));
//		
	//mang 2 chieu gioon  nhu c
		   double mang2chieu[][]=new double[3][4];
		     
		     
		   for(int i=0;i<3;i++) {
			   for(int j=0;j<4;j++) {
				   System.out.println("vitri: "+i+""+j+"=");
				    mang2chieu[i][j]=sc.nextDouble();
				      
					
			   }
		   }
		   for(int i=0;i<3;i++) {
		   for(int j=0;j<4;j++) {
			   	System.out.println("xuta mang2 chieu "+Arrays.toString(mang2chieu[j]));
	   
		   }
	   
		   }
	
////		  
////	// mang 2 chieu noi tu  mang 1 chiue\
//                 float mang2chieu[][]=new float[3][5];
//                    
//                 for(int i=0;i<5;i++) {
//                	 System.out.println("vitri: "+i+"=");
//                	 //mang2chieu[0]=new float[i];
//                	 mang2chieu[0][i]=sc.nextFloat();
//              }
//              for(int i=0;i<5;i++) {             	
//                 System.out.println("vitri: "+i+"=" );             	
//                 mang2chieu[1][i]=sc.nextFloat();
//                                
//               }
//              for(int i=0;i<5;i++) {
//            	  	System.out.println("vitri: "+i+"=");
//               	 	mang2chieu[2][i]=sc.nextFloat();
//                }       
//              	System.out.println("xuta mang2 chieu "+Arrays.toString(mang2chieu[0]));
//              	
//              	System.out.println("xuta mang2 chieu "+Arrays.toString(mang2chieu[2]));
//	           mang2chieu[1][2]=6;
//	           System.out.println("xuta mang2 chieu "+Arrays.toString(mang2chieu[1]));
//             	
  }
}
	

