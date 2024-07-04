import java.util.Scanner;

public class exe6{
public static void main(String[] args)
 {
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter a String");
   String str=scanner.nextLine();
  String result=str.substring(str.length()- 5,str.length());
  System.out.println(result);
}}