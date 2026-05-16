package exercise3;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        int day, month, year;

        Scanner sc = new Scanner(System.in);

        while(true){

            try{

                System.out.print("Input day: ");
                day = sc.nextInt();

                System.out.print("Input month: ");
                month = sc.nextInt();

                System.out.print("Input year: ");
                year = sc.nextInt();

                int maxDay = 31;

                
                if(month == 4 || month == 6 ||
                   month == 9 || month == 11){

                    maxDay = 30;

                }

              
                else if(month == 2){

                    if(year % 400 == 0 ||
                       (year % 4 == 0 && year % 100 != 0)){

                        maxDay = 29;

                    }else{

                        maxDay = 28;

                    }

                }

               
                day++;

               
                if(day > maxDay){

                    day = 1;

                    month++;

                    
                    if(month > 12){

                        month = 1;

                        year++;

                    }

                }

                System.out.println("Next day: "+ day + "/" + month + "/" + year);

                break;

            }catch(Exception e){

                System.out.println("Invalid input!");

                sc.nextLine();

            }

        }

    }

}