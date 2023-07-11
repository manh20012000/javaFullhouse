package keThua;

public class cha {
				public String name;
				public int  aged;
				public int macm;
				public cha(String name, int aged,int macm) {
					super();
					this.name = name;
					this.aged = aged;
					this.macm = macm;
				}
				public void  getinformation() {
					System.out.println("ten ng iu e la: "+this.name);
				}
				public void ngu() {
					System.out.println("di ngu"+this.name);
				}
				public void lamviec() {
					System.out.println("ma cm "+this.macm);
				}
				
}
