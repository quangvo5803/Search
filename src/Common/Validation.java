package Common;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Validation {
    public int getInt(String prompt){
    Scanner sc = new Scanner(System.in);
    int i = 0;
    boolean isValid = false;
    while (isValid == false){
        System.out.print(prompt);
        if (sc.hasNextInt()){
            i = sc.nextInt();
            isValid = true;
    } 
    else{
        System.out.println("Error! Invalid integer value. Try again.");
    }
        sc.nextLine();
    }
        return i;
   }
   public int getInt(String prompt,int min, int max){
       int i = 0;
       boolean isValid = false;
       while (isValid == false){
           i= getInt(prompt);
           if (i<min)
               System.out.println("Error! Number must be greater than " + min + ".");
           else if(i> max){
               System.out.println("Error! Number must be less than " + max + ".");
           }
           else 
               isValid = true;
       }
          return i;
    }
   
   public int[] getArray(int size){
       int [] a = new int[size];
       Random random = new Random();
       for (int i=0;i<size;i++){
           a[i] = random.nextInt(size);
       }
       return a;
   }
   
   public void display(String prompt,int []a){
       System.out.print(prompt);
       System.out.println(Arrays.toString(a));
   }
}
