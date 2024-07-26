import java.util.Scanner;
import stringprograms.StringTask;
import stringprograms.CustomExceptions;
import java.io.*;
class Runner{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
StringTask runner = new StringTask();

BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        
try {
System.out.print("Enter a string: ");
String inputString = reader.readLine();
int length = runner.lengthOfString(inputString);
System.out.println("The length of the entered string is: " + length);
}catch (Exception e) {
System.out.println(e.getMessage());
}

System.out.println("\nEnter a String to convert it into character Array:");
String string = scanner.nextLine();
try {
char[] characterArray = runner.convertItIntoCharacterArray(string);
System.out.println("Converted character array:");
for (char c : characterArray) {
System.out.println(c);
}
} catch (Exception e) {
System.out.println(e.getMessage());
}

try {
System.out.println("\nEnter a String to find the penultimate character:");
String string1 = scanner.nextLine();
System.out.print("Enter a number to find from last position: ");
int occurrence = scanner.nextInt(); scanner.nextLine(); 
String result = runner.penultimate(occurrence, string1);
System.out.println(result);
} catch (Exception e) {
System.out.println(e.getMessage());
scanner.nextLine();
}
 
System.out.println("\nEnter a String to find the number of occurrences");
String occurrences = scanner.nextLine();
System.out.println("Enter character to find : ");
String charToFind = scanner.nextLine();
char input = charToFind.charAt(0);
try{
int occurrence = runner.numberOfOccurrences(occurrences ,input);
System.out.println("Number of occurrences :"+occurrence);
} catch (Exception e) {
System.out.println(e.getMessage());
}

System.out.println("\nEnter a String with repeated letters");
String repeate =scanner.nextLine();
System.out.print("Enter the character to find the greatest position: ");
String charToSearch = scanner.nextLine();
char searchCharacter = charToSearch.charAt(0);
try{
int greater = runner.greatestPosition(repeate,searchCharacter);
System.out.println("The greatest position is "+greater );
} catch (Exception e) {
System.out.println(e.getMessage());
}

try{
System.out.println("\nEnter a String to find substring from the last position");
String last = scanner.nextLine();
System.out.println("Enter a number to print from the last");
int last1 = scanner.nextInt();scanner.nextLine();
String fivecharacter = runner.lastFiveCharacters(last,last1);
System.out.println(fivecharacter);
}catch(Exception e){
System.out.println(e.getMessage());scanner.nextLine();
}

try{
System.out.println("\nEnter a String to find substring from first position");
String three = scanner.nextLine();
System.out.println("Enter the number of characters from the first");
int first = scanner.nextInt();scanner.nextLine();
String firstThree=runner.firstThreeCharacters(three,first);
System.out.println(firstThree);
}catch(Exception e){
System.out.println(e.getMessage());scanner.nextLine();}


System.out.println("\nEnter a String  to replace the  characters by user ");
String replace = scanner.nextLine();
System.out.println("Enter a character to replace from the starting");
String replace1 = scanner.nextLine();
try{
String replaceCharacters= runner.replaceFirstThreeCharacters(replace,replace1);
System.out.println(replaceCharacters);
}catch(Exception e){
System.out.println(e.getMessage());
}


System.out.println("\nEnter a String to check from starting");
String ent = scanner.nextLine();
System.out.print("Enter a String to check whether a String starts with : ");
String ent1 = scanner.nextLine();
try{
String checkstring=runner.startsWith(ent,ent1);
System.out.print(checkstring);
}catch(Exception e){
System.out.println(e.getMessage());
}

System.out.println("\nEnter a String to check from last ");
String le = scanner.nextLine();
System.out.println("Enter a String to check whether a String ends with : ");
String le1 = scanner.nextLine();
try{
String checkcharacter=runner.endsWithLe(le,le1);
System.out.print(checkcharacter);
}catch(Exception e){
System.out.println(e.getMessage());
}


System.out.println("\nEnter a String to convert an all lowercase string to an uppercase string");
String lower=scanner.nextLine();
try{
String lowertoupper=runner.lowercaseToUppercase(lower);
System.out.println(lowertoupper);
}catch(Exception e){
System.out.println(e.getMessage());
}


System.out.println("\nEnter a String to convert an all uppercase string to an lowercase string");
String upper=scanner.nextLine();
try{
String uppertolower=runner.uppercaseToLowercase(upper);
System.out.println(uppertolower);
}catch(Exception e){
System.out.println(e.getMessage());
}


System.out.println("\nEnter a String to Reverse");
String revers=scanner.nextLine();
try{
String reverse=runner.reverseString(revers);
System.out.println(reverse);
}catch(Exception e){
System.out.println(e.getMessage());
}


try{
System.out.println("\nEnter no of multiple Strings to print");
String[] mstrings= new String [scanner.nextInt()];scanner.nextLine();
System.out.println("Enter Multiple Strings to print");
String multiplestring = runner.acceptMultipleStrings(mstrings,scanner);
System.out.println(multiplestring);
}catch(Exception e){
System.out.println(e.getMessage());scanner.nextLine();}


try{
System.out.println("\nEnter no of multiple Strings to concatenate");
int noOfString = scanner.nextInt(); scanner.nextLine();
System.out.println("Enter Strings to concatenate");
String concat = runner.concatenateIndividualStrings(noOfString,scanner);
System.out.println(concat);}
catch(Exception e){
System.out.println(e.getMessage());scanner.nextLine();}	


System.out.print("\nEnter a line with multiple Strings & enclose each String into a String array : ");
String enclose = scanner.nextLine();
try{
String print = runner.stringToArray(enclose);
System.out.println(print);
}catch(Exception e){
System.out.println(e.getMessage());scanner.nextLine();}	


try{
System.out.println("\nEnter number of multiple Strings to merge each String with given symbol ");
int noOfStrings = scanner.nextInt();scanner.nextLine();
System.out.println("Enter a symbol to merge each string");
String symbol=scanner.nextLine();
System.out.println("Enter multiple Strings to merge");
String merge_string = runner.mergeStrings(noOfStrings,scanner,symbol);
System.out.println(merge_string);
}catch(Exception e){
System.out.println(e.getMessage());scanner.nextLine();}


System.out.println("\nTo check whether the two given input String are equal -case sensitive");
System.out.print("string 1 :");
String one =  scanner.nextLine();
System.out.print("string 2 :");
String two =  scanner.nextLine();
try{
boolean equality = runner.checkStringEquality(one,two);
System.out.println(equality);
}catch(Exception e){
System.out.println(e.getMessage());scanner.nextLine();}

System.out.println("\nTo check whether the two given input String are equal -case in sensitive");
System.out.print("string 1 :");
String case1 =  scanner.nextLine();
System.out.print("string 2 :");
String case2 =  scanner.nextLine();
try{
boolean ignorecase = runner.checkStringEqualityIgnoreCase(case1,case2);
System.out.print(ignorecase);
}catch(Exception e){
System.out.println(e.getMessage());scanner.nextLine();}

System.out.print("\nEnter a string to trim :");
String trim =  scanner.nextLine();
try{
String trim_result = runner.trimString(trim); 
System.out.println(trim_result);
}catch(Exception e){
System.out.println(e.getMessage());scanner.nextLine();}
}
}
