package stringprograms;
public class StringTask{

public void validateNullString(Object input)throws CustomExceptions {
        if (input == null) {
            throw new CustomExceptions("Input cannot be null.");
        }
}

public int lengthOfString(String lengthOfTheWord) throws CustomExceptions {
        validateNullString(lengthOfTheWord);
        return lengthOfTheWord.length();
}

public char[] convertItIntoCharacterArray(String character) throws CustomExceptions {
        validateNullString(character);
        return character.toCharArray();
}

public char stringFromIndex(int occurrence, String character) throws CustomExceptions {
        validateNullString(character);
        int length = lengthOfString(character);
        if (occurrence <= 0 || occurrence > length) {
            return '\0';
        }
        return character.charAt(length - occurrence);
    }

public int numberOfOccurrences(String occurrences,char character)throws CustomExceptions{
	int length = lengthOfString(occurrences);
	int count = 0;
	for(int i=0; i<length; i++) {
		if(occurrences.charAt(i) == character){
			count++;
		}
	}
	return count;
}


public int greatestPosition(String greatest, char character) throws CustomExceptions {
        validateNullString(greatest);
        int lastIndex = greatest.lastIndexOf(character);
        return lastIndex; 
    }

public String getLastNCharacters(String character,int position) throws CustomExceptions{
	int length = lengthOfString(character);
	if(length< position) {
		throw new CustomExceptions ("Position must be within the length of the string.");
	}
	return character.substring(length - position);
}

public String getFirstNCharacters(String character,int position) throws CustomExceptions {
if (position < 0 || position > lengthOfString(character)) {
throw new CustomExceptions ("Position must be within the length of the string.");
}
return character.substring(0, position);
}

public String replaceCharactersFromBeginning(String character,String replace)throws CustomExceptions{
int number = lengthOfString(replace);
if(lengthOfString(character) < number) {
	throw new CustomExceptions ("Replacement string is longer than the original string.");
}
	String result=character.substring(0,number);
	return character.replace(result,replace);

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
return character.toUpperCase();
}

public String convertToLowerCase(String character)throws CustomExceptions{
validateNullString(character);
return character.toLowerCase();
}

public String reverseString(String stringToReverse) throws CustomExceptions {
	int length = lengthOfString(stringToReverse);
	 char[] charArray = convertItIntoCharacterArray(stringToReverse);
	String reversedString = "";
	for(int i = length-1; i>=0; i--) {
		reversedString += charArray[i];
	}
return reversedString;
}


public String acceptMultipleStrings(String character)throws CustomExceptions{
validateNullString(character);
return character;
}

public String concatenateIndividualStrings(String input)throws CustomExceptions{
validateNullString(input);
String[] concatenate = input.split("\\s");
return String.join("", concatenate);
}

public String[] stringToArray(String character, String symbol)throws CustomExceptions{
validateNullString(character);
String[] words = character.split(symbol);
return words;
}

public String mergeStrings(String[] input,String symbol)throws CustomExceptions{
validateNullString(input);
validateNullString(symbol);
return String.join(symbol, input);
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
