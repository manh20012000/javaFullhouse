package truyCatFianly;

import java.util.Scanner;

public class Try_Catch_Finally {
    public static void main(String...ảgs) {
    	Scanner sc=new Scanner(System.in);
    	int n=0;
    	System.out.println("nhap vao son nguyen n");
    	
    	 try{
    		 
    	 n=sc.nextInt();
    	 
    	}catch(Exception e) {
    		//nếu xãy ra lỗi nhập giatri thi ham try_catch bị ngắt và các 
    		//lệnh khác bên dưới vẫn đươc thưc thi
    		System.out.println("gtri nhapạ vao bị loi dinh dang");
    		//có thể 1 try nhưng catch có thể xãy ra nhiiêu hơn tùy vào bài
    	}finally {
    		System.out.println(" finally van xay ra du là loi nhap vao");
    	}
    	System.out.println("gia tri xuat ra la->>  "+n);
    	sc.close();
    }
}
