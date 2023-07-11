package luongDongbo;
import java.util.Random;
import java.util.Scanner;
public class RandomNumber extends Thread {
   public   ShareData sharedata; 
        
   public RandomNumber(ShareData sharedata) {
	
	this.sharedata = sharedata;
}
     Scanner sc=new Scanner(System.in);
@Override
  
   public void run() {
        	for(int i=0;i<5;i++) {
        	  this.sharedata.addAndPrintf(new Random().nextInt(3)+1);
        	  System.out.println();
        	}
   }

}
