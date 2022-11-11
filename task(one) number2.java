// Java program to enter the marks of five units and average for the uni
//task one number(2)
package assignment1;
import java.util.Scanner;
public class Assignment1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the marks of five units::\n");
        //Store the values of five units
        float unit_1=in.nextFloat();
        float unit_2=in.nextFloat();
        float unit_3=in.nextFloat();
        float unit_4=in.nextFloat();
        float unit_5=in.nextFloat();
         float total;
         float average;
         total=unit_1+unit_2+unit_3+unit_4+unit_5;
         average=(float)(total/5.00);
         //to display the final out put onto the monitor
          System.out.println("average marks="+average);
         
        
    }
    
}
