//A1073327 李豐成

import java.util.HashMap;
import java.util.Scanner;

public class A1073327_hash{
  public static void main(String[] args) {

    // Create a HashMap object called hashMonths
    HashMap<Integer, String> hashMonths = new HashMap<Integer, String>();

    // Add keys and values (number, Month)
    hashMonths.put(1, "January");
    hashMonths.put(2, "February");
    hashMonths.put(3, "March");
    hashMonths.put(4, "April");
    hashMonths.put(5, "May");
    hashMonths.put(6, "June");
    hashMonths.put(7, "July");
    hashMonths.put(8, "August");
    hashMonths.put(9, "September");
    hashMonths.put(10, "October");
    hashMonths.put(11, "November");
    hashMonths.put(12, "December");
    
    //System.out.println(hashMonths);
    //System.out.println(hashMonths.get(1));
    
    Scanner scn = new Scanner(System.in);
     
    while(true){
        System.out.print("Please Input Number :");
        try{
            
                int a = scn.nextInt();

                scn.nextLine();

                if(a<=12 && a>0){
                    System.out.println(hashMonths.get(a));
                    break;
                }
                else{
                    System.out.println("Wrong Number!");//not in range
                }
        }
        catch (Exception e) {
            scn.nextLine();
            System.out.println("Whrong Number!");
        }
    }
    scn.close();
    return;
    }
}

