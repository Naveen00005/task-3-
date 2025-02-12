package hashmapprograms;
import java.util.Map;
public class HashMapTask {

public <K, V> Map<K, V> putMapElement(Map<K, V> map, K key, V value) throws CustomExceptions {
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
UtilTask.validateNullString(map);
UtilTask.validateNullString(value);
return map.containsValue(value);
}

public String getValueByKey(Map<String, String> map, String key)  throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
if (checkKeyExists(map, key)) {
return "The value for the key \"" + key + "\" is: " + map.get(key);
 } else {
 throw new CustomExceptions ("The key \"" + key + "\" does not exist in the HashMap.");
}
}

public String getDefaultValue (Map<String, String> map, String key, String defaultValue) throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
UtilTask.validateNullString(defaultValue);
return map.getOrDefault(key, defaultValue);
}

public String removeKey(Map<String, String> map, String key) throws CustomExceptions {
if (checkKeyExists(map,key)) {
map.remove(key);
return "Key \"" + key + "\" removed successfully." ;
} else {
 throw new CustomExceptions ("The key \"" + key + "\" does not exist in the HashMap.");
}
}

public Map<String, String> removeKeyIfValueMatches(Map<String, String> map, String key, String value) throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
UtilTask.validateNullString(value); 
map.remove(key, value);
return map;
}

public String replaceValue(Map<String, String> map, String key, String newValue) throws CustomExceptions {
UtilTask.validateNullString(newValue);
if (checkKeyExists(map,key)) {
map.replace(key, newValue);
return "Value for key \"" + key + "\" replaced successfully.";
}else {
throw new CustomExceptions ("Key \"" + key + "\" does not exist in the HashMap.");
}
}

public Map<String, String> replaceValueIfMatch(Map<String, String> map, String key, String oldValue, String newValue) throws CustomExceptions {
UtilTask.validateNullString(oldValue);
UtilTask.validateNullString(newValue);
if (checkKeyExists(map,key) && map.get(key).equals(oldValue)) {
 map.replace(key, newValue);
}
return map;
}

public Map<String, String> transferMap(Map<String, String> map,Map<String, String> map2)  throws CustomExceptions  {
UtilTask.validateNullString(map);
map.putAll(map2);
return map;
}


public Map<String, String>  removeAll(Map<String, String> map)  throws CustomExceptions  {
UtilTask.validateNullString(map);
map.clear();
return map;
}

}

