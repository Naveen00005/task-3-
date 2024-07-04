import java.util.Scanner;

public class exe9{
public static void main(String[] args)
 {
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter a String");
   String str=scanner.nextLine();
  String result=str.substring(0,3);
   if(result.equals("ent"))
{
System.out.println("starts with ent");
}

else
{
System.out.println(" starts with other letters");
}
}}