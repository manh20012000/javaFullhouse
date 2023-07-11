package hamGetSet;

public class chay {
		private String id;
		public String hoten;
		public chay(String id, String hoten) {
			
			this.id = id;
			this.hoten = hoten;
		}
		public void haha() {
			System.out.println("cuoi cai j "+this.hoten);
		}
		// phuong thuc get 
		public String  getid() {
			System.out.println("ma la "+this.id);
			return this.id;
		}
		// phuong thuc set lam thay ddoir 1 cai private
		public void  setid(String id) {
			this.id=id;
			//System.out.println("id thay doi la"+this.id);
		}
		
		
}
