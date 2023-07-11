package keThua;

public class lopCon extends cha {
		public String lop;
		public int masv;
		public String nganh;
		public lopCon(String name,int eged,int macm,String lop, int masv, String nganh) {
			super(name,eged,macm);
			this.lop = lop;
			this.masv = masv;
			this.nganh = nganh;
		}
		public void truong() {
			System.out.println("truong cua hs ka"+this.name);
		}
		//tao phuong thuc moi hoan toan
		public void getinfor() {
			System.out.println("ten "+super.name);
			System.out.println("tuoi "+super.aged);
			System.out.println("ma cm "+super.macm);
			System.out.println("masv "+this.masv);
			System.out.println("lop "+this.lop);
			System.out.println("nganh cua sv "+this.nganh);
			
		}
		
}
