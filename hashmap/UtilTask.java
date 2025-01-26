package hashmapprograms;
import java.util.HashMap;
import java.util.Map;

public class UtilTask{

public static void validateNullString(Object input)throws CustomExceptions {
        if (input == null) {
            throw new CustomExceptions("Input cannot be null.");
        }
}

public static <K,V> int findSize(Map<K,V> hashmap) throws CustomExceptions  {
validateNullString(hashmap); 
return hashmap.size();
}

public static <K,V> Map<K,V> createHashMap(){
Map<K,V> map = new HashMap<>();
return map;
}

}
