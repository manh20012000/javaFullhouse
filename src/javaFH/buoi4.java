package javaFH;
import java.util.Arrays;
// su dung cac vòng lặp va các dangj dieuè kiện của vòng lặp 
import java.util.Scanner;
public class buoi4 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		// c1
		//System.out.println("nhap vao 3 so a b c");
//		    int a= sc.nextInt();
//		    int b= sc.nextInt();
//		    int c= sc.nextInt();
//			int max=0;
//		     if(a>=b&&a>=c) {
//		    	 max=a;
//		    	 System.out.println("mã la"+a);
//		     }else if(b>=a&&b>=c) {
//		    	 max=b;
//		    	 System.out.println("max la b"+b);
//		     }else if(c>=a&&c>=b){
//		    	 System.out.println("max c"+c);
//		     }
		     // su dung cau truc 2 ngoi max=a>b?a:b;
//		========================== toan tu 3 ngoi=========================================================
		/*
		 * Toán tử 3 ngôi:
		 * điều kiện ? giá trị 1 : giá trị 2
		 * sử dụng được với câu điều kiện chỉ có if và else và trong khối if với khối else chỉ tồn tại 1 dòng lệnh duy nhất
		 */
//		     
//		        int a= sc.nextInt();
//			    int b= sc.nextInt();
//			    int c= sc.nextInt();
//				int max=0;
//		          	max=(a>b?a:b)>c?(a>b?a:b):c;
//		         	 System.out.println("max= "+max);
		
//==============================Lệnh if-else==================================================
// 

//		    					int a = 12;
//		    					int b = 11;
//		    					if(a > b) {
//		    						System.out.println("Câu điều kiện này được khớp");
//		    						System.out.println("a lớn hơn b");
//		    					}
//		    					if(a > b) {
//		    						System.out.println("Điều kiện a > b được khớp");
//		    						System.out.println("a lớn hơn b");
//		    					}else {
//		    						System.out.println("Điều kiện a > b không được khớp");
//		    						System.out.println("a bé hơn hoặc bằng b");
//		    					}
//		    					if(a > b) {
//		    						System.out.println("a lớn hơn b");
//		    					}else if(a < b) {
//		    						System.out.println("a bé hơn b");
//		    					}else {
//		    						System.out.println("a bằng b");
//		    					}
//		    					if(a > b) {
//		    						System.out.println("a lớn hơn b");
//		    					}
//		    					if(a >= b) {
//		    						System.out.println("a lớn hơn hoặc bằng b");
//		    					}
//		    					if(a > b) {
//		    						System.out.println("a lớn hơn b");
//		    					}else if(a >= b) {
//		    						System.out.println("a lớn hơn hoặc bằng b");
//		    					}	
 //==============================lenh swith case==========================================
 /*
  * Lệnh switch-case:
  */
// 		int a = 3;
// 		switch(a) {
// 			case 2: {
// 				System.out.println("a bằng 2");
// 				// code...
// 				break;
// 			}
// 			case 4: {
// 				System.out.println("a bằng 4");
// 				break;
// 			}
// 			case 6: {
// 				System.out.println("a bằng 6");
// 				break;
// 			}
// 			default: {
// 				System.out.println("a không khớp");
// 			}
// 		}
// 		String a = "1";
// 		switch(a) {
// 			case "2": {
// 				System.out.println("Thứ hai");
// 				break;
// 			}
// 			case "3": {
// 				System.out.println("Thứ ba");
// 				break;
// 			}
// 			case "7": {
// 				System.out.println("Thứ bảy");
// 				break;
// 			}
//// 			default: {
//// 				System.out.println("a không hợp lệ");
//// 			}
// 		}
 //==================================vong lap for =============================================================
//	   **ct: for(khoi tao; bieu thưc dk; biên tang tien)
//	        for(int i=0;i<9;i++) {
//	        	System.out.println("giatr "+i);
//	        }
//	        
	  // khoi tao khi ra ngoài cua bien khoi tao
//	        	int i=0;
//	        	for(;i<8;i++) {
//	        		System.out.println("giatr "+i);
//	        		
//	        	}
//	        	// i dươc khaii bao nen co the in ragtri i=8
////	        	System.out.println("giatr "+i);
//		   int i=0;
//		   int a=4;
//		   int c;
////		  
//			    i=i++;
//			    a=i-a;
//		        i++; 
//			    int a=i++;
//		 System.out.println("giatr i= "+i++);
//		   System.out.println("giatr i = "+i);
//		   System.out.println("giatr a= "+a);
//	       System.out.println("giatr i= "+i++);
//			int i=6;
//			 int a=++i;
//		 		 System.out.println("giatr a= "+a);
//		 		 System.out.println("giatr i= "+i);
	//khi bỏ đk khỏi còng lặp for
//		   for(int i=0;;i++) {
//			   if(i>=10) {
//				   break;
//			   }
//			   System.out.println("giatr i= "+i);
//		   }
    //khi bỏ gtri i++ ra ngoai vong lăp
//		   for(int i=0;i<10;) {
//			  
//			   System.out.println("giatr i= "+i);
//			   i++;
//		   }
		
	//=====================vong lặp while( dieu kiện để chạy)==============	
	   // vong while bình thường 
//		
//	   int  i=0;
//		while( i<10) {
//			System.out.println("giatr i= "+i);
//			i++;
//		}
		// vong while lun gra ve gtri đung;
//		int i=0;
//		while(true) {
//			System.out.println("giatr i= "+i);
//			i++;
//		}
 //=========vòng lặp do-while(chạy it nhất 1 lần)==========
//	    
//		int i;
//	   do {
//		   System.out.println("moi ban nhập vào i");
//		    i=sc.nextInt();
//		   
//	   }while(i<10);
//		   //int i = 0;
////	do {
////		System.out.println("Lần lập thứ: " + i);
////		i++;
////	}while(i < 10);
////	while(i < 0) {
////		System.out.println("Lần lập thứ: " + i);
////		i++;
////	}
////	System.out.println(i);
//	do {
//		System.out.println("Lần lập thứ: " + i);
//		i++;
//	}while(i < 0);
//		System.out.println(i);
	//   =============== vong lặp áp dung cho mang hay danh sách==============
		// cai nay ko cho duyet nguoc mang quay tro lai va khong in ra 
	    int mang[]=new int[6];
	    for(int i=0;i<6;i++) {
	    	System.out.println("nhâpj gtrij cua i= "+i);
	    	mang[i]=sc.nextInt();
	        }
	    	System.out.println(Arrays.toString(mang));
	    // for earch chỉ cho  chieu
		       
            for(double a : mang) {
			System.out.println(a);
		}
	}
}
