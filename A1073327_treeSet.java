//A1073327 李豐成
import java.util.Scanner;
import java.util.TreeSet;

public class A1073327_treeSet{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        
        System.out.println("Input Number 1-100 ");
        for(int i = 0; i < 10 ; i++){
            // set.add(i);
            System.out.print("Please Enter Number "+(i+1)+" :");
            int in = scn.nextInt();
            scn.nextLine();
            if(!(in>0&&in<=100)||!set.add(in)){
                i--;
                continue;
            }
        }
        System.out.println("Total number is "+set.size());
        System.out.println("Number Array is "+set);
        System.out.println("First Number is "+set.first());
        System.out.println("Last Number is "+set.last());
        
        System.out.print("The Number Between 30-70 are : "+set.subSet(30,70));
        scn.close();
        return;
    }

}