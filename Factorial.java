import java.util.Scanner;
public class Factorial{

     public static void main(String []args){
         int fact=1;
		 int n;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number: ");
         n=sc.nextInt();
         for(int i=1;i<=n;i++)
         {
             fact=fact*i;
         }
         System.out.println("Factorial of the number: "+fact);
     }
}