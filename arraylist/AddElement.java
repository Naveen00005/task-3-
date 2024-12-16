package arrayprograms;

import java.util.ArrayList;

public interface AddElement<Object> {
 ArrayList<Object> addItem(ArrayList<Object> array, Object value);
}

class AddString implements AddElement<String>{
@Override
public ArrayList<String> addItem(ArrayList<String> array , String str){
array.add(str);
return array;
}
}

class AddInteger implements AddElement<Integer>{
@Override
public ArrayList<Integer> addItem(ArrayList<Integer> array , Integer str){
array.add(str);
return array;
}
}

class AddCustomObject implements AddElement<CustomObject>{
@Override
public ArrayList<CustomObject> addItem(ArrayList<CustomObject> array , CustomObject co){
array.add(co);
return array;
}
}

class AddObjectAndInt implements AddElement<Object>{
@Override
public ArrayList<Object> addItem(ArrayList<Object> array , Object number){
array.add(number);
return array;
}
}

class AddDouble implements AddElement<Double>{
@Override
public ArrayList<Double> addItem(ArrayList<Double> array , Double number){
array.add(number);
return array;
}
}

class AddLong implements AddElement<Long>{
@Override
public ArrayList<Long> addItem(ArrayList<Long> array , Long number){
array.add(number);
return array;
}
}
