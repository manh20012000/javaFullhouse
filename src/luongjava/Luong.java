package luongjava;

public class Luong {
      public static void main(String[]args) throws InterruptedException {
//    	  //muốn hiển thị ra luồng được chạy là j 
//    	  System.out.println(Thread.currentThread().getName());
//    	  for(int i=0;i<10;i++) {
//    		  System.out.println("in ra i="+i);
//    		  //cho nó ngủ cỡ  1s=1000ms
//    		  Thread.sleep(1000);
//    	  }
    	 
    	    System.out.println("start luongmain:::"+Thread.currentThread().getName());
    	     System.out.println("truoc khi chay o luong main");
    	     
  //cach 1 =======================================================================
    	     
       //   MyThread t0=new MyThread();
      //    t0.start();
       //   new MyThread().start();
    	     
    	     
  //cach 2; //thread runable phải tạo gán đối tượng cho lop myrunable
 //================================================================================
    	      //Runnable runnable=new MyRunlble();có thể
//    	     Thread t0=new Thread(new MyRunlble());
//    	     Thread t1=new Thread(new MyRunlble());
//    	     t1.start();
//    	     t0.start();
    //cách 3=============================================================================  
    	    /* tạo ra các lớp ẩn danh anonimuos .các lớp này có thể k cần tạo ra  nhiẻu
    	     lớp thread để sử lí các hàm mà nó chỉ cần 1 hàm run duy nhất để sử lí toàn 
    	     bộ ccá hàm đó 
    	    */
    	     //co thể Runnable r1=new Runable(); hoac giống phần 4
//    	 Thread t0 =new Thread(new Runnable(){
//    		 @Override
//    		   public void run() {
//
//    		  	  for(int i=0;i<10;i++) { 
//    		  		 
//    		  		  System.out.println(""+Thread.currentThread().getName()+"::"+i);
//    		  		  //Thread.currentThread() được gọi ở đâu thi nó lấy luôn
//    		  		  // luồng ở lớp ẩn danh t0.start();
//    		  		  try {
//    					Thread.sleep(1000);
//    				} catch (InterruptedException e) {
//    					// TODO Auto-generated catch block
//    					e.printStackTrace();
//    				}
//    		 }
//    	 }
// 
//      }); 
//    	 Thread t1 =new Thread(new Runnable(){
//    		 @Override
//    		   public void run() {
//
//    		  	  for(int i=0;i<10;i++) { 
//    		  		 
//    		  		  System.out.println(""+Thread.currentThread().getName()+"::"+i);
//    		  		  //Thread.currentThread() được gọi ở đâu thi nó lấy luôn
//    		  		  // luồng ở lớp ẩn danh t0.start();
//    		  		  try {
//    					Thread.sleep(1000);
//    				} catch (InterruptedException e) {
//    					// TODO Auto-generated catch block
//    					e.printStackTrace();
//    				}
//    		 }
//    	 }
//    		 
// 
//      }); 
//    	 t0.start();
//    	 t1.start();
//    	 
    	//nếu muốn nhiều lường thì tạo các t;
    	     
 //cách 4=======================================================================
    	 //
    /* tạo r từ cấu trúc lam da;
    	chỉ sử udngj cấu trcus này khi có 1 cáí astrac
    	 */
  //PHAN1 CÁCH1  TRuyền ko truc tiếp==================== 
//    	  Runnable r0=()->{
//    		  
//    	  	  for(int i=0;i<10;i++) { 
//    	  		 
//    	  		  System.out.println(""+Thread.currentThread().getName()+"::"+i);
//    	  		  try {
//    				Thread.sleep(1000);
//    			} catch (InterruptedException e) {
//    				// TODO Auto-generated catch block
//    				e.printStackTrace();
//    			}
//    	  	  }
//    	  };
//    	Thread tr=new Thread(r0);
//    	Thread tr1=new Thread(r0);
//    	tr.start();
//    	tr1.start();
    	
 //PHAN2 CÁCH2  TRuyền  truc tiếp ================================ 
    	     Thread tr=new Thread(()->{
       		  
       	  	  for(int i=0;i<10;i++) { 
       	  		 
       	  		  System.out.println(""+Thread.currentThread().getName()+"::"+i);
       	  		  try {
       				Thread.sleep(1000);
       			} catch (InterruptedException e) {
       				// TODO Auto-generated catch block
       				e.printStackTrace();
       			}
       	  	  }
       	  });
    	     Thread tr1=new Thread(()->{
          		  
          	  	  for(int i=0;i<10;i++) { 
          	  		 
          	  		  System.out.println(""+Thread.currentThread().getName()+"::"+i);
          	  		  try {
          				Thread.sleep(1000);
          			} catch (InterruptedException e) {
          				// TODO Auto-generated catch block
          				e.printStackTrace();
          			}
          	  	  }
          	  });
    	     
    	     tr.start();
    	    	tr1.start();
    	    	
    	    Thread.sleep(6000);
    	    System.out.println("end oluong main");
}
}
