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

public static boolean checkKeyExists(Map<String, String> map, String key)  throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
return map.containsKey(key);
}

public static boolean checkValueExists(Map<String, String> map, String value)   throws CustomExceptions{
UtilTask.validateNullString(map);
UtilTask.validateNullString(value);
return map.containsValue(value);
}

public static String getValueByKey(Map<String, String> map, String key)  throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
if (checkKeyExists(map, key)) {
return "The value for the key \"" + key + "\" is: " + map.get(key);
 } else {
 throw new CustomExceptions ("The key \"" + key + "\" does not exist in the HashMap.");
}
}

public static String getDefaultValue (Map<String, String> map, String key, String defaultValue) throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
UtilTask.validateNullString(defaultValue);
return map.getOrDefault(key, defaultValue);
}

public static String removeKey(Map<String, String> map, String key) throws CustomExceptions {
if (checkKeyExists(map,key)) {
map.remove(key);
return "Key \"" + key + "\" removed successfully." ;
} else {
 throw new CustomExceptions ("The key \"" + key + "\" does not exist in the HashMap.");
}
}

public static Map<String, String> removeKeyIfValueMatches(Map<String, String> map, String key, String value) throws CustomExceptions {
UtilTask.validateNullString(map);
UtilTask.validateNullString(key);
UtilTask.validateNullString(value); 
map.remove(key, value);
return map;
}

public static String replaceValue(Map<String, String> map, String key, String newValue) throws CustomExceptions {
UtilTask.validateNullString(newValue);
if (checkKeyExists(map,key)) {
map.replace(key, newValue);
return "Value for key \"" + key + "\" replaced successfully.";
}else {
throw new CustomExceptions ("Key \"" + key + "\" does not exist in the HashMap.");
}
}

public static Map<String, String> replaceValueIfMatch(Map<String, String> map, String key, String oldValue, String newValue) throws CustomExceptions {
UtilTask.validateNullString(oldValue);
UtilTask.validateNullString(newValue);
if (checkKeyExists(map,key) && map.get(key).equals(oldValue)) {
 map.replace(key, newValue);
}
return map;
}

public static Map<String, String> transferMap(Map<String, String> map,Map<String, String> map2)  throws CustomExceptions  {
UtilTask.validateNullString(map);
map.putAll(map2);
return map;
}


public static String iterateAndCollect(Map<String, String> map)  throws CustomExceptions  {
UtilTask.validateNullString(map);
String val ="";
for (Map.Entry<String, String> entry : map.entrySet()) {
  val += "Key: " + entry.getKey() + ", Value: " + entry.getValue()+"\n";
}
return val;
}


public static Map<String, String>  removeAll(Map<String, String> map)  throws CustomExceptions  {
UtilTask.validateNullString(map);
map.clear();
return map;
}

}

