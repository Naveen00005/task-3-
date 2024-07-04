import java.util.Scanner;

public class exe10{
public static void main(String[] args)
 {
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter a String");
   String str=scanner.nextLine();
    String result=str.substring(str.length()- 2,str.length());
   if(result.equals("le"))
{
System.out.println("ends with le");
}

else
{
System.out.println("ends with other letters");
}
}}