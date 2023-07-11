package luongDongbo;

public class Main {
	public  static void main(String...ád) {
		ShareData sh=new ShareData ();
		RandomNumber r1=new RandomNumber(sh);
		RandomNumber r2=new RandomNumber(sh);
		r1.start();
		r2.start();
	// việc sử dụng nhièu luồng giúp bạn thao tác với các nút nhấn khác ngay cả khi
		// thời gian hoàn thành của 1 cái nút nhấn kia vẫn đnag còn
		// hoạt động xãy ra đna xen và // nên nó ko gây lag
	}
} 

