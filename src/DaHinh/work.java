package DaHinh;

public class work extends Emloiy{
     public  String nghe;

	protected work(String name, String id, String nghe) {
		super(name, id);
		this.nghe = nghe;
	}
	@Override 
	public void getInformation() {
		   System.out.println("name   "+this.name);
		   System.out.println("id    "+this.id);
		   System.out.println("nghe  "+this.nghe);
		 
	}
}
