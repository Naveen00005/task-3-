package inheritance;

public class Car{

private int yearOfMake;
private String engineNumber;
private String type;

public Car(){
}
public Car(String input){
System.out.println(input);
}


public int getYearOfMake() {
return yearOfMake;
}
public void setYearOfMake(int year){

yearOfMake= year;
}

public String getEngineNumber() {
return engineNumber;
}
public void setEngineNumber(String number){
engineNumber=number;
}

public String getType() {
return type;
}
public void setType(String t) {
type= t;
}

public void maintenance() {
System.out.println("Car under maintenance");
}

}
