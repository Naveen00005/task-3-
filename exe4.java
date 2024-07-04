import java.util.Scanner;

public class exe4{
public static void main(String[] args)
 {
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter a String");
 
 String str=scanner.nextLine();

 System.out.println("Enter character");
  char input = scanner.next().charAt(0);




//char[] xyz=new char[str.length()];




int count=0;
for(int i=0;i<str.length();i++)
{

 if(str.charAt(i)==input){
 count++;
 }
}
 System.out.println(count);
}}