package arrayprograms;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ArrayListTask {

public static <T> List<T> addElement(List<T> list, T element) throws CustomExceptions {
UtilTask.validateNullString(list);
UtilTask.validateNullString(element);
list.add(element);
return list;
}

public static int findIndex(List<Object> array, String searchString) throws CustomExceptions {
UtilTask.validateNullString(array );
UtilTask.validateNullString(searchString);
 int index = array.indexOf(searchString);
if (index == -1) {
 throw new CustomExceptions("The string \"" + searchString + "\" is not found in the ArrayList.");
}
return index;
}

public static List<Object> iterator (List<Object> array) throws CustomExceptions {
UtilTask.validateNullString( array );
List<Object> stringLists =  UtilTask.createArrayList();
Iterator<Object> it = array.iterator();
while (it.hasNext()) {
stringLists.add(it.next()); 
}
return stringLists;
}

public static String printUsingForLoop(List<Object> array) throws CustomExceptions {
UtilTask.validateNullString(array );
String result = "";
for (Object str : array) {
 result += str;
}
return result ;
}

public static Object getStringAtIndex(List<Object> array, int index) throws CustomExceptions {
UtilTask.validateNullString(array );
if (index < 0 || index >= UtilTask.findSize(array)) {
throw new CustomExceptions("Invalid index. Index should be between 0 and " + ( UtilTask.findSize(array) - 1));
}
return array.get(index);
}

public static int findFirstIndex(List<Object> array, String str)throws CustomExceptions {
UtilTask.validateNullString(array );
UtilTask.validateNullString(str); 
int firstIndex = array.indexOf(str);
if (firstIndex == -1) {
 throw new CustomExceptions("The string \"" + str + "\" is not found in the ArrayList.");
}
return firstIndex;
}
public static int findLastIndex(List<Object> array, String str) throws CustomExceptions {
UtilTask.validateNullString(array );
UtilTask.validateNullString(str);
int lastIndex = array.lastIndexOf(str);
if (lastIndex == -1) {
 throw new CustomExceptions("The string \"" + str + "\" is not found in the ArrayList.");
}
return lastIndex;
}
 
public static List<Object> addStringAtPosition(List<Object> array, String str, int position) throws CustomExceptions {
UtilTask.validateNullString(array );
UtilTask.validateNullString(str);
if (position >= 0 || position <= array.size()) {
 array.add(position, str);
}
return array;
}

public static List<Object> addInSecondArrayList(List<Object> array, int initial, int end) throws CustomExceptions{
UtilTask.validateNullString(array );
List<Object> secondArrayList = UtilTask.createArrayList();
for (int i=initial;i<=end;i++){
secondArrayList.add(array.get(i));
}
return secondArrayList ;
}

public static List<Object> mergeArrayLists(List<Object> first, List<Object> second) throws CustomExceptions {
UtilTask.validateNullString(first );
UtilTask.validateNullString(second );
List<Object> mergedArrayList = new ArrayList<>();
mergedArrayList.addAll(first);
mergedArrayList.addAll(second);
return mergedArrayList ;
}

public static List<Object> removeDecimalAtPosition(List<Object> array, int position) throws CustomExceptions {
UtilTask.validateNullString(array );
array.remove(position);
return array;
}

public static List<Object> removeCommonElements(List<Object> first, List<Object> second) throws CustomExceptions {
UtilTask.validateNullString(first );
UtilTask.validateNullString(second );
first.removeAll(second);
return first;
}

public static List<Object>retainCommonElements(List<Object> first, List<Object> second) throws CustomExceptions  {
UtilTask.validateNullString(first );
UtilTask.validateNullString(second );
first.retainAll(second);
return first;
}

public static List<Object> removeAllLongValues(List<Object> array) throws CustomExceptions {
UtilTask.validateNullString(array );
array.clear();
return array;
}

public static boolean checkStringPresence(List<Object> array, String str) throws CustomExceptions {
UtilTask.validateNullString(array );
UtilTask.validateNullString(str);
return array.contains(str);
}
}
