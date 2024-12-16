import java.util.*;
import inheritance.Car;
import inheritance.Swift;
import inheritance.Scross;
import inheritance.Xuv;
import inheritance.BirdAbstract;
import inheritance.ParrotMod; 
import inheritance.Duck;

public class Runner {
public static void main(String[] args) {
try{
Scanner scanner = new Scanner(System.in);

try{
//task2
System.out.print("\nFor the swift car enter number of seats: ");
int seats = scanner.nextInt();scanner.nextLine(); 
System.out.print("For the swift car enter number of airbags: ");
int airbags = scanner.nextInt();scanner.nextLine(); 
System.out.print("For the swift car enter model: ");
String model = scanner.nextLine();
System.out.print("For the swift car enter color: ");
String color = scanner.nextLine();
Swift swiftCar = new Swift();
swiftCar.setSeats(seats);
swiftCar.setAirbags(airbags);
swiftCar.setModel(model);
swiftCar.setColor(color);
System.out.println("\nSeats: " + swiftCar .getSeats());
System.out.println("Airbags: " + swiftCar .getAirbags());
System.out.println("Model: " + swiftCar .getModel());
System.out.println("Color: " + swiftCar .getColor());
}catch (Exception e) {
System.out.println(e.getMessage());scanner.nextLine();
}

try{
System.out.print("\nFor the scross car enter year of make: ");
int scrossYearOfMake = scanner.nextInt();scanner.nextLine(); 
System.out.print("For the scross car enter engine number: ");
String scrossEngineNumber = scanner.nextLine();
System.out.print("For the scross car enter type of car (Sedan, Hatchback, SUV): ");
String scrossType = scanner.nextLine();
System.out.print("For the scross car enter number of seats: ");
int scrossSeats = scanner.nextInt();scanner.nextLine(); 
System.out.print("For the scross car enter number of airbags: ");
int scrossAirbags = scanner.nextInt();scanner.nextLine(); 
System.out.print("For the scross car enter model: ");
String scrossModel = scanner.nextLine();
System.out.print("For the scross car enter color: ");
String scrossColor = scanner.nextLine();
Scross scrossCar = new Scross();
scrossCar.setYearOfMake( scrossYearOfMake);
scrossCar.setEngineNumber(scrossEngineNumber);
scrossCar.setType(scrossType);
scrossCar.setSeats(scrossSeats);
scrossCar.setAirbags(scrossAirbags);
scrossCar.setModel(scrossModel);
scrossCar.setColor(scrossColor);
System.out.println("\nYear of Make: " + scrossCar.getYearOfMake());
System.out.println("Engine Number: " + scrossCar.getEngineNumber());
System.out.println("Engine Number: " + scrossCar.getType());
System.out.println("Seats: " + scrossCar .getSeats());
System.out.println("Airbags: " + scrossCar .getAirbags());
System.out.println("Model: " + scrossCar .getModel());
System.out.println("Color: " + scrossCar .getColor());
}catch (Exception e) {
System.out.println(e.getMessage());scanner.nextLine();
}

//task 4,5
Swift swiftCars = new Swift();
getCar(swiftCars);
Scross scrossCars = new Scross();
getCar(scrossCars);
Xuv xuvCars = new Xuv();
getCar(xuvCars);

//task 6
Swift swiftObject = new Swift();
swiftObj(swiftObject);
Car swiftAssign = new Swift();
swiftObj((Swift)swiftAssign);
Scross scrossObject = new Scross();
scrossObj(scrossObject);
Car scrossAssign = new Scross();
scrossObj((Scross)scrossAssign);
Xuv xuvObject = new Xuv();
xuvObj(xuvObject);
Car xuvAssign = new Xuv();
xuvObj((Xuv)xuvAssign);

//task7
Scross scrossOutput = new Scross();
scrossOutput.maintenance();
Car carOutput = new Scross();
carOutput.maintenance(); 
Car car = new Car();
car.maintenance();
Swift swift = new Swift();
swift.maintenance();

//task 8
Xuv xuvCons = new Xuv();

//XUV doesnt have overloaded Cons calling Car overloaded constructor
Car xuvConst = new Car( "custom constructor");

//task 9
//BirdAbstract bird = new BirdAbstract();
 ParrotMod parrot = new  ParrotMod();
 parrot.fly();
 parrot.speak();

//task 10 
Duck duck = new Duck();
duck.fly();
duck.speak();
}
finally{
scanner.close();
}
}
//task 4, 5
public static void getCar(Car car){
if(car instanceof Swift){
System.out.println("\nHatch");
}
if(car instanceof Scross){
System.out.println("Sedan");
}if(car instanceof Xuv){
System.out.println("SUV");
}
}

//task 6
public static void swiftObj(Swift swift){
System.out.println("Calling Swift Object");
}
public static void scrossObj(Scross scross){
System.out.println("Calling SCross Object");
}
public static void xuvObj(Xuv xuv){
System.out.println("Calling XUV Object");
}
}
