

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kavyareddy
 */
public class Solution1 {

   
     
      public static int maximum69Number (int num) {
           int six = -1;
        int gnum =  num;
        
//        for(int i = 0; gnum>0; i++){
//            if(gnum % 10 == 6){
//                six = i;
//            }
//            gnum = gnum/10;
//        }
       // System.out.println(num + 3 * (int)Math.pow(10,six));
        return num + 3 * (int) Math.pow(10,six);
    }

    
	
    
    
//    public static void main(String[] args) {
//       
//        System.out.println( maximum69Number (9669));
//   
//    }

}
