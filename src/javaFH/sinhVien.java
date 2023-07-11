package javaFH;

public class sinhVien {
		int masv=2133;
		String ten="manh";
		String lop="pm5";
		int  tuoi=22;
//		
		sinhVien(String ten,int  tuoi){
			this.ten=ten;
			this.tuoi=tuoi;
			System.out.println("ten cuia sinh vien nay khoi tao thanh cong "+this.ten );
			this.lamviec();
			System.out.println("lop cua tui:"+this.lop);
		}
		sinhVien(String ten,int tuoi,String lop){
			
			this(ten,tuoi);
			this.lop=lop;
			System.out.println("dang hoc"+this.lop);
		}
		// tạo đói tương có kien truc giong sv1 (phuong thưc giong clon
		sinhVien clon() {
			sinhVien newsv=new sinhVien(this.ten,this.tuoi,this.lop);
			return newsv;	
		}
		void an() {
			System.out.println("an"+ten);
		}
		void ngu() {
			System.out.println("ngu"+ten);
		}
		void lamviec() {
			System.out.println("dang lam viec "+ten);
		}
		
}	
