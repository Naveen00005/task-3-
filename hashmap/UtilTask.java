package hashmapprograms;
import java.util.HashMap;

public class UtilTask{

public static void validateNullString(Object input)throws CustomExceptions {
        if (input == null) {
            throw new CustomExceptions("Input cannot be null.");
        }
}


public static int findSize(HashMap<String,String> hashmap) throws CustomExceptions  {
validateNullString(hashmap); 
return hashmap.size();
}

public static HashMap<String,String> createHashMap(){
HashMap<String,String> map = new HashMap<>();
return map;
}

}

