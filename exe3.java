import java.util.Scanner;

public class exe3{
public static void main(String[] args)
 {
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter a String");

   String str=scanner.nextLine();

 //  char[] xyz=str.toCharArray();

    int abc=str.length()-2;
  
 System.out.println(str.length() + " "+str.charAt(abc));
}
}