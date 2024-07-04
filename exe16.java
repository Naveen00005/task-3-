import java.util.Scanner;

public class exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a line of text: ");
        String str = scanner.nextLine();
        
        String[] words = str.split("\\s+");
        
        System.out.print("{");
 for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                System.out.print(",");
            	
		}
		
            System.out.print("\"" + words[i] + "\"");
        }
        System.out.println("}");
        
      
    }
}