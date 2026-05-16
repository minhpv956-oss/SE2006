package exercise4;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        
        System.out.print("enter a number of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    
        int[] arr = array(n);
        findValue(arr, n);
        
        sort(n,arr);
        chen(arr,n);

    }

    public static int[] array(int n) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[n+1];

        for (int i = 0; i < n; i++) {

            System.out.println("input array = [" + i + "].");
            arr[i] = sc.nextInt();

        }
        System.out.println("Out put array");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void findValue(int[] arr, int n) {

        int max, secondMax;

        max = arr[0];
        secondMax = arr[0];

        for (int i = 0; i < n; i++) {

            if (max < arr[i]) {
                    
                max = arr[i];

            }
        }
            System.out.println("max =" + max);

            for (int j = 0; j < n; j++) {
                if ((secondMax < arr[j]) && (arr[j]< max) ) {

                    secondMax = arr[j];
                    

                }
            

            }
                System.out.println("secondMax =" + secondMax);
        }
public static void sort(int n,int[]arr){

    for(int i = 0; i< n-1 ;i++){
        
        for(int j = 0; j<n-i-1;j++){
            if(arr[j]<arr[j+1]){
            
                int temp = arr[j];
                arr[j]=arr[j+1];
                        arr[j+1]=temp;
            }
            
            
        }
    }
    System.out.println("new array :");
    for(int j = 0;j<n;j++){
        System.out.println(arr[j]);
    }

}


public static void chen(int[]arr,int n){

    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number of x:");
    int x = sc.nextInt();
    
    arr[n]=x;
    for(int i = 0; i<n;i++){
    for(int j = 0; j < n-i;j++){
        
        if(arr[j]<arr[j+1]){
        int swap = arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=swap;}
        
    
    }
    
    }
     System.out.println("new chen array :");
    for(int j = 0;j<n+1;j++){
        System.out.println(arr[j]);
    }

}
    }

