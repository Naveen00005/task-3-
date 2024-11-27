package arrayprograms;
import java.util.Iterator;
import java.util.ArrayList;

public class ArrayListTask {

public ArrayList<String> addString (ArrayList<String> array , String str){
array.add(str);
return array;
}

public ArrayList<Integer> addIntegers (ArrayList<Integer> array , int number){
array.add(number);
return array;
}

public ArrayList<CustomObject> customObjectAdd (ArrayList<CustomObject> array , String name , int age){
array.add(new CustomObject(name, age));
return array;
}

public ArrayList<Object> addIntStrCus(ArrayList<Object> dynamicList, int num) {
dynamicList.add(num);
return dynamicList;
}
public ArrayList<Object> addIntStrCus(ArrayList<Object> dynamicList, String strVal) {
dynamicList.add(strVal);
return dynamicList;
}
public ArrayList<Object> customObjectAdd5 (ArrayList<Object> array , String name , int age){
array.add(new CustomObject(name, age));
return array;
}

public int findIndex(ArrayList<String> array, String searchString) {
return array.indexOf(searchString);
}

public String iterator (Iterator<String> array){
String it = "";
while(array.hasNext()) {
it += array.next()+"\n";
}
return it;
}
public String printUsingForLoop(ArrayList<String> array) {
String result = "";
for (String str : array) {
result += str +"\n";
}
return result ;
}

public String getStringAtIndex(ArrayList<String> array, int index) {
return array.get(index);
}

public int findFirstIndex(ArrayList<String> array, String str) {
 return array.indexOf(str);
}
public int findLastIndex(ArrayList<String> array, String str) {
return array.lastIndexOf(str);
}
 
public ArrayList<String> addStringAtPosition(ArrayList<String> array, String str, int position) {
if (position >= 0 || position <= array.size()) {
 array.add(position, str);
}
return array;
}

public ArrayList<String> createArrayList(ArrayList<String> array, int initial, int end){
ArrayList<String> secondArrayList = new ArrayList<>();
for (int i=initial;i<=end;i++){
secondArrayList.add(array.get(i));
}
return secondArrayList ;
}


public ArrayList<String> mergeArrayLists(ArrayList<String> first, ArrayList<String> second){
ArrayList<String> mergedArrayList = new ArrayList<>();
mergedArrayList.addAll(first);
mergedArrayList.addAll(second);
return mergedArrayList ;
}

public ArrayList<Double> addDecimal(ArrayList<Double> array, double value) {
array.add(value); 
return array;
}
public ArrayList<Double> removeDecimalAtPosition(ArrayList<Double> array, int position) {
array.remove(position);
return array;
}

public ArrayList<String> removeCommonElements(ArrayList<String> first, ArrayList<String> second) {
first.removeAll(second);
return first;
}

public ArrayList<String>retainCommonElements(ArrayList<String> first, ArrayList<String> second) {
first.retainAll(second);
return first;
}

public ArrayList<Long> addLong(ArrayList<Long> array, long value) {
array.add(value);
return array;
}
public ArrayList<Long> removeAllLongValues(ArrayList<Long> array) {
array.clear();
return array;
}

public boolean checkStringPresence(ArrayList<String> array, String str) {
return array.contains(str);
}
}