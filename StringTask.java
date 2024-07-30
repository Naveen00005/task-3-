package stringprograms;
import java.util.Scanner;
public class StringTask{



public int lengthOfString(String slength) throws CustomExceptions {
        if (slength == null) {
            throw new CustomExceptions("Input array is null.");
        }
        int totalLength = slength.length();
     return totalLength;
}

public char[] convertItIntoCharacterArray(String character) throws CustomExceptions {
        if (character == null) {
            throw new CustomExceptions("Input string is null.");
        }
        return character.toCharArray();
}


public String penultimate(int occurrence, String character) throws CustomExceptions {
       
	if (character == null ) {          
            throw new CustomExceptions("Input string is null.");
        }
	int chara = lengthOfString(character);
	
        if (chara < occurrence) {
            throw new CustomExceptions("Not able to find penultimate: occurrence exceeds string length.");
        }
        int index = chara - occurrence;
        return "From the given position, it contains: " + character.charAt(index);
}

public int numberOfOccurrences(String occurrences,char character)throws CustomExceptions{
	int count = 0;

	if(occurrences == null) {
		throw new CustomExceptions("Input string is null.");
	} 
	int length = lengthOfString(occurrences);
	for(int i=0;i<length;i++) {
		if(occurrences.charAt(i) == character){
			count++;
		}
	}
	return count;
}


public int greatestPosition(String greatest,char character) throws CustomExceptions{
	if(greatest == null) {
		throw new CustomExceptions("Input string is null.");
	}
		
	int maxPosition = 0;
	int length = lengthOfString(greatest);
	for (int i = 0; i < length; i++) {
		if (greatest.charAt(i) == character) {
			maxPosition = i + 1;
		}
	}
	if(maxPosition == 0) {
		throw new CustomExceptions("No match found");	
	} 
	return maxPosition;	
	
}

public String lastFiveCharacters(String character,int position) throws CustomExceptions{
	if(character == null){
		throw new CustomExceptions("Input string is null.");
	}
	int chara = lengthOfString(character);
	if(chara< position) {
		throw new CustomExceptions ("Enter a valid input");
	}

	String result=character.substring(chara- position,chara);
	return "The last "+position+" Characters "+ result;

}

public String firstThreeCharacters(String character,int position) throws CustomExceptions {
if(character == null){
throw new CustomExceptions("Input string is null.");
}
if (lengthOfString(character) >= position) {
String result = character.substring(0, position);
return "From the first "+position+" character :"+result;
} else {
throw new CustomExceptions ( "String is too short to find first three characters");
}
}

public String replaceFirstThreeCharacters(String character,String replace)throws CustomExceptions{
if(character == null){
throw new CustomExceptions("Input string is null.");
}
int number = lengthOfString(replace);
if(lengthOfString(character)>=number)
{
String result=character.substring(0,number);
return "Replaced the string for the characters :"+character.replace(result,replace);
}
else{
throw new CustomExceptions ("Enter more character");
}
}

public String startsWith(String character,String start) throws CustomExceptions{
if(character == null){
throw new CustomExceptions("Input string is null.");
}
String output;
int start_number = lengthOfString(start);
if(lengthOfString(character) >= start_number){
	String result=character.substring(0,start_number);
	if(result.equals(start)) {
		output = "Starts with "+start;
	}
	else {
		output = "Starts with other letters";
	}
}
else{
throw new CustomExceptions("Please enter a valid input");
}
return output;
}

public String endsWithLe(String character,String end)throws CustomExceptions{
if(character == null){
throw new CustomExceptions("Input string is null.");
}
String output;
int chara = lengthOfString(character);
int end_num = lengthOfString(end);
if(chara >= end_num){
String result=character.substring(chara - end_num,chara);
if(result.equals(end)) {
output = "Ends with "+end;
} else {
output = "Ends with other letters";
}
}else{
throw new CustomExceptions("Please enter a valid input");
}
return output;
}

public String lowercaseToUppercase(String character)throws CustomExceptions{
if(character == null){
throw new CustomExceptions("Input string is null.");
}
String result=character.toUpperCase();
return "Convert all strings to uppercase :" +result;
}

public String uppercaseToLowercase(String character)throws CustomExceptions{
if(character == null){
throw new CustomExceptions("Input string is null.");
}
String result=character.toLowerCase();
return "Convert all strings to lowercase :"+result ;
}

public String reverseString(String character)throws CustomExceptions{
if(character == null){
throw new CustomExceptions("Input string is null.");
}
String reverse = "";
int length = lengthOfString(character);
for(int i = 0; i < length; i++)
{
reverse = character.charAt(i) + reverse;
}
return "Reversed string :"+reverse;
}

public String acceptMultipleStrings(String[] character,Scanner scanner)throws CustomExceptions{
if (scanner == null){ 
throw new CustomExceptions("Input string is null.");
}
int length = character.length;
for (int i = 0; i <length; i++)
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


public String concatenateIndividualStrings(int input,Scanner scanner)throws CustomExceptions{
if (scanner == null) {
throw new CustomExceptions("Input string is null.");
}else{
String print1="";
for (int i = 0; i <input; i++)   
{  
print1=print1.concat(scanner.nextLine());
} 
return "concatenate strings :" +print1;
}}


public String stringToArray(String character)throws CustomExceptions{
if(character == null){
throw new CustomExceptions("Input string is null.");
}
String[] words = character.split("\\s+");
int length = words.length;
String words_print= "Enclose each string : {";
for (int i = 0; i <length; i++) {
if (i > 0){
words_print= words_print+",";
}
words_print= words_print+ "\"" + words[i] + "\"";
}
words_print= words_print+"}";
return words_print;
}

public String mergeStrings(int input,Scanner scanner,String symbol)throws CustomExceptions{
if (scanner == null) {
throw new CustomExceptions("Input string is null.");
}
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

}

public boolean checkStringEquality(String input, String check)throws CustomExceptions{
if (input == null || check == null) {
throw new CustomExceptions("Input string is null.");
}
return input.equals(check);
}

public boolean checkStringEqualityIgnoreCase(String character, String IgnoreCase)throws CustomExceptions{
if (character == null || IgnoreCase == null) {
throw new CustomExceptions("Input string is null.");
}
return character.equalsIgnoreCase(IgnoreCase);
}

public String trimString(String character)throws CustomExceptions{
if (character == null) {
throw new CustomExceptions("Input string is null.");
}
return character.trim();

}
}
