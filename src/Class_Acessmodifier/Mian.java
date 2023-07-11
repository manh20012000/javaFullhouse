package Class_Acessmodifier;

public class Mian {
	public static void main(String...ảgs) {
     User u=new User();
     System.out.println(u.tuoi);
     u.syspou();
     u.syspou2();
     System.out.println("sau "+u.tuoi); 
     User u1=new User();
     u1.syspou3();
     System.out.println("sau "+u1.tuoi); 
     
	}
}
