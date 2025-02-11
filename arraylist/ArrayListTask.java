package arrayprograms;
import java.util.Iterator;
import java.util.List;

public class ArrayListTask {

public <T> List<T> addElement(List<T> list, T element) throws CustomExceptions {
UtilTask.validateNullString(list);
UtilTask.validateNullString(element);
list.add(element);
return list;
}

public int findIndex(List<Object> array, String searchString) throws CustomExceptions {
UtilTask.validateNullString(array );
UtilTask.validateNullString(searchString);
 int index = array.indexOf(searchString);
if (index == -1) {
 throw new CustomExceptions("The string \"" + searchString + "\" is not found in the ArrayList.");
}
return index;
}

public List<Object> iterator (List<Object> array) throws CustomExceptions {
UtilTask.validateNullString( array );
List<Object> stringLists =  UtilTask.createArrayList();
Iterator<Object> it = array.iterator();
while (it.hasNext()) {
stringLists.add(it.next()); 
}
return stringLists;
}

public Object getStringAtIndex(List<Object> array, int index) throws CustomExceptions {
UtilTask.validateNullString(array );
if (index < 0 || index >= UtilTask.findSize(array)) {
throw new CustomExceptions("Invalid index. Index should be between 0 and " + ( UtilTask.findSize(array) - 1));
}
return array.get(index);
}

public int findFirstIndex(List<Object> array, String str)throws CustomExceptions {
UtilTask.validateNullString(array );
UtilTask.validateNullString(str); 
int firstIndex = array.indexOf(str);
if (firstIndex == -1) {
 throw new CustomExceptions("The string \"" + str + "\" is not found in the ArrayList.");
}
return firstIndex;
}
public int findLastIndex(List<Object> array, String str) throws CustomExceptions {
UtilTask.validateNullString(array );
UtilTask.validateNullString(str);
int lastIndex = array.lastIndexOf(str);
if (lastIndex == -1) {
 throw new CustomExceptions("The string \"" + str + "\" is not found in the ArrayList.");
}
return lastIndex;
}
 
public List<Object> addStringAtPosition(List<Object> array, String str, int position) throws CustomExceptions {
UtilTask.validateNullString(array );
UtilTask.validateNullString(str);
if (position >= 0 || position <= array.size()) {
 array.add(position, str);
}
return array;
}

public List<Object> addInSecondArrayList(List<Object> array, int initial, int end) throws CustomExceptions{
UtilTask.validateNullString(array );
List<Object> secondArrayList = UtilTask.createArrayList();
for (int i=initial;i<=end;i++){
secondArrayList.add(array.get(i));
}
return secondArrayList ;
}

public List<Object> mergeArrayLists(List<Object> first, List<Object> second) throws CustomExceptions {
UtilTask.validateNullString(first );
UtilTask.validateNullString(second );
List<Object> mergedArrayList = UtilTask.createArrayList();
mergedArrayList.addAll(first);
mergedArrayList.addAll(second);
return mergedArrayList ;
}

public List<Object> removeDecimalAtPosition(List<Object> array, int position) throws CustomExceptions {
UtilTask.validateNullString(array );
array.remove(position);
return array;
}

public List<Object> removeCommonElements(List<Object> first, List<Object> second) throws CustomExceptions {
UtilTask.validateNullString(first );
UtilTask.validateNullString(second );
first.removeAll(second);
return first;
}

public List<Object>retainCommonElements(List<Object> first, List<Object> second) throws CustomExceptions  {
UtilTask.validateNullString(first );
UtilTask.validateNullString(second );
first.retainAll(second);
return first;
}

public List<Object> removeAllLongValues(List<Object> array) throws CustomExceptions {
UtilTask.validateNullString(array );
array.clear();
return array;
}

public boolean checkStringPresence(List<Object> array, String str) throws CustomExceptions {
UtilTask.validateNullString(array );
UtilTask.validateNullString(str);
return array.contains(str);
}
}
