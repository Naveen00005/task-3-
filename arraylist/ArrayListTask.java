package arrayprograms;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTask {

public List<Object> addString (List<Object> array , Object str) throws CustomExceptions {
UtilTask.validateNullString(array );
UtilTask.validateNullString(str);
array.add(str);
return array;
}

public List<CustomObject> customObjectAdd (List<CustomObject> array ,  CustomObject customAdd) throws CustomExceptions {
UtilTask.validateNullString(array );
UtilTask.validateNullString(customAdd);
array.add(customAdd);
return array;
}

public int findIndex(List<Object> array, String searchString) throws CustomExceptions {
UtilTask.validateNullString(array );
UtilTask.validateNullString(searchString);
return array.indexOf(searchString);
}

public String iterator (Iterator<Object> array) throws CustomExceptions {
UtilTask.validateNullString(array );
String it = "";
while(array.hasNext()) {
it += array.next()+"\n";
}
return it;
}
public String printUsingForLoop(List<Object> array) throws CustomExceptions {
UtilTask.validateNullString(array );
String result = "";
for (Object str : array) {
result += str +"\n";
}
return result ;
}

public Object getStringAtIndex(List<Object> array, int index) throws CustomExceptions {
UtilTask.validateNullString(array );
return array.get(index);
}

public int findFirstIndex(List<Object> array, String str)throws CustomExceptions {
UtilTask.validateNullString(array );
UtilTask.validateNullString(str); 
return array.indexOf(str);
}
public int findLastIndex(List<Object> array, String str) throws CustomExceptions {
UtilTask.validateNullString(array );
UtilTask.validateNullString(str);
return array.lastIndexOf(str);
}
 
public List<Object> addStringAtPosition(List<Object> array, String str, int position) throws CustomExceptions {
UtilTask.validateNullString(array );
UtilTask.validateNullString(str);
if (position >= 0 || position <= array.size()) {
 array.add(position, str);
}
return array;
}

public List<Object> createArrayList(List<Object> array, int initial, int end) throws CustomExceptions{
UtilTask.validateNullString(array );
List<Object> secondArrayList = new ArrayList<>();
for (int i=initial;i<=end;i++){
secondArrayList.add(array.get(i));
}
return secondArrayList ;
}

public List<Object> mergeArrayLists(List<Object> first, List<Object> second) throws CustomExceptions {
UtilTask.validateNullString(first );
UtilTask.validateNullString(second );
List<Object> mergedArrayList = new ArrayList<>();
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
