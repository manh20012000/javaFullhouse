package javaFH;
import java.util.Scanner;
import java.util.Arrays;
public class buoi6 {
	/*4. Viết chương trình nhập vào một câu bao gồm nhiều từ sau đó 
	 * in ra câu đã input với dạng title(hướng dẫn: dạng title 
	 * là dạng câu có chữ cái đầu tiên của mỗi từ được viết in
	 *  hoa còn lại viết thường).
     */
	public static void main(String[]args) {  
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap vao chuoi");
		String chuoi=sc.nextLine();
		
		
		chuoi=chuoi.toLowerCase().replaceAll("\\s+"," ");
		//replaceAll là cau truc de tao thay doi cca ki tu ma can thay
		System.out.println("xuat chuoi:"+chuoi);
		// phan tic cau truc bai
		String mang[]=chuoi.split(" ");
		System.out.println(Arrays.toString(mang));
		 chuoi=" ";
  		 for(int i=0;i<mang.length;i++) { 
  			 chuoi=chuoi+(String.valueOf(mang[i].charAt(0)).toUpperCase()+mang[i].substring(1));
  			 if(i<mang.length-1) {
  		 		chuoi=chuoi+" ";
  			 }
  			
  		 }System.out.println("chuoi da thay doi la"+chuoi);
		sc.close();
		
	}
}
