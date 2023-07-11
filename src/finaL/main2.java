package finaL;

import keThua.cha;

public class main2 extends cha {
	//main1 dùng để gọi dia chỉ cưa gtri 
	
	// tạo ra 1 biến kiểu dữ liệu hằng số và không thể thay đổi 
	  
//		final int max=11;
//		public static void bien() {
//		int a=6;
//		
//		System.out.println(a+"lan1");
//		// in ra dịa chỉ cuar biên a
//		
//		int b=a;
//		  b=12;
//		System.out.println("thang b"+System.identityHashCode(a));
//		System.out.println("thang a"+System.identityHashCode(a));
//		}   
//    public static void main(String...ttd) {
//    	int a=12;
//    	int max=12;
////    	System.out.println(a+"lan2");
////    	System.out.println(System.identityHashCode(a));
//    	
//    	bien();
//    	
//    }
//   // sự khac snhau trong java va c++ là khii tạo ra biên sẻ ko tạo ra o
//    //nhớ mà chỉ tạo a
//    // ra ô nhớ khi có gtri dc gán vào và các biến sau nếu có gtri 
//    //bằng nhau thì sẻ dùng chưng 1 biến đó 
//    
	//ket thuc main1
	
	
	public main2(String name, int aged, int macm) {
		super(name, aged, macm);
		// TODO Auto-generated constructor stub
	}
	// ============================main2================================
//	     // biẻu thị  biến final
//	  public static void hammoi() {
//		  final String name ="le van manh";// khong dược tạo ra name để gắn tên mới
//		  	
//	  
//	  }
//	
//	
//	
//	   public static void main(String ...átdg) {
//	     final  int max=11;
//	      // max=11;//bị lỗi khong cấp lại gia tri khi da final ma phải tạo ra biến  mới 
//	
//	   }
//	// kết thuc main 2
//	//====================================main3=============================
//	            // bieu thi thuọc tinh final
//	   public static final String name="le va manh2";
//	   public static void main(String ...ảgs) {
//		   System.out.println(name);
//	   }
//	   // ket thuc main 3
//	   
	   
	   
	 //====================================main4=============================
	    // phương thức ko được ghi de hay ké thừa tu 
	   //lớp khac nếu phương thức lớp đó có fnal
	   	//vd packege ke thưa->lop cha
	   			@Override
	   			public  void getinformation(){//ghi de có final
	   				System.out.println("ten ng iu e la: "+this.name);
	   			}
	   			@Override 
	   			public void ngu(){// ko có final
	   				System.out.println("ten ng iu e la: "+this.name);
	   			}
	   		public static void main(String ...sdb) {
	   			
	   		}
}
