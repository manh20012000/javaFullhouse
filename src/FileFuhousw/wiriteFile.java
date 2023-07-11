package FileFuhousw;

import java.awt.print.Printable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class wiriteFile {
	Scanner sc=new Scanner(System.in);
  public static void main(String[]ảgs)throws IOException {
	  // ghi đọc tu file txt;
//	  File file= new File("/src/FileFuhousw.txt");
//	  Scanner sc=new Scanner(file);src/data/users.txt
//	  while(sc.hasNext()) {
//		  
//	  }cach 1
	  File file = new File("src/FileFuhousw/baiFile.txt");
	        //them true fase de theem tinh nang viet them tow
		FileWriter fw = new FileWriter(file,true);
		
			fw.write( " nhap thong tin\n");
		
        fw.flush();
		fw.close();
	  
	  //ghi file vaof trang text;
	  //cach2
//	File file=new File("src/FileFuhousw/baiFile.txt");
//	
//	PrintWriter prw=new PrintWriter(file);
//	  prw.write(" số đươc ghi vao trong file la"+"\n");
//	  prw.flush();
//	  prw.close();
//	  
  }
}
