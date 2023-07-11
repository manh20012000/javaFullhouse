package Class;

import java.util.Scanner;

public class Classname {
	     private String masv;
	     private String ten;
	     public  String  quequan;
	     private String ngaysinh;  
	   
	   static Scanner cs=new Scanner(System.in);
	   public Classname(String masv, String ten, String quequan, String ngaysinh) {
		super();
		this.masv = masv;
		this.ten = ten;
		this.quequan = quequan;
		this.ngaysinh = ngaysinh;
	}
	
	   
	   
	   @Override
	public String toString() {
		return "Classname [masv=" + masv + ", ten=" + ten + ", quequan=" + quequan + ", ngaysinh=" + ngaysinh + "]";
	}
	public String getMasv() {
		return masv;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getQuequan() {
		return quequan;
	}
	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
     
	
	public Classname() {
		System.out.println("moi nhap vao n");
		int n=cs.nextInt();
		for(int i=0;i<n;i++) {
		cs.nextLine();
		String masv=cs.nextLine();
	    String  ten=cs.nextLine();
	    String  quequan=cs.nextLine();
	    String  ngaysinh=cs.nextLine();
		this.masv=masv;
		this.ngaysinh=ngaysinh;
	}
	
	}
}
