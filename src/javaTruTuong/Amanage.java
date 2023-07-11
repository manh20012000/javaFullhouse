package javaTruTuong;

import java.util.ArrayList;
 // lớp absytacct laf lớp bt nhưng thêm phương thưucs trưf tưuojng 
// nó không tảo ra  thể hiện ở lớp main vd Amanage am=new Amanage() sai  nhako đc
public abstract class Amanage{
	public ArrayList<quanli> lst;
	public Amanage() { 
		this.lst=new ArrayList<quanli>();
	}
	public void helll() {
		System.out.println("helllo");
	}
	//cac phuong thuc tru tuong
	 /* lớp nào mà kê thừa từ lớp aptrac thì nó phải kế thừa tất cả các phưinh thưcs của 
	  * lớp trừ tượngvà ko thể tạo ra thể hịwenej của lốp trừu tượng **/
	public abstract void  add(emily el);
	public abstract void getAll();
	
	public void getAll(emily el) {
// đây là phương thưucs bình thường
		System.out.println("hello");
	}
}
