import java.util.Scanner;

public class exe17{
public static void main(String[] args)
 {
   Scanner str = new Scanner(System.in);
   System.out.println("Enter multiple Strings");

int noOfString = str.nextInt();  
   str.nextLine();
  String print="";


for (int i = 0; i <noOfString; i++)   
{  
System.out.print("string "+ (i+1) +" : " );
if(i==0){
print=print+ str.nextLine();
}
else{
print=print+"-"+ str.nextLine();
}

} 
System.out.println(print);


}}