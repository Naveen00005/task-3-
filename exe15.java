import java.util.Scanner;

public class exe15{
public static void main(String[] args)
 {
   Scanner str = new Scanner(System.in);
   System.out.println("Enter multiple Strings");
  // String[] string = new String [str.nextInt()]; 
int noOfString = str.nextInt();  
   str.nextLine();
//  String print="";
String print1="";

for (int i = 0; i <noOfString; i++)   
{  

//print=print+ str.nextLine();
print1=print1.concat(str.nextLine());
  
} 
//System.out.println("output"+print);
System.out.println(print1);

}}