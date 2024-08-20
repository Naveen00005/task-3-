package stringprograms;
public class StringTask{

public void validateNullString(Object input)throws CustomExceptions {
        if (input == null) {
            throw new CustomExceptions("Input string is null.");
        }
}

public int lengthOfString(String lengthOfTheWord) throws CustomExceptions {
        validateNullString(lengthOfTheWord);
        int totalLength = lengthOfTheWord.length();
        return totalLength;
}

public char[] convertItIntoCharacterArray(String character) throws CustomExceptions {
        validateNullString(character);
        return character.toCharArray();
}

public char stringFromIndex(int occurrence, String character) throws CustomExceptions {
	int chara = lengthOfString(character);	
        if (chara < occurrence) {
            throw new CustomExceptions("Not able to find character: occurrence exceeds string length.");
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
	validateNullString(greatest);
        int lastIndex = greatest.lastIndexOf(character);
        if (lastIndex == -1) {
            throw new CustomExceptions("Character not found in the string.");
        }
        return lastIndex + 1;	
}

public String getLastNCharacters(String character,int position) throws CustomExceptions{
	int chara = lengthOfString(character);
	if(chara< position) {
		throw new CustomExceptions ("Enter a valid input");
	}

	String result=character.substring(chara- position,chara);
	return result;

}

public String getFirstNCharacters(String character,int position) throws CustomExceptions {
if (lengthOfString(character) >= position) {
String result = character.substring(0, position);
return result;
} else {
throw new CustomExceptions ( "String is too short to find the characters from the given position");
}
}

public String replaceCharactersFromBeginning(String character,String replace)throws CustomExceptions{
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

public String convertToUpperCase(String character)throws CustomExceptions{
validateNullString(character);
String result=character.toUpperCase();
return result;
}

public String convertToLowerCase(String character)throws CustomExceptions{
validateNullString(character);
String result=character.toLowerCase();
return result ;
}

public String reverseString(String stringToReverse) throws CustomExceptions {
	int length = lengthOfString(stringToReverse);
	String reversedString = "";
	for(int i = length-1; i>=0; i--) {
		reversedString += String.valueOf(stringToReverse.charAt(i));
	}
return reversedString;
}


public String acceptMultipleStrings(String[] character)throws CustomExceptions{
validateNullString(character);
String result ="";
for (String str : character) {
result=result+("\n"+str);
}
return result;
}

public String concatenateIndividualStrings(String[] input)throws CustomExceptions{
validateNullString(input);
String appendedString = "";
for (String concatenate : input )   
{  
appendedString = appendedString + concatenate;
} 
return appendedString;
}

public String stringToArray(String character, String symbol)throws CustomExceptions{
validateNullString(character);
String[] words = character.split(symbol);
int length = words.length;
String words_print= "Enclose each string : ";
for (int i = 0; i <length; i++) {
if (i > 0){
words_print= words_print+",";
}
words_print= words_print+ "\"" + words[i] + "\"";
}
return words_print;
}

public String mergeStrings(String[] input,String symbol)throws CustomExceptions{
validateNullString(input);
validateNullString(symbol);
int arrayLength = input.length;
String appendedString = "";
for (int i = 0; i < arrayLength; i++) {
	appendedString = appendedString + input[i];
	if(i != (arrayLength -1)) {
		appendedString = appendedString + symbol;
	}
}
return appendedString;
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
