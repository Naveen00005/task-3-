import java.util.Scanner;

public class exe14{
public static void main(String[] args)
 {
   Scanner str= new Scanner(System.in);
   System.out.println("Enter a Multiple Strings");

   


    String[] string = new String [str.nextInt()];   
    str.nextLine();


for (int i = 0; i <string.length; i++)   
{  

string[i] = str.nextLine();
System.out.println(i+" "+string[i]);
  
} 

System.out.println("You have entered: ");  
  
for(String st: string)   
{  
System.out.println(st);  
}  
}  
}  
