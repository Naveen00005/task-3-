package stringprograms;

public class UtilTask{

public void validateNullString(Object input)throws CustomExceptions {
        if (input == null) {
            throw new CustomExceptions("Input cannot be null.");
        }
}

public int lengthOfTheString(String stringLength) throws CustomExceptions {
        validateNullString(stringLength);
        return stringLength.length();
}

public char[] convertIntoCharacterArray(String character) throws CustomExceptions {
        validateNullString(character);
        return character.toCharArray();
}

public int getLength(StringBuilder sb) {
	validateNullString(sb);
        return sb.length();
}
}
