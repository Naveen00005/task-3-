package stringprograms;
import java.util.Scanner;
public class StringTask{

public void lengthOfString(String[] args) {
if (args != null) {
for (String a : args) {
int length = a.length();
System.out.println("Length of the string: " + length);
}} else {
System.out.println("Input string is null.");
}
}


public void convertItIntoCharacterArray(String character){
if (character != null) {
char[] ccharacter = character.toCharArray();
System.out.println("Convert it into character Array");
for (char characterarray:ccharacter){
System.out.println(characterarray);
}
} else {
System.out.println("Error : Input string is null.");
}
}

public void penultimate(int occurrence,String character){
if(character != null){
if(character.length() >= occurrence){
int abc=character.length()-occurrence;
System.out.println("From the given position its contain :"+character.charAt(abc));
}
else{
System.out.println("Not able to find penultimate");
}
} else {
System.out.println("Error : Input string is null.");
}
}

public void numberOfOccurrences(String Occurrences,char character){
if(Occurrences != null){
int count=0;
for(int i=0;i<Occurrences.length();i++)
{
if(Occurrences.charAt(i)==character){
count++;
}
}
System.out.println("Number of occurrences :" +count);
} else {
System.out.println("Error : Input string is null.");
}}


public void greatestPosition(String greatest,char character){
if(greatest != null){
int maxPosition = 0;
for (int i = 0; i < greatest.length(); i++) {
if (greatest.charAt(i) == character) {
maxPosition=i+1;
}
}
if(maxPosition>0)
{
System.out.println("The greatest position is "+maxPosition);
}
else
{
System.out.println("No match found");
}
} else {
System.out.println("Error : Input string is null.");
}
}

public void lastFiveCharacters(String character,int position){
if(character != null){
if(character.length() >= position){
String result=character.substring(character.length()- position,character.length());
System.out.print("The last "+position+" characters :"+result);
}else{
System.out.println("Enter a valid input");
}
} else {
System.out.println("Error : Input string is null.");
}
}

public void firstThreeCharacters(String character,int position) {
if(character != null){
if (character.length() >= position) {
String result = character.substring(0, position);
System.out.println("First " +position+" characters: " + result);
} else {
System.out.println("String is too short to find first three characters");
}
} else {
System.out.println("Error : Input string is null.");
}
}

public void replaceFirstThreeCharacters(String character,String replace){
if(character != null){
if(character.length()>=replace.length())
{
 String result=character.substring(0,replace.length());
 System.out.println("Replaced the string for the characters :"+character.replace(result,replace));
}
else{
System.out.println("enter more character");
}
} else {
System.out.println("Error : Input string is null.");
}
}

public void startsWith(String character,String start){
if(character != null){
if(character.length() >= start.length()){
String result=character.substring(0,start.length());
if(result.equals(start))
{
System.out.println("Starts with "+start);
}
else
{
System.out.println("Starts with other letters");
}
}else{
System.out.println("Please enter a valid input");
}
} else {
System.out.println("Error : Input string is null.");
}
}

public void endsWithLe(String character,String end){
if(character != null){
if(character.length() >= end.length()){
String result=character.substring(character.length()- end.length(),character.length());
if(result.equals(end))
{
System.out.println("Ends with "+end);
}
else
{
System.out.println("Ends with other letters");
}
}else{
System.out.println("Please enter a valid input");
}
} else {
System.out.println("Error : Input string is null.");
}
}

public void lowercaseToUppercase(String character){
if(character != null){
String result=character.toUpperCase();
System.out.println("Convert all strings to uppercase :" +result);
} else {
System.out.println("Error : Input string is null.");
}
}

public void uppercaseToLowercase(String character){
if(character != null){
String result=character.toLowerCase();
System.out.println("Convert all strings to lowercase :"+result);
} else {
System.out.println("Error : Input string is null.");
}
}

public void reverseString(String character){
if(character != null){
String reverse = " ";
for(int i = 0; i < character.length(); i++)
{
reverse = character.charAt(i) + reverse;
}
System.out.println("Reversed string :"+reverse);
} else {
System.out.println("Error : Input string is null.");
}
}


public void acceptMultipleStrings(String[] character,Scanner scanner){
if (scanner == null) {
System.out.println("Scanner object is null.");
}else{
for (int i = 0; i <character.length; i++)
{
character[i] = scanner.nextLine();
} 
System.out.println("You have entered: ");  
for(String str: character)  
 {  
System.out.println(str);  
}
}}

public void concatenateIndividualStrings(int input,Scanner scanner){
if (scanner == null) {
System.out.println("Scanner object is null.");
}else{
String print1="";
for (int i = 0; i <input; i++)   
{  
print1=print1.concat(scanner.nextLine());
} 
System.out.println("concatenate strings :" +print1);
}}


public void stringToArray(String character){
if(character != null){
String[] words = character.split("\\s+");
System.out.print("Enclose each string :");
System.out.print("{");
for (int i = 0; i < words.length; i++) {
if (i > 0) {
System.out.print(",");}
System.out.print("\"" + words[i] + "\"");}
System.out.println("}");
} else {
System.out.println("Error : Input string is null.");
}
}

public void mergeStrings(int input,Scanner scanner,String symbol){
if (scanner == null) {
System.out.println("Scanner object is null.");
}else{
String print="";
for (int i = 0; i <input; i++)   
{  
System.out.print("string "+ (i+1) +" : " );
if(i==0){
print=print+ scanner.nextLine();
}
else
{
print=print+symbol+ scanner.nextLine();
}
} 
System.out.println(print);
}}

public void checkStringEquality(String input, String check){
if(input != null){
System.out.println(input.equals(check));
}
else {
System.out.println("Error : Input string is null.");
}
}


public void checkStringEqualityIgnoreCase(String character, String IgnoreCase){
if(character != null){
System.out.println(character.equalsIgnoreCase(IgnoreCase));
} else {
System.out.println("Error : Input string is null.");
}
}

public void trimString(String character){
if(character != null){
System.out.println(character.trim());
} else {
System.out.println("Error : Input string is null.");
}
}
}
