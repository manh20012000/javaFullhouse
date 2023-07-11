package javaFH;
import java.util.Scanner;

public class buoi3 {
     public static void main(String[] args) {
    System.out.println("nhap vào cac ham doi tuog trong chuoi");
         Scanner scan= new Scanner(System.in);
       //  int a= scan.nextInt();
        // System.out.println("kq vua nhap= "+a);
         //scan.nextLine();
      // xuat ra 1 ki tu trong chuoi b
          // String b=scan.nextLine();
             String b= "le van manh";
              System.out.println("chuoi in ra ki tu tai vitri: "+b.charAt(3));         
         //2, noi chuwoi b voi cac kis tu khac
             // System.out.println("noi chuooi voi chuoi khac");
           System.out.println("noi chuoi b lai voi nhau:"+b.concat("le van"));
         // 3,tra ve ddoi tuowng co ton tai hay ko
         System.out.println("tra ve kq "+b.contains("le"));
         //4,tra ve neu chuoi truyen  vao khop voi chuoi ket thuc
            System.out.println("truyrn vao chuoi co giong ketthuc: "+b.endsWith("anh"));
            // 5 tra ve chuoi khopvoi chuoi bat dau
            System.out.println("truyrn vao chuoi co giong bawt dau: "+b.startsWith("l"));
             //6 tra ve chuoi chuyen vao neu bang doi tuong b thi tra ve true/fasle
            System.out.println("truyrn vao chuoi co giong chuoi nhap vao khong: "+b.equals("le van manh"));
            // 7 ko phana biet chu hoa chu thuong\
            System.out.println("ko phan biet chupoi hoa chuowoi thuong: "+b.equalsIgnoreCase("le Van manh"));
            //8 tra ve vi tri bat dau cua chuwoi nhap vao vd nhu chu m=7 thi manh=7;
            System.out.println("truyn va vi tri bat dau cua chuoi nhap vao : "+b.indexOf("manh"));
            //9 tra ve chuoi co bi rỗng hay khong true or false
            System.out.println("tra ve chuwoi co bi trống hay khong: "+b.isBlank());
            //10 tra ve true nếu chuoi rông và ngươc lai
            System.out.println("truyrn vao chuoi co rỗng hay ko "+b.isEmpty());
            //11 tra ve do dai cua chuoi
            System.out.println("tra ve do dai cua chuoi: "+b.length());
            //12 truy xuat tai chi muc nao nó cua chươi;
             System.out.println("tra ve ki tu tai vitri 6: "+b.charAt(b.length()-5));
            //13 thay thế nối 1 kí tự nào ddos
             System.out.println("thay thế ki tu a thành  ạ: "+b.replace("a", "ạ"));
            //14 trả ve chuoi viet thuong tat cả
             System.out.println("tra ve viet thươngf tất cả: "+b.toLowerCase());
           //15 trả ve chuoi viet hoa tat cả
             System.out.println("tra ve viet hoa tất cả: "+b.toUpperCase());
     }
}
