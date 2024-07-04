import java.util.Scanner;

public class exe5{
public static void main(String[] args)
 {
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter a String");
   String str=scanner.nextLine();


  System.out.print("Enter the character to find: ");
  char searchChar = scanner.next().charAt(0);

  int maxPosition = 0;
   for (int i = 0; i < str.length(); i++) {
   if (str.charAt(i) == searchChar) {
   maxPosition=i+1;
    }
}
if(maxPosition>0){
   System.out.println(maxPosition);
}else
 {System.out.println("no match");
}}}