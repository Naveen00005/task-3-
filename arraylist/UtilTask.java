package arrayprograms;
import java.util.ArrayList;
import java.util.List;


public class UtilTask{

public static void validateNullString(Object input)throws CustomExceptions {
  if (input == null) {
   throw new CustomExceptions("Input cannot be null.");
  }
}

public static <T> int findSize(List<T> arrayList)throws CustomExceptions{
validateNullString(arrayList);
return arrayList.size();
}

public static <T> List<T> createArrayList(){
List<T> array = new ArrayList<>();
return array;
}

}
