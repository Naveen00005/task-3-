import java.util.Scanner;
import stringprograms.StringTask;

class Runner{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
StringTask runner = new StringTask();

runner.lengthOfString(null);

System.out.println("\nEnter a String to convert it into character Array");
String string=scanner.nextLine();
runner.convertItIntoCharacterArray(null);


System.out.println("\nEnter a String to find the character ");
String string1=scanner.nextLine();
System.out.print("Enter a number to find from last position : ");
int occurr = scanner.nextInt();scanner.nextLine();
runner.penultimate(occurr ,null);

 
System.out.println("\nEnter a String to find the number of occurrences");
String occurrences = scanner.nextLine();
System.out.println("Enter character to find : ");
String charToFind = scanner.nextLine();
char input = charToFind.charAt(0);
runner.numberOfOccurrences(null,input);

System.out.println("\nEnter a String with repeated letters");
String repeate =scanner.nextLine();
System.out.print("Enter the character to find the greatest position: ");
String charToSearch = scanner.nextLine();
char searchCharacter = charToSearch.charAt(0);
runner.greatestPosition(null,searchCharacter);


System.out.println("\nEnter a String to find substring from the last position");
String last = scanner.nextLine();
System.out.println("Enter a number to print from the last");
int last1 = scanner.nextInt();scanner.nextLine();
runner.lastFiveCharacters(null,last1);


System.out.println("\nEnter a String to find substring from first position");
String three = scanner.nextLine();
System.out.println("Enter the number of characters from the first");
int first = scanner.nextInt();scanner.nextLine();
runner.firstThreeCharacters(null,first);


System.out.println("\nEnter a String  to replace the  characters by user ");
String replace = scanner.nextLine();
System.out.println("Enter a character to replace from the starting");
String replace1 = scanner.nextLine();
runner.replaceFirstThreeCharacters(null,replace1);

System.out.println("\nEnter a String to check from starting");
String ent = scanner.nextLine();
System.out.print("Enter a String to check whether a String starts with : ");
String ent1 = scanner.nextLine();
runner.startsWith(null,ent1);

System.out.println("\nEnter a String to check from last ");
String le = scanner.nextLine();
System.out.println("Enter a String to check whether a String ends with : ");
String le1 = scanner.nextLine();
runner.endsWithLe(null,le1);

System.out.println("\nEnter a String to convert an all lowercase string to an uppercase string");
String lower=scanner.nextLine();
runner.lowercaseToUppercase(null);

System.out.println("\nEnter a String to convert an all uppercase string to an lowercase string");
String upper=scanner.nextLine();
runner.uppercaseToLowercase(null);

System.out.println("\nEnter a String to Reverse");
String revers=scanner.nextLine();
runner.reverseString(null);

System.out.println("\nEnter no of multiple Strings to print");
String[] mstrings= new String [scanner.nextInt()];scanner.nextLine();
System.out.println("Enter Multiple Strings to print");
scanner.nextLine();  
runner.acceptMultipleStrings(mstrings,null);



System.out.println("\nEnter no of multiple Strings to concatenate");
int noOfString = scanner.nextInt(); scanner.nextLine();
System.out.println("Enter Strings to concatenate");
scanner.nextLine();
runner.concatenateIndividualStrings(noOfString,null);


System.out.print("\nEnter a line with multiple Strings & enclose each String into a String array : ");
String enclose = scanner.nextLine();
runner.stringToArray(null);


System.out.println("\nEnter number of multiple Strings to merge each String with given symbol ");
int noOfStrings = scanner.nextInt();scanner.nextLine();
System.out.println("Enter a symbol to merge each string");
String symbol=scanner.nextLine();
System.out.println("Enter multiple Strings to merge");
runner.mergeStrings(noOfStrings,null,symbol);


System.out.println("\nTo check whether the two given input String are equal -case sensitive");
System.out.print("string 1 :");
String one =  scanner.nextLine();
System.out.print("string 2 :");
String two =  scanner.nextLine();
runner.checkStringEquality(null,null);

System.out.println("\nTo check whether the two given input String are equal -case in sensitive");
System.out.print("string 1 :");
String case1 =  scanner.nextLine();
System.out.print("string 2 :");
String case2 =  scanner.nextLine();
runner.checkStringEqualityIgnoreCase(null,null);

System.out.print("\nEnter a string to trim :");
String trim =  scanner.nextLine();
runner.trimString(null); 
}
}