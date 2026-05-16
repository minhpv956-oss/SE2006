
package exercise1;

import java.util.Scanner;


public class Exercise1 {

    public static void main(String[] args) {
       
        /*
        nhập vào a,b,c cạnh của một tam giác sau đó in ra màng 
        hình xem đó là tam giác gì
        vuông, cân, đều vuông cân hoặc thường 
        */
        System.out.println("enter value of a,b and c:");
        
        Scanner sc = new Scanner(System.in);
        
       while(true){
       
           try{
               
             
              
        
               
               System.out.print("input a:");
             int a = sc.nextInt();
               
               System.out.print("input b:");
              int b = sc.nextInt();
               
               System.out.print("input c:");
               int c = sc.nextInt();
               
               if( a<=0 || b<=0 || c <=0){
                   System.out.println("not a triangle");
                   continue;
                    
               }else if((a==b &&a*a + b*b==c*c) ||
                          ( b==c && b*b + c*c == a*a)||
                            (c == a &&  c*c + a*a == b*b )){
                   System.out.println("isosceles right triangle");
                   
               }else if( a*a + b*b==c*c ||
                         b*b + c*c == a*a||
                          c*c + a*a == b*b){
               
                   System.out.println("right triangle");
               }else if(a==b||b==c||c == a){
                   System.out.println("isosceles triangle");

               } else if(a==b && b==c){ 
                   System.out.println("equilateral triangle");
               }
               
               else{
               
                   System.out.println("nomal triangle");}
               
           
               
               break;
               
           
           }catch(Exception e){
               System.out.println("please enter again value!");
               
               sc.nextLine();
           
           }
       
       }
        
    }
    
}
