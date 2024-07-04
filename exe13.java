import java.util.Scanner;

public class exe13{
public static void main(String[] args)
 {
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter a String to reverse");
   String str=scanner.nextLine();
   String reverse = " ";
//String result = " ";

  for(int i = 0; i < str.length(); i++)
{
//System.out.println("before " +reverse);
reverse = str.charAt(i) + reverse;
//result = result + str.charAt(i);
//System.out.println("after " +reverse);
}
System.out.println(reverse);
//System.out.println(result);
}}