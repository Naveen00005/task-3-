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

public void penultimate(int occurrence,String input){
try {
if(input.length() >= occurrence){
int abc=input.length()-occurrence;
System.out.println("from the given position its contain :"+input.charAt(abc));
}
else{
System.out.println("Not able to find penultimate");
}
} catch (Exception e) {
System.out.println(e.getMessage());
}
}

public void numberOfOccurrences(String input,char character){
try{
int count=0;
for(int i=0;i<input.length();i++)
{
if(input.charAt(i)==character){
count++;
}
}
System.out.println("Number of occurrences :" +count);
} catch (Exception e) {
System.out.println(e.getMessage());
}
}

public void greatestPosition(String input,char character){
try{
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
{
System.out.println("No match found");
}}catch(Exception e) {
System.out.println(e.getMessage());
}
}

public void lastFiveCharacters(String input,int position){
if(input.length() >= position){
String result=input.substring(input.length()- position,input.length());
System.out.print("The last "+position+" characters :"+result);
}else{
System.out.println("Enter a valid input");
}
}

public void firstThreeCharacters(String input,int position) {
if (input.length() >= position) {
String result = input.substring(0, position);
System.out.println("First " +position+" characters: " + result);
} else {
System.out.println("String is too short to find first three characters");
}
}

public void replaceFirstThreeCharacters(String input,String replace){
try{
if(input.length()>=replace.length())
{
 String result=input.substring(0,replace.length());
 System.out.println("Replaced the string for the characters :"+input.replace(result,replace));
}
else{
System.out.println("enter more character");
}
}
catch(Exception e) {
System.out.println(e.getMessage());
}
}

public void startsWith(String input,String start){
try{
if(input.length() >= start.length()){
String result=input.substring(0,start.length());
if(result.equals(start))
{
System.out.println("starts with "+start);
}
else
{
System.out.println(" starts with other letters");
}
}else{
System.out.println("Please enter a valid input");
}
}
catch(Exception e) {
System.out.println(e.getMessage());
}
}

public void endsWithLe(String input,String end){
try{
if(input.length() >= end.length()){
String result=input.substring(input.length()- end.length(),input.length());
if(result.equals(end))
{
System.out.println("ends with "+end);
}
else
{
System.out.println("ends with other letters");
}
}else{
System.out.println("Please enter a valid input");
}
}
catch(Exception e) {
System.out.println(e.getMessage());
}
}

public void lowercaseToUppercase(String input){
try{
String result=input.toUpperCase();
System.out.println("Convert all strings to uppercase :" +result);
}
catch(Exception e) {
System.out.println(e.getMessage());
}
}

public void uppercaseToLowercase(String input){
try{
String result=input.toLowerCase();
System.out.println("Convert all strings to lowercase :"+result);
}
catch(Exception e) {
System.out.println(e.getMessage());
}
}

public void reverseString(String input){
try{
String reverse = " ";
for(int i = 0; i < input.length(); i++)
{
reverse = input.charAt(i) + reverse;
}
System.out.println("reversed string :"+reverse);
}
catch(Exception e) {
System.out.println(e.getMessage());
}
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
try{
String[] words = input.split("\\s+");
System.out.print("Enclose each string :");
System.out.print("{");
for (int i = 0; i < words.length; i++) {
if (i > 0) {
System.out.print(",");}
System.out.print("\"" + words[i] + "\"");}
System.out.println("}");
}
catch(Exception e) {
System.out.println(e.getMessage());
}
}

public void mergeStrings(int input,Scanner scanner,String symbol){
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

}

public void checkStringEquality(String input, String check){
try{
System.out.println(input.equals(check));
}
catch(Exception e) {
System.out.println(e.getMessage());
}
}


public void checkStringEqualityIgnoreCase(String input, String IgnoreCase){
try{
System.out.println(input.equalsIgnoreCase(IgnoreCase));
}
catch(Exception e) {
System.out.println(e.getMessage());
}
}

public void trimString(String input){
try{
System.out.println(input.trim());
}
catch(Exception e) {
System.out.println(e.getMessage());
}
}
}



