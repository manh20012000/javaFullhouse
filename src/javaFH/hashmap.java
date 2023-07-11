/*HashMap trong Java là một bảng 

	 * -túc là nó se tương ứng như cái cáse của hàm này với
	 * case của hàm kia
	 * mỗi phân tử gồm 2 thành phân là case và vablue
	 * và cả hasshmap và arrayslist đều phải 
	 * gọi kiểu dữ liệu class
	 * -hapmap cũng thêm được phần tử và sử ding put(case,vablue)
	 * băm dựa trên việc thực hiện Java's Map interface.
	 *  Map là một tập hợp các cặp key-value.
	 *   Nó ánh xạ các key tới các value.
	 *   ? tai sao Arrrays cungx owr dangj class maf ko ddc khai baos cho hashmap
	 */
package javaFH;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class hashmap {
public static void main(String[]args) {
//	// hashmap( key, vaf kiuẻ dữ liệu key (đóio tương,biến))
//   Scanner sc =new Scanner(System.in);
//   HashMap<Integer,ArrayList<String>> a=new HashMap<Integer,ArrayList<String>>(); 
//   a.put(2,new ArrayList<String>());// thêm 1 đối tượng tai key
//   a.get(2).add("cho con");// đối tượng đượ thêm tại vị tris 
//   a.get(2).add("cho to");
//   a.put(3,new ArrayList<String>());
//   a.get(3).add("meo");
//   a.get(3).add("meo con");
//   
//   //System.out.println(a.get(2));
//   System.out.println(a);
//   
   
   //============================== dungf hap map cho que quan ==================================================
   HashMap<String,HashMap<String,ArrayList<String>>> queQuan=new   HashMap<String,HashMap<String,ArrayList<String>>>();
   HashMap<String,ArrayList<String>> huyen= new HashMap<String,ArrayList<String>>();
   ArrayList<String> xa=new  ArrayList<String> ();
       xa.add(" thanh hoa 1");
       xa.add(" thanh hoa 1");
       xa.add(" thanh hoa 2");
       xa.add(" thanh hoa 2");
       huyen.put("tp thanh hoa", xa); 
       huyen.put("tp thanh hoa2", xa); 
       
       queQuan.put("Thanh hoa",huyen);  
   
       queQuan.put("Ha noi",new HashMap<String,ArrayList<String>>());
       queQuan.get("Ha noi").put("cau giay",new ArrayList<String> () );
       queQuan.get("Ha noi").get("cau giay").add("mai dich");
       queQuan.get("Ha noi").get("cau giay").add("xuan thuy ");
       queQuan.get("Ha noi").put("ba dinh",new ArrayList<String> () );
       queQuan.get("Ha noi").get("ba dinh").add("thanh cong ");
       queQuan.get("Ha noi").get("ba dinh").add("quang truong ba dinh ");
       
       System.out.println(queQuan.get("Thanh hoa").toString());
       System.out.println(queQuan.get("Ha noi"));
      
        
    
}

}
