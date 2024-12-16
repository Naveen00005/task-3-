package stringBuilder;
public class StringBuilderTask{


public StringBuilder createStringBuilder(String initial){
StringBuilder sb = new StringBuilder(initial);
return sb;
}
public StringBuilder appendString(StringBuilder sb,String lengthOfTheWord) throws CustomExceptions {
UtilTask.validateNullString(sb);
UtilTask.validateNullString(lengthOfTheWord);
sb.append(lengthOfTheWord);
return sb;
}

public StringBuilder appendStringWithSymbol(String symbol ,StringBuilder sb,String string) throws CustomExceptions {
appendString(sb, symbol);
appendString(sb ,string);
return sb;
}

public StringBuilder insertInStringBuilder(StringBuilder input , String symbols , String insert ) throws CustomExceptions {
UtilTask.validateNullString(input);
UtilTask.validateNullString(symbols);
UtilTask.validateNullString(insert );
int index = input.indexOf(symbols);
if(index == -1){
throw new CustomExceptions (" invalid  symbol ");
}
input.insert(index, symbols + insert);
return input;
}

public StringBuilder deleteInitialString(StringBuilder input,String symbol) throws CustomExceptions {
UtilTask.validateNullString(input);
UtilTask.validateNullString(symbol);
int index = input.indexOf(symbol);
if(index  == -1){
throw new CustomExceptions ("Enter valid  input ");
}
input.delete(0,index +1);
return input;
}

public StringBuilder replaceTheString(StringBuilder sb , String input,String replace) throws CustomExceptions {
UtilTask.validateNullString(sb);
UtilTask.validateNullString(input);
UtilTask.validateNullString(replace); 
int index = sb.indexOf(input);
if(index  == -1){
throw new CustomExceptions ("Enter existing string to replace ");
}
return sb.replace(index, index + UtilTask.lengthOfTheString(input), replace);
}

public StringBuilder reverseTheString(StringBuilder sb) throws CustomExceptions {
UtilTask.validateNullString(sb);
return sb.reverse();
}

public StringBuilder deleteTheString(StringBuilder sb , int initial , int end) throws CustomExceptions {
UtilTask.validateNullString(sb);
UtilTask.validateIndices(initial, end, UtilTask.getLength(sb));
return sb.delete(initial, end+1);
}

public StringBuilder replacingTheString(StringBuilder sb , int initial , int end ,String replace) throws CustomExceptions {
UtilTask.validateNullString(sb);
UtilTask.validateIndices(initial, end, UtilTask.getLength(sb));
return sb.replace(initial, end+1,replace);
}

public int indexOfFirstSymbol(StringBuilder sb , String symbol) throws CustomExceptions {
UtilTask.validateNullString(sb);
return sb.indexOf(symbol);
}

public int indexOfLastSymbol(StringBuilder sb , String symbol) throws CustomExceptions {
UtilTask.validateNullString(sb);
return sb.lastIndexOf(symbol);
}
}


