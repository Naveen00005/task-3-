package stringprograms;

public class UtilTask{

public static void validateNullString(Object input)throws CustomExceptions {
        if (input == null) {
            throw new CustomExceptions("Input cannot be null.");
        }
}

public static int lengthOfTheString(String stringLength) throws CustomExceptions {
        validateNullString(stringLength);
        return stringLength.length();
}

public static char[] convertIntoCharacterArray(String character) throws CustomExceptions {
        validateNullString(character);
        return character.toCharArray();
}

public static void validatePosition(int position, int length) throws CustomExceptions {
if (position <= 0 || position > length) {
throw new CustomExceptions("Position must be greater than zero and less than or equal to the length of the string.");
 }
}

}
