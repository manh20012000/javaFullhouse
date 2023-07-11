package Kethua2;
//lớp java luôn luôn kế thauwf của lớp ọect

public class sinhvien extends User {
   public float diem;
      private int masv; 
       
	// kế thua bat buôc phải tạo ta 1 cóntrutcỏ gọi ra
	//phươn thức khoi tạo của lớp cha
	public sinhvien(String name, String pass, int age,int masv,float diem) {
		super(name, pass, age);
		this.diem=diem;
		this.masv=masv;
	}

	//@Override
//	public String toString() {
//		return "sinhvien [diem=" + diem + ", masv=" + masv + "]";
//	}
	@Override
	//nối qua khung code cuat lớp user để ghi lại cho lứo con clsss thì phải có 
	// phương thưc override
	
	public void information() {
		//gọi thông qua gtri cuar lớp cha  thì dùng super
		System.out.println("gtri lop con"+this.diem);
		System.out.println("gtri lop cha"+super.getName());
		System.out.println("gtri lop con"+this.getName());

	}
	@Override
	public void test() {
		super.test();//đúng 
		this.test();// sai sẻz gây stackover Flowr
		System.out.println("day la lơp con");
		
	}

	 

	
	
}
