package stringprograms;
import java.util.Scanner;
public class StringTask{

public void lengthOfString(String[] args){
for(String a : args)
{
  int length = a.length();
  System.out.println("Length of the string: " + length);
}
}
public void convertItIntoCharacterArray(String input){
char[] character = input.toCharArray();
System.out.println("Convert it into character Array");
for (char characterarray:character){
System.out.println(characterarray);
}
}
public void penultimate(String input){
if(input.length() >1){
int abc=input.length()-2;
System.out.println("Penultimate = "+input.charAt(abc));
}
else{
System.out.println("Not able to find penultimate");
}
}
public void numberOfOccurrences(String input,char character){
int count=0;
for(int i=0;i<input.length();i++)
{
 if(input.charAt(i)==character){
 count++;
 }
}
 System.out.println("Number of occurrences :" +count);
}
public void greatestPosition(String input,char character){
int maxPosition = 0;
for (int i = 0; i < input.length(); i++) {
if (input.charAt(i) == character) {
maxPosition=i+1;
}
}
if(maxPosition>0)
{
System.out.println("The greatest position is "+maxPosition);
}
else
{System.out.println("No match found");
}
}

public void lastFiveCharacters(String input){
if(input.length() > 5){
String result=input.substring(input.length()- 5,input.length());
System.out.print("The last five characters :"+result);
}else{
System.out.println("Enter a valid input");
}
}

public void firstThreeCharacters(String input) {
if (input.length() >= 3) {
String result = input.substring(0, 3);
System.out.println("First three characters: " + result);
} else {
System.out.println("String is too short to find first three characters");
}
}
public void replaceFirstThreeCharacters(String input){
if(input.length()>3)
{
 String result=input.substring(0,3);
 System.out.println("Replaced \"XYZ\" for first three characters :"+input.replace(result,"xyz"));
}
else{
System.out.println("enter more character");
}
}
public void startsWithEnt(String input){
if(input.length() > 2){
String result=input.substring(0,3);
if(result.equals("ent"))
{
System.out.println("starts with ent");
}
else
{
System.out.println(" starts with other letters");
}
}else{
System.out.println("Please enter a valid input");
}
}
public void endsWithLe(String input){
if(input.length() > 1){
String result=input.substring(input.length()- 2,input.length());
if(result.equals("le"))
{
System.out.println("ends with le");
}
else
{
System.out.println("ends with other letters");
}
}else{
System.out.println("Please enter a valid input");
}
}
public void lowercaseToUppercase(String input){
String result=input.toUpperCase();
System.out.println("Convert all strings to uppercase :" +result);
}
public void uppercaseToLowercase(String input){
String result=input.toLowerCase();
System.out.println("Convert all strings to lowercase :"+result);
}
public void reverseString(String input){
String reverse = " ";
for(int i = 0; i < input.length(); i++)
{
reverse = input.charAt(i) + reverse;
}
System.out.println("reversed string :"+reverse);
}


public void acceptMultipleStrings(String[] input,Scanner scanner){
for (int i = 0; i <input.length; i++)
{
input[i] = scanner.nextLine();
} 
System.out.println("You have entered: ");  
for(String str: input)  
 {  
System.out.println(str);  
}
}

public void concatenateIndividualStrings(int input,Scanner scanner){
String print1="";
for (int i = 0; i <input; i++)   
{  
print1=print1.concat(scanner.nextLine());
} 
System.out.println("concatenate strings :" +print1);
}



public void stringToArray(String input){
String[] words = input.split("\\s+");
System.out.print("Enclose each string :");
System.out.print("{");
for (int i = 0; i < words.length; i++) {
if (i > 0) {
System.out.print(",");}
System.out.print("\"" + words[i] + "\"");}
System.out.println("}");}


public void mergeStrings(int input,Scanner scanner){
String print="";
 for (int i = 0; i <input; i++)   
{  
System.out.print("string "+ (i+1) +" : " );
if(i==0){
print=print+ scanner.nextLine();
}
else
{
print=print+"-"+ scanner.nextLine();
}
} 
System.out.println(print);

}


public void checkStringEquality(String input, String input1){
System.out.println(input.equals(input1));
}
public void checkStringEqualityIgnoreCase(String input, String input1){
System.out.println(input.equalsIgnoreCase(input1));
}
public void trimString(String input){
System.out.println(input.trim());
}
}



