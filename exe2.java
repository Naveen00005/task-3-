import java.util.Scanner;

public class exe2{
public static void main(String[] args)
 {
   Scanner scanner = new Scanner(System.in);
 System.out.println("Enter a String");
 
////////////////////////////////////////////
  String str=scanner.nextLine();
   char[] xyz=new char[str.length()];
//char[] xyz = new char[4];
 
for(int i=0;i<str.length();i++)
{
 System.out.println(" char at position " + i +" is "+str.charAt(i));
 xyz[i]= str.charAt(i);
 
}

	for (char c:xyz){
	System.out.println(c);
}
///////////////////////////////////////////////
System.out.println("Enter another  String");
String input = scanner.nextLine();
char[] cha = input.toCharArray();
for (char c:cha){
	System.out.println(c);
}
}
}
