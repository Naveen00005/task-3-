package stringprograms;
public class StringTask{

public void validateNullString(String input)throws CustomExceptions {
        if (input == null) {
            throw new CustomExceptions("Input string is null.");
        }
}

public void validateNullArray(String[] input)throws CustomExceptions {
        if (input == null) {
            throw new CustomExceptions("Input Array is null.");
        }
}

public int lengthOfString(String slength) throws CustomExceptions {
        validateNullString(slength);
        int totalLength = slength.length();
        return totalLength;
}

public char[] convertItIntoCharacterArray(String character) throws CustomExceptions {
        validateNullString(character);
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

public boolean startsWith(String character,String start) throws CustomExceptions{
validateNullString(character);
validateNullString(start);
return character.startsWith(start);
} 

public boolean endsWith(String character,String end)throws CustomExceptions{
validateNullString(character);
validateNullString(end);
return character.endsWith(end);
}

public String lowercaseToUppercase(String character)throws CustomExceptions{
validateNullString(character);
String result=character.toUpperCase();
return result;
}

public String uppercaseToLowercase(String character)throws CustomExceptions{
validateNullString(character);
String result=character.toLowerCase();
return result ;
}

public String reverseString(String character)throws CustomExceptions{
String reverse = "";
int length = lengthOfString(character);
char[] inputArray = convertItIntoCharacterArray(character);
for(int i = 0 ; i < length ; i++) {
reverse = inputArray[i] + reverse;
}
return reverse;
}

public String acceptMultipleStrings(String[] character)throws CustomExceptions{
validateNullArray(character);
StringBuilder result = new StringBuilder();
for (String str : character) {
result.append("\n"+str);
}
return result.toString();
}

public String concatenateIndividualStrings(String[] input)throws CustomExceptions{
validateNullArray(input);
StringBuilder print = new StringBuilder();
for (String concatenate : input )   
{  
print.append(concatenate);
} 
return print.toString();
}

public String stringToArray(String character)throws CustomExceptions{
validateNullString(character);
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

public String mergeStrings(String[] input,String symbol)throws CustomExceptions{
validateNullArray(input);
validateNullString(symbol);
StringBuilder result = new StringBuilder();
for (int i = 0; i < input.length; i++) {
if (i > 0) {
result.append(symbol);
}
result.append(input[i]);
}
return result.toString();
}

public boolean checkStringEquality(String input, String check)throws CustomExceptions{
validateNullString(input);
validateNullString(check);
return input.equals(check);
}

public boolean checkStringEqualityIgnoreCase(String character, String ignoreCase)throws CustomExceptions{
validateNullString(character);
validateNullString(ignoreCase);
return character.equalsIgnoreCase(ignoreCase);
}

public String trimString(String character)throws CustomExceptions{
validateNullString(character);
return character.trim();
}
}
