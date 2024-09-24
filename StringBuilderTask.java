package stringprograms;
public class StringBuilderTask{
UtilTask utilObj = new UtilTask();

public StringBuilder appendString(StringBuilder sb,String lengthOfTheWord) throws CustomExceptions {
utilObj.validateNullString(sb);
utilObj.validateNullString(lengthOfTheWord);
sb.append(lengthOfTheWord);
return sb;
}

public StringBuilder appendStringWithSymbol(String symbol ,StringBuilder sb,String string) throws CustomExceptions {
appendString(sb, symbol);
appendString(sb ,string);
return sb;
}

public StringBuilder insertInStringBuilder(StringBuilder input , String symbols , String insert ) throws CustomExceptions {
utilObj.validateNullString(input);
utilObj.validateNullString(symbols);
utilObj.validateNullString(insert );
if(input.indexOf(symbols) == -1){
throw new CustomExceptions (" invalid  symbol ");
}
String[] parts = input.toString().split(symbols);
int insertPosition =utilObj.lengthOfTheString(parts[0]);
input.insert(insertPosition, symbols + insert);
return input;
}

public StringBuilder deleteInitialString(StringBuilder input,String symbol) throws CustomExceptions {
utilObj.validateNullString(input);
utilObj.validateNullString(symbol);
if(input.indexOf(symbol) == -1){
throw new CustomExceptions ("Enter valid  input ");
}
String[] part = input.toString().split(symbol);
int deletePosition =utilObj.lengthOfTheString(part[0]);
input.delete(0,deletePosition+1);
return input;
}

public StringBuilder replaceTheString(StringBuilder sb , String input,String replace) throws CustomExceptions {
utilObj.validateNullString(sb);
utilObj.validateNullString(input);
utilObj.validateNullString(replace); 
int index = sb.indexOf(input);
if(index  == -1){
throw new CustomExceptions ("Enter existing string to replace ");
}
return sb.replace(index, index + utilObj.lengthOfTheString(input), replace);
}

public StringBuilder reverseTheString(StringBuilder sb) throws CustomExceptions {
utilObj.validateNullString(sb);
return sb.reverse();
}

public StringBuilder deleteTheString(StringBuilder sb , int initial , int end) throws CustomExceptions {
utilObj.validateNullString(sb);
if (initial < 0 || end < 0 || initial > end || end > utilObj.getLength(sb)) {
throw new CustomExceptions("Invalid indices: initial = " + initial + ", end = " + end +"\n ......Enter to continue......" );
}
return sb.delete(initial, end+1);
}

public StringBuilder replacingTheString(StringBuilder sb , int initial , int end ,String replace) throws CustomExceptions {
utilObj.validateNullString(sb);
if (initial < 0 || end < 0 || initial > end || end > utilObj.getLength(sb)) {
throw new CustomExceptions("Invalid indices: initial = " + initial + ", end = " + end+"\n ......Enter to continue......");
}
return sb.replace(initial, end+1,replace);
}

public int indexOfFirstSymbol(StringBuilder sb , String symbol) throws CustomExceptions {
utilObj.validateNullString(sb);
return sb.indexOf(symbol);
}

public int indexOfLastSymbol(StringBuilder sb , String symbol) throws CustomExceptions {
utilObj.validateNullString(sb);
return sb.lastIndexOf(symbol);
}
}


