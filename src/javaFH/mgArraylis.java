package javaFH;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class mgArraylis{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		ArrayList<String>arl=new ArrayList<String>();
		// them phan tu
		arl.add("a");
		arl.add("b");
		arl.add("c");
		System.out.println("nhap mang arrlist");
		String c=sc.nextLine();
		arl.add(c);
		//1 lần add là vào 1 vị trí nên arl.add 3 land vào 3 vị tri 012 của mahg
		// xuat tai vị tri thu 3 cuua mang arraylist
		System.out.println(arl.get(3));
		System.out.println(arl); 
		//thay doi chi muc tai vi tri thưs  hai lac= manh
//		arl.set(2,"manh" );
//		System.out.println(arl);
		//laays ra do dai cua mang
//		System.out.println("kich thuwc mang");
//		System.out.println(arl.size());
//		//xoa phan tu (remove)
//		arl.remove(1);
//		System.out.println("khi remove");
//		System.out.println(arl);
//		//tra ve vi tri cua gtri trog mag
//		
//		System.out.println(arl.indexOf("manh"));
//		//tra ve tra tri dung sai 
//		System.out.println("tra ve gtri dung sai");
//		System.out.println(arl.contains("manh"));
//		// nhap vao gtri cho mang araylist
//		String[]chuoi=new String[6];
//		   for(int i=0;i<5;i++) {
//			   chuoi[i]=sc.nextLine();
//			   int chuoi3=Integer.parseInt(chuoi[i]);
//		   arl.add(chuoi3);
//		   }
//		   // tên class kiểu j thì ép  giá trị nhap vào ỏe kiêu ấy
//		System.out.println("nhap mang ngutyen  ran dom");
//		   int  []chuoi2=new int[6];
//		   for(int i=0;i<5;i++) {
//			   chuoi2[i]=r.nextInt(7)+1;
//		   arl.add(chuoi2[i]);
////		   }
//		   int  []chuoi4=new int[6];
////		   // them de vào phương thúc mới của lop classs
//		   for(int i=0;i<5;i++) {
//			   chuoi4[i]=r.nextInt(7)+1;
//			  
//		   arl.add((chuoi4[i]));
//		   }
//		System.out.println(arl);
//		
	}

}// Ârralist là 1 mảng để lưu tru đói tuọng nào đó 1 cách linh hoat