import java.util.*;
import stringprograms.UtilTask;
import stringprograms.StringBuilderTask;
import stringprograms.CustomExceptions;

class StringBuilderRunner {
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
StringBuilderTask builderTask = new StringBuilderTask();
int choice;
try{
do{
System.out.println("Select a task to execute:");
System.out.println("1. Create and append a string.");
System.out.println("2. Append strings with a symbol.");
System.out.println("3. Insert a string in StringBuilder.");
System.out.println("4. Delete specific parts of the string.");
System.out.println("5. Replace a part of the string.");
System.out.println("6. Reverse the string.");
System.out.println("7. Delete a specific substring.");
System.out.println("8. Replace a specific substring.");
System.out.println("9. Find the first index of a symbol.");
System.out.println("10. Find the last index of a symbol.");
System.out.println("0. Exit.");
System.out.print("Enter your choice ... : ");
choice = scanner.nextInt();scanner.nextLine();

switch (choice) {
case 1:
try{
StringBuilder sb = builderTask.createStringBuilder("");
System.out.println("Initial Length in the string builder : " + UtilTask.getLength(sb));
System.out.println("Enter a String to print the length :");
String string = scanner.nextLine();
sb = builderTask.appendString(sb ,string);
System.out.println("The length after appending: " +  UtilTask.getLength(sb));
System.out.println("The final string is: " + sb);
}catch (Exception e) {
System.out.println(e.getMessage());
}
break;

case 2:
try{
System.out.println("\nEnter an initial string :");
String initial = scanner.nextLine();
StringBuilder sb = builderTask.createStringBuilder(initial);
System.out.println("The initial length of the StringBuilder: " +UtilTask.getLength(sb));
System.out.println("Enter the symbol to append : ");
String sym = scanner.nextLine();
System.out.println("Enter number of Strings to append : ");
int noOfStrings = scanner.nextInt();scanner.nextLine();
for (int i = 0; i < noOfStrings ; i++) {
System.out.print("Enter STRING " + (i + 1) + " to append : " );
String str = scanner.nextLine();
sb = builderTask.appendStringWithSymbol(sym,sb, str);
}
System.out.println("The length after adding strings: " +UtilTask.getLength(sb));
System.out.println("The final string: " + sb);
}catch (Exception e) {
System.out.println(e.getMessage());scanner.nextLine();
}
break;

case 3:
try{
System.out.println("\nEnter multiple string separated by symbol :");
String twoString = scanner.nextLine();
StringBuilder sb1 =  builderTask.createStringBuilder(twoString);
System.out.println("The length of the original StringBuilder: " + UtilTask.getLength(sb1));
System.out.println("Enter a symbol to add a string :");
String symbol = scanner.nextLine();
System.out.println("Enter a string to insert between the strings :");
String insertString = scanner.nextLine();
StringBuilder finsert = builderTask.insertInStringBuilder(sb1,symbol,insertString);
System.out.println("The length after insertion : " + UtilTask.getLength(finsert));
System.out.println("The final string: " +finsert);
}catch (Exception e) {
System.out.println(e.getMessage());
}
break;

case 4:
try{
System.out.println("\nEnter multiple Strings separated by symbol to delete :");
String twoStrings = scanner.nextLine();
StringBuilder sbdelete = builderTask.createStringBuilder(twoStrings);
System.out.println("The length of the original StringBuilder: " + UtilTask.getLength(sbdelete));
System.out.println("Enter a symbol to delete :");
String symbols = scanner.nextLine();
StringBuilder delete = builderTask.deleteInitialString(sbdelete,symbols);
System.out.println("The length after deleted : " + UtilTask.getLength(delete));
System.out.println("The final string: " +delete);
}catch (Exception e) {
System.out.println(e.getMessage());
}
break;

case 5:
try{
System.out.println("\nEnter a line in string builder to replace :");
String line = scanner.nextLine();
StringBuilder sb2 = builderTask.createStringBuilder(line);
System.out.println("The length of the original StringBuilder: " + UtilTask.getLength(sb2));
System.out.println("Enter a string to replace :");
String replace = scanner.nextLine();
System.out.println("Enter a symbol to replace :");
String sReplace = scanner.nextLine();
StringBuilder replaced = builderTask.replaceTheString(sb2,replace,sReplace);
System.out.println("Length after replacing the symbols " + UtilTask.getLength(replaced));
System.out.println("Final String: " + replaced);
}catch (Exception e) {
System.out.println(e.getMessage());
}
break;

case 6:
try{
System.out.println("\nEnter a line in string builder to reverse :");
String reverse  = scanner.nextLine();
StringBuilder sb3 =  builderTask.createStringBuilder(reverse);
System.out.println("The length of the original StringBuilder: " + UtilTask.getLength(sb3));
StringBuilder reversing = builderTask.reverseTheString(sb3);
System.out.println("Length after replacing the symbols " + UtilTask.getLength(reversing ));
System.out.println("Final String: " + reversing);
}catch (Exception e) {
System.out.println(e.getMessage());
}
break;

case 7:
try{
System.out.println("\nEnter the string in Stringbuilder specific delete characters : ");
String input = scanner.nextLine();
StringBuilder sb4 =  builderTask.createStringBuilder(input);
System.out.println("The length of the original StringBuilder: " + UtilTask.getLength(sb4));
System.out.println("Enter the starting index number to delete : ");
int from = scanner.nextInt();scanner.nextLine();
System.out.println("Enter the ending index number to delete : ");
int to = scanner.nextInt();scanner.nextLine();
StringBuilder delete = builderTask.deleteTheString(sb4,from,to);
System.out.println("Length after deletion: " + UtilTask.getLength(delete));
System.out.println("Final String: " + delete);
}catch (Exception e) {
System.out.println(e.getMessage());scanner.nextLine();
}
break;

case 8:
try{
System.out.println("\nEnter the string in Stringbuilder specific characters to replace : ");
String inputReplace = scanner.nextLine();
StringBuilder sb5 =  builderTask.createStringBuilder(inputReplace);
System.out.println("The length of the original StringBuilder: " + UtilTask.getLength(sb5));
System.out.println("Enter the starting index number to replace : ");
int fromReplace = scanner.nextInt();scanner.nextLine();
System.out.println("Enter the ending index number to replace : ");
int toReplace = scanner.nextInt();scanner.nextLine();
System.out.println("Enter the string to replace : ");
String replaceString = scanner.nextLine();
StringBuilder afterReplace = builderTask.replacingTheString(sb5,fromReplace,toReplace,replaceString);
System.out.println("Length after replacement: " + UtilTask.getLength(afterReplace));
System.out.println("Final String: " + afterReplace);
}catch (Exception e) {
System.out.println(e.getMessage());scanner.nextLine();
}
break;

case 9:
try{
System.out.println("\nEnter the number of strings in Stringbuilder to find the first index of the symbol :");
int noOfString = scanner.nextInt();scanner.nextLine();
System.out.println("Enter the symbol to append inbetween the string : ");
String symbolsHash = scanner.nextLine();
StringBuilder sb6 =  builderTask.createStringBuilder("");
for (int i = 0; i < noOfString ; i++) {
System.out.print("Enter STRING " + (i + 1) + " to append : " );
String index = scanner.nextLine();
if(i == noOfString-1){
builderTask.appendString(sb6,index);
}else{
builderTask.appendStringWithSymbol(index, sb6,symbolsHash);
}
}
System.out.println("The length of the original StringBuilder: " + UtilTask.getLength(sb6));
int firstSymbol=builderTask.indexOfFirstSymbol(sb6,symbolsHash);
System.out.println("First index position "+ symbolsHash +" is : " + firstSymbol);
}catch (Exception e) {
System.out.println(e.getMessage());scanner.nextLine();
}
break;

case 10:
try{
System.out.println("\nEnter the number of strings in Stringbuilder to find the last index of the symbol :");
int numberOfString = scanner.nextInt();scanner.nextLine();
System.out.println("Enter the symbol to append inbetween the string : ");
String symbolsToFind = scanner.nextLine();
StringBuilder sb7 =  builderTask.createStringBuilder("");
for (int i = 0; i < numberOfString ; i++) {
System.out.print("Enter STRING " + (i + 1) + " to append : " );
String index1 = scanner.nextLine();
if(i == numberOfString-1){
builderTask.appendString(sb7,index1);
}else{
builderTask.appendStringWithSymbol(index1, sb7,symbolsToFind);
}
}
System.out.println("The length of the original StringBuilder: " + UtilTask.getLength(sb7));
int lastSymbol=builderTask.indexOfLastSymbol(sb7,symbolsToFind);
System.out.println("Last index position "+ symbolsToFind +" is : " + lastSymbol);
}catch (Exception e) {
System.out.println(e.getMessage());scanner.nextLine();
}
break;

case 0:
break;
default:
System.out.println("Invalid choice. Please try again.");
}
}while(choice !=0);
} catch (Exception e) {
System.out.println(e.getMessage());
} finally {
scanner.close();
}
}
}
