package hashmapprograms;

import java.util.HashMap;

public interface PutElement< Object , Object1 > {
 HashMap<Object,Object1> addItem(HashMap<Object,Object1> map, Object key , Object1 value);
}

class AddString implements PutElement<String,String>{
@Override	
public HashMap<String,String> addItem(HashMap<String,String>  map , String key , String value){
map.put(key,value);
return map;
}
}

class AddInteger implements PutElement<Integer,Integer>{
@Override	
public HashMap<Integer,Integer> addItem(HashMap<Integer,Integer>  map , Integer key , Integer value){
map.put(key,value);
return map;
}
}

class AddIntStr implements PutElement<String,Integer>{
@Override	
public HashMap<String,Integer> addItem(HashMap<String,Integer>  map , String key , Integer value){
map.put(key,value);
return map;
}
}

class AddStringCustomobject implements PutElement<String,CustomObject>{
@Override	
public HashMap<String,CustomObject> addItem(HashMap<String,CustomObject>  map , String key , CustomObject value){
map.put(key,value);
return map;
}
}