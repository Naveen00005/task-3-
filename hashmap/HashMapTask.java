package hashmapprograms;
import java.util.Map;
import java.util.HashMap;
public class HashMapTask {

public static HashMap<String,String> addTwoString(HashMap<String,String>  map , String key , String value){
map.put(key,value);
return map;
}

public HashMap<Integer,Integer> addTwoInteger(HashMap<Integer,Integer>  map , Integer key , Integer value){
map.put(key,value);
return map;
}

public HashMap<String,Integer> addStringInteger(HashMap<String,Integer>  map , String key , Integer value){
map.put(key,value);
return map;
}

public HashMap<String, CustomObject> addCustomObject(HashMap<String, CustomObject> map, String key, CustomObject value) {
map.put(key, value);
return map;
}

public HashMap<String, String> addNullKey(HashMap<String, String> map, String value) {
map.put(null, value);
return map;
}

public boolean checkKeyExists(HashMap<String, String> map, String key) {
return map.containsKey(key);
}

public boolean checkValueExists(HashMap<String, String> map, String value) {
return map.containsValue(value);
}

public HashMap<String, String> updateValues(HashMap<String, String> map, String key, String newValue) {
if (map.containsKey(key)) {
 map.put(key, newValue);
}
return map;
}

public String getValueByKey(HashMap<String, String> map, String key) {
return map.get(key);
}

public String getOrDefault(HashMap<String, String> map, String key, String defaultValue) {
return map.getOrDefault(key, defaultValue);
}

public HashMap<String, String> removeKey(HashMap<String, String> map, String key) {
if (map.containsKey(key)) {
 map.remove(key);
}
return map;
}

public HashMap<String, String> removeKeyIfValueMatches(HashMap<String, String> map, String key, String value) {
 map.remove(key, value);
return map;
}

public HashMap<String, String> replaceValue(HashMap<String, String> map, String key, String newValue) {
if (map.containsKey(key)) {
map.replace(key, newValue);
}
return map;
}

public HashMap<String, String> replaceValueIfMatch(HashMap<String, String> map, String key, String oldValue, String newValue) {
if (map.containsKey(key) && map.get(key).equals(oldValue)) {
 map.replace(key, newValue);
}
return map;
}

public HashMap<String, String> transferMap(HashMap<String, String> map,HashMap<String, String> map2) {
map.putAll(map2);
return map;
}


public String iterateAndCollect(HashMap<String, String> map) {
String val ="";
for (Map.Entry<String, String> entry : map.entrySet()) {
  val += "Key: " + entry.getKey() + ", Value: " + entry.getValue()+"\n";
}
return val;
}


public HashMap<String, String>  removeAll(HashMap<String, String> map) {
map.clear();
return map;
}

}

