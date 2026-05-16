
package exercise1;

import java.util.Scanner;

public class Exercise1 {

   
    public static void main(String[] args) {
       
        int min,GCD = 0;
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("input two value number of a and b ");
        
        System.out.print("Input a:");
        int a = sc.nextInt();
        
        System.out.print("Input b:");
        int b = sc.nextInt();
        
        
        if(a<b){
            min = a;
        }else{
        min = b;
        }
        for(int i = 1; i<=b;i++){
        
            if(a%i==0 && b%i==0){
                System.out.println("Common divisor :"+i);
                //Great Common Divisor
                GCD = i;
            }
        }
        
         System.out.println("Great Common Divisor:" +GCD);
         
        //Least Common Multiple
        
         int LCM = (a*b)/GCD;
         
         System.out.println("Least Common Multiple:"+LCM);
         
    }
    
}
