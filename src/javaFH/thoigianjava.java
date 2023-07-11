package javaFH;
import java.io.IOException;
import java.sql.Date;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class thoigianjava {
	public static void main(String ...farg)throws IOException  {
//		System.out.println("lê văn mạnh");
   //   ->> đây là thời gian tính đươc khi chạy 1 vòng lăp for của máy tính
//		long time=System.currentTimeMillis();
//		for(int i=1;i<100;i++) {
//			System.out.println("tgian chạy");
//			System.out.println("ko có ng iu");
//			
//		}
//		long time2=System.currentTimeMillis();
//		System.out.println("thoi gian chạy vòng lặp for của máy tính ->là"+(time2-time)+"ms");
	
	//---->>>>>class time unit chuyển từ s sang h và ngược lại 
		
//		System.out.println("doi tu phút sang micros "+TimeUnit.MINUTES.toMicros(1)+"micros");
//		System.out.println("đổi từ ngày sang h"+TimeUnit.DAYS.toHours(1)+"h");
	  //---->>>> import lop java sql date 
//	  Date  date =new Date(System.currentTimeMillis());
//	  System.out.println();
//			  		//currentTimeMillis() lấy ra thời gian hiện tại 
		
		
  //----->>>calede thiết lập múi h cho máy tính
//		Calendar calendar=Calendar.getInstance();
//		System.out.println("ngày:"+calendar.get(Calendar.DATE)+"tháng:"+calendar.get(Calendar.MONTH)+"năm:"+calendar.get(Calendar.YEAR));
//	    calendar.add(Calendar.DATE, 20);//-->> cong them 20 ngày
//	    System.out.println("ngày:"+calendar.get(Calendar.DATE)+"tháng:"+calendar.get(Calendar.MONTH)+"năm:"+calendar.get(Calendar.YEAR));
	
		
		
		// ->>>>lấy ra datefomat mặc định hệ thống
//		SimpleDateFomat fomat=new SimpleDateFomat("dd/MM/yyyy");
//		   Date date=new Date(fomat);
		SimpleDateFormat fomatDate=new SimpleDateFormat("HHa:mm:ss dd/MM/yyyy");
		Date date=new Date(System.currentTimeMillis()); 
		System.out.println(fomatDate.format(date));
		// lấy ra ngayf tháng hiện tạiq
		  	System.out.println(java.time.LocalDate.now());
	}

}
