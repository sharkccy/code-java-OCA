package javaapplication_map_full;

import java.util.HashMap;
import java.util.Scanner;

public class JavaApplication_map_full {

    public static void main(String[] args) {
      HashMap<Integer,String> hm = new HashMap<>();
      hm.put(11, "sakura");
      hm.put(22, "sakana");
      hm.put(33, "aruba");
           
      int id, num;
      String mem;
           
      do{
      	System.out.println("1.新增  2.修改  3.查詢  4.刪除  5.結束");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
       
     //----------------------新增會員-------------------------------------     
        
        if(num == 1){
      	   System.out.print("請輸入會員編號:");
      	   id = sc.nextInt();
      	 
      	   if(hm.containsKey(id))
      	      System.out.println("該會員已存在 !!!");
      	   	
      	   else{
      	      System.out.println("請輸入會員名稱:");
              mem = sc.next();
              hm.put(id, mem);	
              System.out.println("新增成功 !!!");	 
              continue;
      	   }	  	
       }
            
     //----------------------修改會員-------------------------------------     
        
       if(num == 2){
       	 System.out.print("請輸入會員編號:");
      	 id = sc.nextInt();
      	
      	 if(hm.containsKey(id))
      	    System.out.println("請輸入新名稱:");
            mem = sc.next();
             
            if (mem.equals(hm.get(id)))
           	   System.out.println("會員名稱無更改");
            else{
           	   hm.put(id, mem);	
               System.out.println("修改成功 !!!");
               continue;
            }
       }
         
     //----------------------查詢會員-------------------------------------     
           
       if(num == 3){
      	 System.out.print("請輸入會員編號:");
      	 id = sc.nextInt();
      	
      	 if(hm.containsKey(id)){
      		System.out.println("會員名稱: " + hm.get(id));
      		continue;
      	 }
      	 else   	
      	   System.out.println("該會員不存在");
       }	   	
       
     //----------------------刪除會員-------------------------------------     
          	   
       if(num == 4){
      	   System.out.print("請輸入會員編號:");
      	   id = sc.nextInt();
      	   
      	   if(hm.containsKey(id)){
      	   	 hm.remove(id);
      	     System.out.println("刪除成功 !!!");
      	     continue;
      	   }
      	   else   	
      	   System.out.println("該會員不存在");
      	}
      
      if (num == 5)	   	
       	  System.exit(0);
      }      
      while(num != 1 || num != 2 || num != 3 || num != 4);
   }
}

