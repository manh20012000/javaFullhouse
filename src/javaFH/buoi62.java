package javaFH;
/*
 * viết hàm nhận vào 3 số nguyên và chức năng là\ 
 * trả về số nguyên lớn nhất trong 3 số

 */
 import java.util.Scanner;
public class buoi62 {
	public static int nhap(int a, int b,int c){
	  int max;
	  if(a>b&&a>c) {
		  max= a;
	  }else if(b>a&&b>c) {
		  max= b;
	  }else {
		  max= c;
	  }
	  return max;
}
   public static void main(String[]args){
	   System.out.println(nhap(2,4,6));
     /*viết hàm nhận vào một bộ số thực có độ dài tha
//     y đổi và chúc năng là trả về tích của các số truyền vào
//     */
//	public static void  ham(double...mang) {
//		  double tich=1;
//		for(int i=0;i<mang.length;i++) {
//			tich=tich*mang[i];
//			
//		}double kq=tich;
//		System.out.println(kq);
//		
//		
//		
//	}
//	public static void main(String...args ) {
//		ham(2,4,5);
	}
}

