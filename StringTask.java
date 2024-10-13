package stringprograms;
public class StringTask{



public int lengthOfString(String lengthOfTheWord) throws CustomExceptions {
        int length = UtilTask.lengthOfTheString(lengthOfTheWord);
        return length;
}

public char[] convertItIntoCharacterArray(String characters) throws CustomExceptions {
        char[] characterArray = UtilTask.convertIntoCharacterArray(characters);
        return characterArray;
}

public char stringFromIndex(int occurrence, String character) throws CustomExceptions {
       
        int length = UtilTask.lengthOfTheString(character);
	UtilTask.validatePosition(occurrence, length);
        return character.charAt(length - occurrence);
    }

public int numberOfOccurrences(String occurrences,char character)throws CustomExceptions{
	int length = UtilTask.lengthOfTheString(occurrences);
	int count = 0;
	for(int i=0; i<length; i++) {
		if(occurrences.charAt(i) == character){
			count++;
		}
	}
	return count;
}


public int greatestPosition(String greatest, char character) throws CustomExceptions {
        UtilTask.validateNullString(greatest);
        int lastIndex = greatest.lastIndexOf(character);
        return lastIndex; 
    }

public String getLastNCharacters(String character,int position) throws CustomExceptions{
	int length = UtilTask.lengthOfTheString(character);
	UtilTask.validatePosition(position, length);
	
	return character.substring(length - position);
}

public String getFirstNCharacters(String character,int position) throws CustomExceptions {
	int length = UtilTask.lengthOfTheString(character);
        UtilTask.validatePosition(position, length);
return character.substring(0, position);
}

public String replaceCharacters(String character,String replace,int num)throws CustomExceptions{
	UtilTask.validateNullString(character);
	UtilTask.validateNullString(replace);
	    String remaining = character.substring(num);
	    return replace + remaining;

}

public boolean startsWith(String character,String start) throws CustomExceptions{
 UtilTask.validateNullString(character);
 UtilTask.validateNullString(start);
return character.startsWith(start);
} 

public boolean endsWith(String character,String end)throws CustomExceptions{
 UtilTask.validateNullString(character);
 UtilTask.validateNullString(end);
return character.endsWith(end);
}

public String convertToUpperCase(String character)throws CustomExceptions{
 UtilTask.validateNullString(character);
return character.toUpperCase();
}

public String convertToLowerCase(String character)throws CustomExceptions{
 UtilTask.validateNullString(character);
return character.toLowerCase();
}

public String reverseString(String stringToReverse) throws CustomExceptions {
	 char[] charArray =  UtilTask.convertIntoCharacterArray(stringToReverse);
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
 UtilTask.validateNullString(character);
return character;
}

public String concatenateIndividualStrings(String input , String concatSymbol, String conSymbol )throws CustomExceptions{
 UtilTask.validateNullString(input);
String[] concatenate = input.split(concatSymbol);
return String.join(conSymbol , concatenate);
}

public String[] stringToArray(String character, String symbol)throws CustomExceptions{
 UtilTask.validateNullString(character);
String[] words = character.split(symbol);
return words;
}

public String mergeStrings(String[] input,String symbol)throws CustomExceptions{
 UtilTask.validateNullString(input);
 UtilTask.validateNullString(symbol);
return String.join(symbol, input);
}

public boolean checkStringEquality(String input, String check)throws CustomExceptions{
 UtilTask.validateNullString(input);
 UtilTask.validateNullString(check);
return input.equals(check);
}

public boolean checkStringEqualityIgnoreCase(String character, String ignoreCase)throws CustomExceptions{
 UtilTask.validateNullString(character);
 UtilTask.validateNullString(ignoreCase);
return character.equalsIgnoreCase(ignoreCase);
}

public String trimString(String character)throws CustomExceptions{
UtilTask.validateNullString(character);
return character.trim();
}
}
