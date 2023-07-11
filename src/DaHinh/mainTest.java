package DaHinh;

public class mainTest {
	// tính đa hinh thể hiện giữa 2 về 1 đói tượng có rất nhièu thể hiện của nó
	// và tùy thược vào lớp kês thừa của nó
	//va lớp cha sử dụng thuộc tính của lớp con khi nó được ghi đè laij
       public static void main(String...arsf) {
    	   Emloiy e1=new Emloiy("manh","1");
    	   e1.getInformation();
    	   System.out.println();
    	   
    	   work w=new work("manh","1","develop");
    	   w.getInformation();
    	   
    	    System.out.println();
    	    //neeusm maf vế trái nó nhận thể hiện thành phần lớp nào thì lớp đó có có tính chất t
    	    // thể hiện của lớp đó mặc dù getInformation của emloiy vhir có 2 thuọc 
    	    // tính
    	    //* đây kà phương thức upcatig
    	   Emloiy e2=new work("manh","1","develop");
    	   e2.getInformation();
    	   // ép kiểu class cha về class con hạọc gán cố đinhj thi word w2=((work)e2)
    	      System.out.println(((work)e2).nghe);
       }
}
