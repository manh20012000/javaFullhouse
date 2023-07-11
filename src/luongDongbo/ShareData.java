package luongDongbo;

import java.util.Random;

public class ShareData {
	public int n=0;
	public synchronized void addAndPrintf(int  random) {
		 this.n=n+random;
		 
		  System.out.print(this.n+"=>");
		  for(int i=1;i<=n;i++) {
			  System.out.print(" "+i);
		  }
		 
		  System.out.println();
		 
	}

}
