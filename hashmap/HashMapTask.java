package hashmapprograms;
import java.util.Map;
import java.util.HashMap;
public class HashMapTask {

public static <K, V> Map<K, V> putMapElement(Map<K, V> map, K key, V value) throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
UtilTask.validateNullString(value);
map.put(key, value);
return map;
}
 
public boolean checkKeyExists(Map<String, String> map, String key)  throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
return map.containsKey(key);
}

public boolean checkValueExists(Map<String, String> map, String value)   throws CustomExceptions{
UtilTask.validateNullString(value);
return map.containsValue(value);
}

public Map<String, String> updateValues(Map<String, String> map, String key, String newValue)  throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
UtilTask.validateNullString(newValue);
if (map.containsKey(key)) {
 map.put(key, newValue);
}
return map;
}

public String getValueByKey(Map<String, String> map, String key)  throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
return map.get(key);
}

public String getOrDefault(Map<String, String> map, String key, String defaultValue) throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
UtilTask.validateNullString(defaultValue);
return map.getOrDefault(key, defaultValue);
}

public Map<String, String> removeKey(Map<String, String> map, String key) throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
if (map.containsKey(key)) {
 map.remove(key);
}
return map;
}

public Map<String, String> removeKeyIfValueMatches(Map<String, String> map, String key, String value) throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
UtilTask.validateNullString(value); 
map.remove(key, value);
return map;
}

public Map<String, String> replaceValue(Map<String, String> map, String key, String newValue) throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
UtilTask.validateNullString(newValue);
if (map.containsKey(key)) {
map.replace(key, newValue);
}
return map;
}

public Map<String, String> replaceValueIfMatch(Map<String, String> map, String key, String oldValue, String newValue) throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
UtilTask.validateNullString(oldValue);
UtilTask.validateNullString(newValue);
if (map.containsKey(key) && map.get(key).equals(oldValue)) {
 map.replace(key, newValue);
}
return map;
}

public Map<String, String> transferMap(Map<String, String> map,Map<String, String> map2)  throws CustomExceptions  {
UtilTask.validateNullString(map);
map.putAll(map2);
return map;
}

public String iterateAndCollect(Map<String, String> map)  throws CustomExceptions  {
UtilTask.validateNullString(map);
String val ="";
for (Map.Entry<String, String> entry : map.entrySet()) {
  val += "Key: " + entry.getKey() + ", Value: " + entry.getValue()+"\n";
}
return val;
}

 public Map<String, String>  removeAll(Map<String, String> map)  throws CustomExceptions  {
UtilTask.validateNullString(map);
map.clear();
return map;
}
}

