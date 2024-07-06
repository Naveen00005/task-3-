import java.util.Scanner;
import stringprograms.StringTask;

class Runner{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
StringTask runner = new StringTask();

runner.lengthOfString(args);

System.out.println("\nEnter a String to convert it into character Array");
String string=scanner.nextLine();
runner.convertItIntoCharacterArray(string);

System.out.println("\nEnter a String to find the character at the last but one place");
String string1=scanner.nextLine();
runner.penultimate(string1);

System.out.println("\nEnter a String to find the number of occurrences");
String occurrences=scanner.nextLine();
System.out.print("Enter character to find : ");
String charToFind = scanner.nextLine();
char input = charToFind.charAt(0);
runner.numberOfOccurrences(occurrences,input);

System.out.println("\nEnter a String with repeated letters");
String repeate =scanner.nextLine();
System.out.print("Enter the character to find the greatest position: ");
String charToSearch = scanner.nextLine();
char searchCharacter = charToSearch.charAt(0);
runner.greatestPosition(repeate,searchCharacter);

System.out.println("\nEnter a String to print the last five characters");
String last = scanner.nextLine();
runner.lastFiveCharacters(last);

System.out.println("\nEnter a String to print the first three characters");
String three = scanner.nextLine();
runner.firstThreeCharacters(three);

System.out.println("\nEnter a String  to replace the first three characters of a String with “XYZ”");
String replace = scanner.nextLine();
runner.replaceFirstThreeCharacters(replace);

System.out.println("\nEnter a String to check whether a String starts with ENT");
String ent = scanner.nextLine();
runner.startsWithEnt(ent);

System.out.println("\nEnter a String to check whether a String ends with LE");
String le = scanner.nextLine();
runner.endsWithLe(le);

System.out.println("\nEnter a String to convert an all lowercase string to an uppercase string");
String lower=scanner.nextLine();
runner.lowercaseToUppercase(lower);

System.out.println("\nEnter a String to convert an all uppercase string to an lowercase string");
String upper=scanner.nextLine();
runner.uppercaseToLowercase(upper);

System.out.println("\nEnter a String to Reverse");
String revers=scanner.nextLine();
runner.reverseString(revers);

System.out.println("\nEnter no of multiple Strings to print");
String[] mstrings= new String [scanner.nextInt()]; 
System.out.println("Enter Multiple Strings to print");
scanner.nextLine();  
runner.acceptMultipleStrings(mstrings,scanner);

System.out.println("\nEnter no of multiple Strings to concatenate");
int noOfString = scanner.nextInt();
scanner.nextLine(); 
System.out.println("Enter Strings to concatenate");
runner.concatenateIndividualStrings(noOfString,scanner);

System.out.print("\nEnter a line with multiple Strings & enclose each String into a String array : ");
String enclose = scanner.nextLine();
runner.stringToArray(enclose);


System.out.println("\nEnter number of multiple Strings to merge each String with “-” ");
int noOfStrings = scanner.nextInt();  
System.out.println("Enter multiple Strings to merge");
scanner.nextLine();
runner.mergeStrings(noOfStrings,scanner);

System.out.println("\nTo check whether the two given input String are equal -case sensitive");
System.out.print("string 1 :");
String one =  scanner.nextLine();
System.out.print("string 2 :");
String two =  scanner.nextLine();
runner.checkStringEquality(one,two);

System.out.println("\nTo check whether the two given input String are equal -case in sensitive");
System.out.print("string 1 :");
String case1 =  scanner.nextLine();
System.out.print("string 2 :");
String case2 =  scanner.nextLine();
runner.checkStringEqualityIgnoreCase(case1,case2);

System.out.print("\nEnter a string to trim :");
String trim =  scanner.nextLine();
runner.trimString(trim); 
}
}