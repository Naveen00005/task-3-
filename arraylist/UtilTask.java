package arrayprograms;
import java.util.ArrayList;
import java.util.List;


public class UtilTask{

public static void validateNullString(Object input)throws CustomExceptions {
  if (input == null) {
   throw new CustomExceptions("Input cannot be null.");
  }
}

public static int findSize(List<?> arrayList)throws CustomExceptions{
validateNullString(arrayList);
return arrayList.size();
}

public static List<Object> createArrayList(){
List<Object> array = new ArrayList<Object>();
return array;
}


}
