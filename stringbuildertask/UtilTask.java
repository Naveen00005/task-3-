package stringBuilder;

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

public static int getLength(StringBuilder sb) throws CustomExceptions{
	validateNullString(sb);
        return sb.length();
}

public static void validateIndices(int initial, int end, int length) throws CustomExceptions {
        if (initial < 0 || end < 0 || initial > end || end > length) {
            throw new CustomExceptions("Invalid indices: initial = " + initial + ", end = " + end);
}
}
}