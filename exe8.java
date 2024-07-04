import java.util.Scanner;

public class exe8{
public static void main(String[] args)
 {
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter a String");
   String str=scanner.nextLine();
 
if(str.length()>3)
{
 String result=str.substring(0,3);
System.out.println(str.replace(result,"xyz"));
}
else{System.out.println("enter more character");}
}}