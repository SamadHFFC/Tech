import java.io.*;
import java.util.Scanner;
public class even{
    public static void main(String[] args) {
     int n;
     Scanner x=new Scanner(System.in);
     System.out.println("enter a nu:");
     n=x.nextInt();
     if(n%2==0)
     {
     System.out.println("enven");
     }
     else
     {
     System.out.println("odd");
     }
    }
    
}