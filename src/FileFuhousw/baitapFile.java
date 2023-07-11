package FileFuhousw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class baitapFile {
		public static void main(String[]args) throws IOException {
		   File file1=new File("src\\FileFuhousw\\baitap.txt");
		   PrintWriter p=new PrintWriter(file1);
		 
		   int a;
		   
			   p.write("1\n15\n32\n17\n10\n-1");
			
			   
		   
		   p.flush();
		   p.close();
		   
//			File file = new File("src\\FileFuhousw\\baitap.txt");
//	        //them true fase de theem tinh nang viet them tow
//		        FileWriter fw = new FileWriter(file,true);
//		
//			fw.write( "1\n15\n32\n17\n10\n-1");
//		
//        fw.flush();
//		fw.close();
//	      
		   // đọc file cachs  dung mang as list
		   
//		   File printfile = new File("src\\FileFuhousw\\baitap.txt");
//		 Scanner sc=new Scanner(printfile) ;
//		 ArrayList<Integer>arr=new ArrayList<Integer>(); 
//		    while(sc.hasNext()){
//		    	System.out.println(sc.nextInt());
//		    }
//		    int tong=0;
//		     for( int i:arr) {
//		         tong=tong+i;
//		     }
//		     System.out.println("gtri của tong"+tong);
//		     
//		    sc.close();
//		   
//		}
		   File printfile = new File("src\\FileFuhousw\\baitap.txt");
			 Scanner sc=new Scanner(printfile) ;
			 int tong=0;
			    while(sc.hasNext()){
			    	
			    	 tong=tong+sc.nextInt();
			   
			     
			    }System.out.println("gtri của tong"+tong);
			    sc.close();
			   
			
		File file = new File("src\\FileFuhousw\\baitap.txt");
        //them true fase de theem tinh nang viet them tow
	        FileWriter fw = new FileWriter(file,true);
	
		fw.write( "\ntong la= "+tong);
	
    fw.flush();
	fw.close();
}
}
