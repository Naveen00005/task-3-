package stringprograms;
import java.util.Scanner;
public class StringTask{

public int lengthOfString(String[] args) 
{
int length= 0;
for (String a : args)
{
length = a.length();

}return length;
}


public char[] convertItIntoCharacterArray(String character){
if (character != null) {
char[] ccharacter = character.toCharArray();
return ccharacter;
}
else{
return null;
}

} 

public String penultimate(int occurrence,String character){
if(character != null){
if(character.length() >= occurrence){
int index=character.length()-occurrence;
return "From the given position, it contains:" +character.charAt(index);
}else{
return "Not able to find penultimate.";
 }
} else {
return "Error : Input string is null.";
}
}

public int numberOfOccurrences(String occurrences,char character){
int count=0;

if(occurrences != null){
for(int i=0;i<occurrences.length();i++)
{
	if(occurrences.charAt(i)==character){
	count++;
	}
}
return count;
} else{
return -1;
}

}


public int greatestPosition(String greatest,char character){

int maxPosition = 0;
for (int i = 0; i < greatest.length(); i++) {
if (greatest.charAt(i) == character) {
maxPosition=i+1;
}
}
if(maxPosition>0)
{
return maxPosition;
}else{
return -1;
}
}

public String lastFiveCharacters(String character,int position){
if(character != null){
if(character.length() >= position){
String result=character.substring(character.length()- position,character.length());
return "The last Characters "+ result;
}else{
return "Enter a valid input";
}
} else {
return "Error : Input string is null.";
}
}

public String firstThreeCharacters(String character,int position) {
if(character != null){
if (character.length() >= position) {
String result = character.substring(0, position);
return "From the first character :"+result;
} else {
return "String is too short to find first three characters";
}
} else {
return"Error : Input string is null.";
}
}

public String replaceFirstThreeCharacters(String character,String replace){
if(character != null){
if(character.length()>=replace.length())
{
String result=character.substring(0,replace.length());
return "Replaced the string for the characters :"+character.replace(result,replace);
}
else{
return "enter more character";
}
} else {
return "Error : Input string is null.";
}
}

public String startsWith(String character,String start){
if(character != null){
if(character.length() >= start.length()){
String result=character.substring(0,start.length());
if(result.equals(start))
{
return "Starts with "+start;
}
else
{
return "Starts with other letters";
}
}else{
return "Please enter a valid input";
}
} else {
return "Error : Input string is null.";
}
}

public String endsWithLe(String character,String end){
if(character != null){
if(character.length() >= end.length()){
String result=character.substring(character.length()- end.length(),character.length());
if(result.equals(end))
{
return "Ends with "+end;
}
else
{
return "Ends with other letters";
}
}else{
return "Please enter a valid input";
}
} else {
return "Error : Input string is null.";
}
}

public String lowercaseToUppercase(String character){
if(character != null){
String result=character.toUpperCase();
return "Convert all strings to uppercase :" +result;
} else {
return "Error : Input string is null.";
}
}

public String uppercaseToLowercase(String character){
if(character != null){
String result=character.toLowerCase();
return "Convert all strings to lowercase :"+result ;
} else {
return "Error : Input string is null.";
}
}

public String reverseString(String character){
if(character != null){
String reverse = " ";
for(int i = 0; i < character.length(); i++)
{
reverse = character.charAt(i) + reverse;
}
return "Reversed string :"+reverse;
} else {
return "Error : Input string is null.";
}
}

public String acceptMultipleStrings(String[] character,Scanner scanner)
{
if (scanner == null) 
{
return "Scanner object is null.";
}else
{
for (int i = 0; i <character.length; i++)
{
character[i] = scanner.nextLine();
} 
String output = "You have entered: ";
for(String str : character)  
{  
output = output+"\n"+str;
}
return output;
}
}


public String concatenateIndividualStrings(int input,Scanner scanner){
if (scanner == null) {
return "Scanner object is null.";
}else{
String print1="";
for (int i = 0; i <input; i++)   
{  
print1=print1.concat(scanner.nextLine());
} 
return "concatenate strings :" +print1;
}}


public String stringToArray(String character){
if(character != null){
String[] words = character.split("\\s+");
String words_print= "Enclose each string : {";
for (int i = 0; i < words.length; i++) {
if (i > 0)
 {
words_print= words_print+",";
}
words_print= words_print+ "\"" + words[i] + "\"";
}
words_print= words_print+"}";
return words_print;
} else {
return "Error : Input string is null.";
}
}

public String mergeStrings(int input,Scanner scanner,String symbol){
if (scanner == null) {
return "Scanner object is null.";
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
}return print; 
}}

public boolean checkStringEquality(String input, String check){
return input.equals(check);
}

public boolean checkStringEqualityIgnoreCase(String character, String IgnoreCase){
return character.equalsIgnoreCase(IgnoreCase);
}

public String trimString(String character){
if(character != null){
return character.trim();
} else {
return "Error : Input string is null.";
}
}
}
