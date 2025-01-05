package hashmapprograms;
import java.util.Map;
import java.util.HashMap;
public class HashMapTask {

public static HashMap<String,String> addTwoString(HashMap<String,String>  map , String key , String value) throws CustomExceptions{
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
UtilTask.validateNullString(value);
AddString str = new AddString();
str.addItem(map,key,value);
return map;
}


public HashMap<Integer,Integer> addTwoInteger(HashMap<Integer,Integer>  map , Integer key , Integer value)  throws CustomExceptions  {
UtilTask.validateNullString(map);
AddInteger inte = new AddInteger();
inte.addItem(map,key,value);
return map;
}

public HashMap<String,Integer> addStringInteger(HashMap<String,Integer>  map , String key , Integer value) throws CustomExceptions{
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
AddIntStr intStr = new AddIntStr();
intStr.addItem(map,key,value);
return map;
}

public HashMap<String, CustomObject> addCustomObject(HashMap<String, CustomObject> map, String key, CustomObject value)  throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
AddStringCustomobject customobj = new AddStringCustomobject();
customobj.addItem(map,key,value);
return map;
}

public HashMap<String, String> addNullKey(HashMap<String, String> map, String value)  throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(value);
AddString str = new AddString();
str.addItem(map,null,value);
return map;
}

public boolean checkKeyExists(HashMap<String, String> map, String key)  throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
return map.containsKey(key);
}

public boolean checkValueExists(HashMap<String, String> map, String value)   throws CustomExceptions{
UtilTask.validateNullString(value);
return map.containsValue(value);
}

public HashMap<String, String> updateValues(HashMap<String, String> map, String key, String newValue)  throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
UtilTask.validateNullString(newValue);
if (map.containsKey(key)) {
 map.put(key, newValue);
}
return map;
}

public String getValueByKey(HashMap<String, String> map, String key)  throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
return map.get(key);
}

public String getOrDefault(HashMap<String, String> map, String key, String defaultValue) throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
UtilTask.validateNullString(defaultValue);
return map.getOrDefault(key, defaultValue);
}

public HashMap<String, String> removeKey(HashMap<String, String> map, String key) throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
if (map.containsKey(key)) {
 map.remove(key);
}
return map;
}

public HashMap<String, String> removeKeyIfValueMatches(HashMap<String, String> map, String key, String value) throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
UtilTask.validateNullString(value); 
map.remove(key, value);
return map;
}

public HashMap<String, String> replaceValue(HashMap<String, String> map, String key, String newValue) throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
UtilTask.validateNullString(newValue);
if (map.containsKey(key)) {
map.replace(key, newValue);
}
return map;
}

public HashMap<String, String> replaceValueIfMatch(HashMap<String, String> map, String key, String oldValue, String newValue) throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
UtilTask.validateNullString(oldValue);
UtilTask.validateNullString(newValue);
if (map.containsKey(key) && map.get(key).equals(oldValue)) {
 map.replace(key, newValue);
}
return map;
}

public HashMap<String, String> transferMap(HashMap<String, String> map,HashMap<String, String> map2)  throws CustomExceptions  {
UtilTask.validateNullString(map);
map.putAll(map2);
return map;
}


public String iterateAndCollect(HashMap<String, String> map)  throws CustomExceptions  {
UtilTask.validateNullString(map);
String val ="";
for (Map.Entry<String, String> entry : map.entrySet()) {
  val += "Key: " + entry.getKey() + ", Value: " + entry.getValue()+"\n";
}
return val;
}


public HashMap<String, String>  removeAll(HashMap<String, String> map)  throws CustomExceptions  {
UtilTask.validateNullString(map);
map.clear();
return map;
}

}

