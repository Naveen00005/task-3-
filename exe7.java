import java.util.Scanner;

public class exe7{
public static void main(String[] args)
 {
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter a String");
   String str=scanner.nextLine();
  String result=str.substring(0,3);

  System.out.println(str.replace(result,"xyz"));
}}