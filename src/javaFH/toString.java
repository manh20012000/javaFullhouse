package javaFH;

public class toString {
		private String id;
		public String hoten;
		public int data;
		public toString(String id, String hoten, int data) {
			
			this.id = id;
			this.hoten = hoten;
			this.data = data;
		}
		// override cho phép bạn gji d lại tất cả các phơng thức hoặc cả tên class của cha hoặc con 
		
	@Override
		public String toString() {
			return "toString [id=" + id + ", hoten=" + hoten + ", data=" + data + "]";
		}
	//to Strring la phuong thuc in ra tat ca cua chuoi tat ca thong tin 
	public static void main(String[]ảgs) {
				toString ts=new toString("218","mah le",111);
				System.out.println(ts);
	}
}
