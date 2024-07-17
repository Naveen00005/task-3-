
import java.util.Scanner;
import stringprograms.StringTask;
class Runner{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
StringTask runner = new StringTask();


if (args != null) 
{
int length=runner.lengthOfString(args);
System.out.println("Length of the string: " + length);
} else 
{
System.out.println("Input string is null.");
}

System.out.println("\nEnter a String to convert it into character Array");
String string=scanner.nextLine();
char[] characterArray=runner.convertItIntoCharacterArray(string);
if (characterArray != null){
System.out.println("Converted character array:");
for (char c : characterArray) {
System.out.println(c);
}
}else {
System.out.println("Error : Input string is null.");

}
        
try{
System.out.println("\nEnter a String to find the character ");
String string1=scanner.nextLine();
System.out.print("Enter a number to find from last position : ");
int occurr = scanner.nextInt();scanner.nextLine();
String result = runner.penultimate(occurr ,string1);
System.out.println(result);
}catch(Exception e){
System.out.println(e.getMessage());scanner.nextLine();}
 
System.out.println("\nEnter a String to find the number of occurrences");
String occurrences = scanner.nextLine();
System.out.println("Enter character to find : ");
String charToFind = scanner.nextLine();
char input = charToFind.charAt(0);
int occurrence = runner.numberOfOccurrences(occurrences ,input);
if(occurrence != -1){
System.out.println("Number of occurrences :"+occurrence);
}else{
System.out.println("Error : Input string is null.");
}

System.out.println("\nEnter a String with repeated letters");
String repeate =scanner.nextLine();
System.out.print("Enter the character to find the greatest position: ");
String charToSearch = scanner.nextLine();
char searchCharacter = charToSearch.charAt(0);
if(repeate != null){
int greater = runner.greatestPosition(repeate,searchCharacter);
if(greater>0){
System.out.println("The greatest position is "+greater );
}
else
{
System.out.println("No match found");
}
}else{
System.out.println("Null");}

try{
System.out.println("\nEnter a String to find substring from the last position");
String last = scanner.nextLine();
System.out.println("Enter a number to print from the last");
int last1 = scanner.nextInt();scanner.nextLine();
String fivecharacter = runner.lastFiveCharacters(last,last1);
System.out.println(fivecharacter);
}catch(Exception e){
System.out.println("enter a int value");scanner.nextLine();
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
String replaceCharacters= runner.replaceFirstThreeCharacters(replace,replace1);
System.out.println(replaceCharacters);


System.out.println("\nEnter a String to check from starting");
String ent = scanner.nextLine();
System.out.print("Enter a String to check whether a String starts with : ");
String ent1 = scanner.nextLine();
String checkstring=runner.startsWith(ent,ent1);
System.out.print(checkstring);

System.out.println("\nEnter a String to check from last ");
String le = scanner.nextLine();
System.out.println("Enter a String to check whether a String ends with : ");
String le1 = scanner.nextLine();
String checkcharacter=runner.endsWithLe(le,le1);
System.out.print(checkcharacter);

System.out.println("\nEnter a String to convert an all lowercase string to an uppercase string");
String lower=scanner.nextLine();
String lowertoupper=runner.lowercaseToUppercase(lower);
System.out.println(lowertoupper);

System.out.println("\nEnter a String to convert an all uppercase string to an lowercase string");
String upper=scanner.nextLine();
String uppertolower=runner.uppercaseToLowercase(upper);
System.out.println(uppertolower);


System.out.println("\nEnter a String to Reverse");
String revers=scanner.nextLine();
String reverse=runner.reverseString(revers);
System.out.println(reverse);

try{
System.out.println("\nEnter no of multiple Strings to print");
String[] mstrings= new String [scanner.nextInt()];scanner.nextLine();
System.out.println("Enter Multiple Strings to print");
String multiplestring = runner.acceptMultipleStrings(mstrings,scanner);
System.out.println(multiplestring);
}catch(Exception e){
System.out.println(e.getMessage());}

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
String print = runner.stringToArray(enclose);
System.out.println(print);

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
if(one != null){
boolean equality = runner.checkStringEquality(one,two);
System.out.println(equality);
}else{
System.out.println( "Error : Input string is null.");
}

System.out.println("\nTo check whether the two given input String are equal -case in sensitive");
System.out.print("string 1 :");
String case1 =  scanner.nextLine();
System.out.print("string 2 :");
String case2 =  scanner.nextLine();
if(case1 != null){
boolean ignorecase = runner.checkStringEqualityIgnoreCase(case1,case2);
System.out.print(ignorecase);
}else{
System.out.println( "Error : Input string is null.");
}

System.out.print("\nEnter a string to trim :");
String trim =  scanner.nextLine();
String trim_result = runner.trimString(trim); 
System.out.println(trim_result);
}
}
