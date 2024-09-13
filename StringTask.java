import stringprograms.UtilTask;
import stringprograms.CustomExceptions;
public class StringTask{
UtilTask utilObj = new UtilTask();


public int lengthOfString(String lengthOfTheWord) throws CustomExceptions {
        int length = utilObj.lengthOfTheString(lengthOfTheWord);
        return length;
}

public char[] convertItIntoCharacterArray(String characters) throws CustomExceptions {
        char[] characterArray = utilObj.convertIntoCharacterArray(characters);
        return characterArray;
}

public char stringFromIndex(int occurrence, String character) throws CustomExceptions {
       
        int length = utilObj.lengthOfTheString(character);
        if (occurrence <= 0 || occurrence > length) {
            throw new CustomExceptions ("The given occurrence position greater than the length");
        }
        return character.charAt(length - occurrence);
    }

public int numberOfOccurrences(String occurrences,char character)throws CustomExceptions{
	int length = utilObj.lengthOfTheString(occurrences);
	int count = 0;
	for(int i=0; i<length; i++) {
		if(occurrences.charAt(i) == character){
			count++;
		}
	}
	return count;
}


public int greatestPosition(String greatest, char character) throws CustomExceptions {
        utilObj.validateNullString(greatest);
        int lastIndex = greatest.lastIndexOf(character);
        return lastIndex; 
    }

public String getLastNCharacters(String character,int position) throws CustomExceptions{
	int length = utilObj.lengthOfTheString(character);
	if(length< position) {
		throw new CustomExceptions ("Position must be within the length of the string.");
	}
	return character.substring(length - position);
}

public String getFirstNCharacters(String character,int position) throws CustomExceptions {
if (position < 0 || position > utilObj.lengthOfTheString(character)) {
throw new CustomExceptions ("Position must be within the length of the string.");
}
return character.substring(0, position);
}

public String replaceCharactersFromBeginning(String character,String replace)throws CustomExceptions{
int number = utilObj.lengthOfTheString(replace);
if(utilObj.lengthOfTheString(character) < number) {
	throw new CustomExceptions ("Replacement string is longer than the original string.");
}
	String result=character.substring(0,number);
	return character.replace(result,replace);

}

public boolean startsWith(String character,String start) throws CustomExceptions{
utilObj.validateNullString(character);
utilObj.validateNullString(start);
return character.startsWith(start);
} 

public boolean endsWith(String character,String end)throws CustomExceptions{
utilObj.validateNullString(character);
utilObj.validateNullString(end);
return character.endsWith(end);
}

public String convertToUpperCase(String character)throws CustomExceptions{
utilObj.validateNullString(character);
return character.toUpperCase();
}

public String convertToLowerCase(String character)throws CustomExceptions{
utilObj.validateNullString(character);
return character.toLowerCase();
}

public String reverseString(String stringToReverse) throws CustomExceptions {
	 char[] charArray = utilObj.convertIntoCharacterArray(stringToReverse);
	int start = 0;
	int end = charArray.length - 1;  
        while (start < end) {  
            char temp = charArray[start];
            charArray[start++] = charArray[end];
            charArray[end--] = temp;
        }  
        return new String(charArray);
}


public String acceptMultipleStrings(String character)throws CustomExceptions{
utilObj.validateNullString(character);
return character;
}

public String concatenateIndividualStrings(String input , String concatSymbol)throws CustomExceptions{
utilObj.validateNullString(input);
String[] concatenate = input.split(concatSymbol);
return String.join("", concatenate);
}

public String[] stringToArray(String character, String symbol)throws CustomExceptions{
utilObj.validateNullString(character);
String[] words = character.split(symbol);
return words;
}

public String mergeStrings(String[] input,String symbol)throws CustomExceptions{
utilObj.validateNullString(input);
utilObj.validateNullString(symbol);
return String.join(symbol, input);
}

public boolean checkStringEquality(String input, String check)throws CustomExceptions{
utilObj.validateNullString(input);
utilObj.validateNullString(check);
return input.equals(check);
}

public boolean checkStringEqualityIgnoreCase(String character, String ignoreCase)throws CustomExceptions{
utilObj.validateNullString(character);
utilObj.validateNullString(ignoreCase);
return character.equalsIgnoreCase(ignoreCase);
}

public String trimString(String character)throws CustomExceptions{
utilObj.validateNullString(character);
return character.trim();
}
}
