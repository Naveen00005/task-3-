import java.util.*;
import java.io.*;
import stringprograms.StringTask;
import stringprograms.CustomExceptions;
import stringprograms.UtilTask;

class Runner{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
StringTask runner = new StringTask();

BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        
try {
System.out.println("Enter a string: ");
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
System.out.println("\nEnter a String :");
String string1 = scanner.nextLine();
System.out.print("Enter a number to find from last position: ");
int occurrence = scanner.nextInt(); scanner.nextLine(); 
char result = runner.stringFromIndex(occurrence, string1);
System.out.println("From the given position, it contains: " + result);
}catch (Exception e) {
System.out.println(e.getMessage());scanner.nextLine(); 
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
System.out.println("The greatest index position is "+greater );
} catch (Exception e) {
System.out.println(e.getMessage());
}

try{
System.out.println("\nEnter a String to find substring from the last position");
String last = scanner.nextLine();
System.out.println("Enter a number to print from the last");
int last1 = scanner.nextInt();scanner.nextLine();
String fivecharacter = runner.getLastNCharacters(last,last1);
System.out.println("The last "+last1+" Characters "+fivecharacter);
}catch(Exception e){
System.out.println(e.getMessage());scanner.nextLine();
}

try{
System.out.println("\nEnter a String to find substring from first position");
String three = scanner.nextLine();
System.out.println("Enter the number of characters from the first");
int first = scanner.nextInt();scanner.nextLine();
String firstThree=runner.getFirstNCharacters(three,first);
System.out.println("From the first "+first+" character :"+ firstThree);
}catch(Exception e){
System.out.println(e.getMessage());scanner.nextLine();
}


try{
System.out.println("\nEnter a String  to replace the  characters by user ");
String replace = scanner.nextLine();
System.out.println("Enter a character to replace from the starting");
String replace1 = scanner.nextLine();
System.out.println("Enter a number of character to replace");
int replacechar = scanner.nextInt();scanner.nextLine();
String replaceCharacters= runner.replaceCharacters(replace,replace1,replacechar);
System.out.println("Replaced the string for the characters :"+ replaceCharacters);
}catch(Exception e){
System.out.println(e.getMessage());scanner.nextLine();
}

System.out.println("\nEnter a String to check from starting");
String ent = scanner.nextLine();
System.out.print("Enter a String to check whether a String starts with : ");
String ent1 = scanner.nextLine();
try{
boolean checkstring=runner.startsWith(ent,ent1);
if(checkstring == true){
System.out.print("Starts with "+ ent1 +" = "+checkstring );
}else{
System.out.print("Starts with other letter = "+checkstring );
}
}catch(Exception e){
System.out.println(e.getMessage());
}

System.out.println("\n\nEnter a String to check from last ");
String end = scanner.nextLine();
System.out.println("Enter a String to check whether a String ends with : ");
String check = scanner.nextLine();
try{
boolean checkcharacter = runner.endsWith(end,check);
if( checkcharacter == true){
System.out.print( "Ends with "+check+ " = "+ checkcharacter);
}else{
System.out.print( "Ends with other letters = "+ checkcharacter);
}
}catch(Exception e){
System.out.println(e.getMessage());
}


System.out.println("\n\nEnter a String to convert an all lowercase string to an uppercase string");
String lower=scanner.nextLine();
try{
String upperCase=runner.convertToUpperCase(lower);
System.out.println("Convert all strings to uppercase :" + upperCase);
}catch(Exception e){
System.out.println(e.getMessage());
}


System.out.println("\nEnter a String to convert an all uppercase string to an lowercase string");
String upper=scanner.nextLine();
try{
String lowerCase =runner.convertToLowerCase(upper);
System.out.println("Convert all strings to lowercase :"+ lowerCase);
}catch(Exception e){
System.out.println(e.getMessage());
}


System.out.println("\nEnter a String to Reverse");
String revers=scanner.nextLine();
try{
String reverse=runner.reverseString(revers);
System.out.println("Reversed string :"+ reverse);
}catch(Exception e){
System.out.println(e.getMessage());
}

try{
System.out.println("Enter a line with Multiple Strings : ");
String mstrings = scanner.nextLine();
String multiplestring = runner.acceptMultipleStrings(mstrings);
System.out.println("Printing the multiple string :"+ multiplestring);
}catch(Exception e){
System.out.println(e.getMessage());scanner.nextLine();}


try{
System.out.println("Enter Strings to concatenate");
String concatenate= scanner.nextLine();
System.out.println("Enter the Symbol : ");
String symbol= scanner.nextLine();
System.out.print("press Enter to concat");
String conSymbol= scanner.nextLine();
String concat = runner.concatenateIndividualStrings(concatenate,symbol,conSymbol);
System.out.println("concatenate strings :" + concat);}
catch(Exception e){
System.out.println(e.getMessage());scanner.nextLine();}	


System.out.print("\nEnter a line with multiple Strings want to spilt : ");
String enclose = scanner.nextLine();
System.out.print("Enter a string to spilt :");
String spilt = scanner.nextLine();
try{
String[] print = runner.stringToArray(enclose,spilt);
System.out.println(Arrays.toString(print));
}catch(Exception e){
System.out.println(e.getMessage());scanner.nextLine();}	


try{
System.out.println("\nEnter number of multiple Strings to merge each String with given symbol ");
int noOfStrings = scanner.nextInt();scanner.nextLine();
System.out.println("Enter a symbol to merge each string");
String symbol=scanner.nextLine();
System.out.println("Enter multiple Strings to merge");
String[] strings = new String[noOfStrings];
for (int i = 0; i < noOfStrings; i++) {
System.out.print("String " + (i + 1) + ": ");
strings[i] = scanner.nextLine();
}
String merge_string = runner.mergeStrings(strings,symbol);
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
System.out.println("Result for check String Equality = " + equality);
}catch(Exception e){
System.out.println(e.getMessage());scanner.nextLine();}

System.out.println("\nTo check whether the two given input String are equal -case in sensitive");
System.out.print("string 1 :");
String case1 =  scanner.nextLine();
System.out.print("string 2 :");
String case2 =  scanner.nextLine();
try{
boolean ignorecase = runner.checkStringEqualityIgnoreCase(case1,case2);
System.out.print("Result for check String Equality IgnoreCase = " + ignorecase);
}catch(Exception e){
System.out.println(e.getMessage());scanner.nextLine();}

System.out.print("\n\nEnter a string to trim :");
String trim =  scanner.nextLine();
try{
String trim_result = runner.trimString(trim); 
System.out.println("Trim result :" + trim_result);
}catch(Exception e){
System.out.println(e.getMessage());scanner.nextLine();}
}
}
