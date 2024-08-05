package stringprograms;
import java.util.Scanner;
public class StringTask{

public void nullPointer(String nullcheck)throws CustomExceptions {
        if (nullcheck == null) {
            throw new CustomExceptions("Input string is null.");
        }
}

public int lengthOfString(String slength) throws CustomExceptions {
        nullPointer(slength);
        int totalLength = slength.length();
        return totalLength;
}

public char[] convertItIntoCharacterArray(String character) throws CustomExceptions {
        nullPointer(character);
        return character.toCharArray();
}

public char penultimate(int occurrence, String character) throws CustomExceptions {
	int chara = lengthOfString(character);	
        if (chara < occurrence) {
            throw new CustomExceptions("Not able to find penultimate: occurrence exceeds string length.");
        }
        int index = chara - occurrence;
	char letter = character.charAt(index);
	return letter;
}

public int numberOfOccurrences(String occurrences,char character)throws CustomExceptions{
	int length = lengthOfString(occurrences);
	int count = 0;
	for(int i=0;i<length;i++) {
		if(occurrences.charAt(i) == character){
			count++;
		}
	}
	return count;
}

public int greatestPosition(String greatest,char character) throws CustomExceptions{
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
	int chara = lengthOfString(character);
	if(chara< position) {
		throw new CustomExceptions ("Enter a valid input");
	}

	String result=character.substring(chara- position,chara);
	return result;

}

public String firstThreeCharacters(String character,int position) throws CustomExceptions {
if (lengthOfString(character) >= position) {
String result = character.substring(0, position);
return result;
} else {
throw new CustomExceptions ( "String is too short to find first three characters");
}
}

public String replaceFirstThreeCharacters(String character,String replace)throws CustomExceptions{
int number = lengthOfString(replace);
if(lengthOfString(character)>=number)
{
String result=character.substring(0,number);
return character.replace(result,replace);
}
else{
throw new CustomExceptions ("Enter more character");
}
}

public String startsWith(String character,String start) throws CustomExceptions{
int start_number = lengthOfString(start);
if(lengthOfString(character) >= start_number){
	String result=character.substring(0,start_number);
	if(result.equals(start)) {
		return start;
	}
	else {
	throw new CustomExceptions("Starts with other letters");
	}
}
else{
throw new CustomExceptions("Please enter a valid input");
}
}

public String endsWithLe(String character,String end)throws CustomExceptions{
int chara = lengthOfString(character);
int end_num = lengthOfString(end);
if(chara >= end_num){
String result=character.substring(chara - end_num,chara);
if(result.equals(end)) {
return end;
} else {
throw new CustomExceptions("Ends with other letters");
}
}else{
throw new CustomExceptions("Please enter a valid input");
}
}

public String lowercaseToUppercase(String character)throws CustomExceptions{
nullPointer(character);
String result=character.toUpperCase();
return result;
}

public String uppercaseToLowercase(String character)throws CustomExceptions{
nullPointer(character);
String result=character.toLowerCase();
return result ;
}

public String reverseString(String character)throws CustomExceptions{
String reverse = "";
int length = lengthOfString(character);
for(int i = 0; i < length; i++)
{
reverse = character.charAt(i) + reverse;
}
return reverse;
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
String output = "";
for(String str : character)  
{  
output = output+"\n"+str;
}
return output;
}

public String concatenateIndividualStrings(int input,Scanner scanner)throws CustomExceptions{
if (scanner == null) {
throw new CustomExceptions("Input string is null.");
}
String print1="";
for (int i = 0; i <input; i++)   
{  
print1=print1.concat(scanner.nextLine());
} 
return print1;
}

public String stringToArray(String character)throws CustomExceptions{
nullPointer(character);
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
nullPointer(input);
nullPointer(check);
return input.equals(check);
}

public boolean checkStringEqualityIgnoreCase(String character, String ignoreCase)throws CustomExceptions{
nullPointer(character);
nullPointer(ignoreCase);
return character.equalsIgnoreCase(ignoreCase);
}

public String trimString(String character)throws CustomExceptions{
nullPointer(character);
return character.trim();
}
}
