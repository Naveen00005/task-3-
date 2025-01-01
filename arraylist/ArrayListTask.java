package arrayprograms;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTask {

public List<String> addString (List<String> array , String str){
array.add(str);
return array;
}

public List<Integer> addIntegers (List<Integer> array , int number){
array.add(number);
return array;
}

public List<CustomObject> customObjectAdd (List<CustomObject> array , String name , int age){
array.add(new CustomObject(name, age));
return array;
}

public List<Object> addIntStrCus(List<Object> dynamicList, int num) {
dynamicList.add(num);
return dynamicList;
}
public List<Object> addIntStrCus(List<Object> dynamicList, String strVal) {
dynamicList.add(strVal);
return dynamicList;
}
public List<Object> customObjectAdd5 (List<Object> array , String name , int age){
array.add(new CustomObject(name, age));
return array;
}

public int findIndex(List<String> array, String searchString) {
return array.indexOf(searchString);
}

public String iterator (Iterator<String> array){
String it = "";
while(array.hasNext()) {
it += array.next()+"\n";
}
return it;
}
public String printUsingForLoop(List<String> array) {
String result = "";
for (String str : array) {
result += str +"\n";
}
return result ;
}

public String getStringAtIndex(List<String> array, int index) {
return array.get(index);
}

public int findFirstIndex(List<String> array, String str) {
 return array.indexOf(str);
}
public int findLastIndex(List<String> array, String str) {
return array.lastIndexOf(str);
}
 
public List<String> addStringAtPosition(List<String> array, String str, int position) {
if (position >= 0 || position <= array.size()) {
 array.add(position, str);
}
return array;
}

public List<String> createArrayList(List<String> array, int initial, int end){
List<String> secondArrayList = new ArrayList<>();
for (int i=initial;i<=end;i++){
secondArrayList.add(array.get(i));
}
return secondArrayList ;
}


public List<String> mergeArrayLists(List<String> first, List<String> second){
List<String> mergedArrayList = new ArrayList<>();
mergedArrayList.addAll(first);
mergedArrayList.addAll(second);
return mergedArrayList ;
}

public List<Double> addDecimal(List<Double> array, double value) {
array.add(value); 
return array;
}
public List<Double> removeDecimalAtPosition(List<Double> array, int position) {
array.remove(position);
return array;
}

public List<String> removeCommonElements(List<String> first, List<String> second) {
first.removeAll(second);
return first;
}

public List<String>retainCommonElements(List<String> first, List<String> second) {
first.retainAll(second);
return first;
}

public List<Long> addLong(List<Long> array, long value) {
array.add(value);
return array;
}
public List<Long> removeAllLongValues(List<Long> array) {
array.clear();
return array;
}

public boolean checkStringPresence(List<String> array, String str) {
return array.contains(str);
}
}
