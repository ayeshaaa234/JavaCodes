package week_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Function f1=new Function();
         System.out.println("welcome to system");
         int a;
        int b;
//         int[] arr={1,2,3,4};
         Scanner scanner=new Scanner(System.in);
         try{
              a = scanner.nextInt();
              b = scanner.nextInt();
              f1.divide(a,b);
//             System.out.println("a/b="+(a/b));
//             System.out.println(arr[2]);

         }
         catch(ArithmeticException e){
             System.out.println("divide by zero");
         }
        catch(InputMismatchException e)
         {
             System.out.println("data type is changed");
         }
         catch(IndexOutOfBoundsException e)
         {
             System.out.println("index is out of bounds");
         }
         catch(Exception e){
             System.out.println("all exception will be checked");
         }
             finally {
             System.out.println("in box of finally");
         }

         System.out.println("please try again ");



    }
}
