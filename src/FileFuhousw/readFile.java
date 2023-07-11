package FileFuhousw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class readFile {
       public static void  main(String[]arggs) throws IOException  {
    	   
// cách1   	   File file=new File("src/FileFuhousw/baiFile.txt");
//    	   Scanner sc=new Scanner(file);
//    	   while(sc.hasNext()) {//hasNext() trả về true hoặc false
//    		   	  System.out.println(sc.nextLine());
//    		   
//    	   }
//    	   sc.close();
    	   
// cách2  
    	   File file=new File("src/FileFuhousw/baiFile.txt");
    	   BufferedReader br=new BufferedReader(new FileReader(file));
    	   // đọc chuỗi và ko doc đương dạng số
    	   String doc=br.readLine();
    	   while(doc!=null) {
    	   System.out.println(doc);
    	   	doc=br.readLine();
    	   	
    	   }br.close();
       }
}

