package Enum;

public class thoikhoabieu {
		private haha thứ;
		private String monhoc;
		public haha getThứ() {
			return thứ;
		}
		public void setThứ(haha thứ) {
			this.thứ = thứ;
		}
		public String getMonhoc() {
			return monhoc;
		}
		public void setMonhoc(String monhoc) {
			this.monhoc = monhoc;
		}
		public thoikhoabieu(haha thứ, String monhoc) {
			super();
			this.thứ = thứ;
			this.monhoc = monhoc;
		}
		@Override
		public String toString() {
			return "thoikhoabieu [thứ=" + thứ + ", monhoc=" + monhoc + "]";
		}
	
		
		
		
}
