import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;
import arrayprograms.ArrayListTask;
import arrayprograms.CustomObject;
import arrayprograms.UtilTask;

class ArrayRunner {
static Scanner scanner = new Scanner(System.in);
public static void main(String args[]){
ArrayRunner arrayRunner  = new ArrayRunner();
ArrayListTask runner = new ArrayListTask();
UtilTask utilTask = new UtilTask();
int choice;
try{
do{
System.out.println("\nSelect a operation:");
System.out.println("1. Length of the params in main method");
System.out.println("2. Add String to an ArrayList, print it, and calculate its size");
System.out.println("3. Add integers to an ArrayList, print it, and calculate its size");
System.out.println("4. Add custom objects to an ArrayList, print it, and calculate its size");
System.out.println("5. Create ArrayList with integers, strings, and custom objects");
System.out.println("6. Add Strings, find the index of one, and print the ArrayList and size");
System.out.println("7. Add Strings, Use the iterator method & for loop");
System.out.println("8. Add Strings, retrieve a string at a given index, and print size");
System.out.println("9. Add Strings (with duplicates) and find first/last positions of a duplicate");
System.out.println("10. Add Strings, insert a given String at a user-provided position, and print the ArrayList");
System.out.println("11. Create second ArrayList from sublist of the first");
System.out.println("12. Merge two ArrayLists ");
System.out.println("13. Merge two ArrayLists with second elements ahead");
System.out.println("14. Add and remove decimal values");
System.out.println("15. Remove elements present in second ArrayList");
System.out.println("16. Retain elements present in second ArrayList");
System.out.println("17. Add and remove long values");
System.out.println("18. Check if a String is present in the ArrayList");
System.out.println("0. Exit");
System.out.println("Enter you choice...");

choice = scanner.nextInt();scanner.nextLine();
switch (choice)
{
case 1:
try {
List<String> array = utilTask.createArrayList();
System.out.println("Size of ArrayList: " + utilTask.findSize(array));
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
break;

case 2:
try{
System.out.println("\nEnter the number of strings to add:");
int  numStrings = scanner.nextInt();scanner.nextLine();
List<String> arrayList =utilTask.createArrayList(); 
arrayList = arrayRunner.getString(arrayList, numStrings );
System.out.println("ArrayList contents: " + arrayList);
System.out.println("Size of ArrayList: " + utilTask.findSize(arrayList));
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
break;

case 3:
try{
System.out.println("\nEnter the number of integers to add:");
int numIntegers = scanner.nextInt();
List<Integer> intList = new ArrayList<>();
for (int i = 0; i < numIntegers; i++) {
 System.out.print("Enter Integer" + (i + 1) + "= ");
 int number = scanner.nextInt();
 intList = runner.addIntegers (intList,number);
}
System.out.println("ArrayList contents: " + intList);
System.out.println("Size of ArrayList: " + utilTask.findSize(intList));
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
break;

case 4:
try{
System.out.println("\nEnter the number of custom objects to add:");
int numObjects = scanner.nextInt();scanner.nextLine();
List<CustomObject> customList = new ArrayList<>();
for (int i = 0; i < numObjects; i++) {
 System.out.print("Enter name for object " + (i + 1) + ": ");
 String name = scanner.nextLine();
 System.out.print("Enter age for object " + (i + 1) + ": ");
 int age = scanner.nextInt();
 scanner.nextLine();
 customList=runner.customObjectAdd(customList,name,age);
}
System.out.println("CustomObject ArrayList contents: " + customList);
System.out.println("Size of ArrayList: " + utilTask.findSize(customList));
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
break;

case 5:
try{
List<Object> dynamicList = new ArrayList<>();
System.out.println("\nEnter the number of integer to add:");
int numInts = scanner.nextInt();scanner.nextLine();
dynamicList = arrayRunner.getObjString(dynamicList , numInts );
System.out.println("\nEnter the number of strings to add:");
int numStringsDynamic = scanner.nextInt();scanner.nextLine();
dynamicList = arrayRunner.getObjString(dynamicList , numStringsDynamic );
System.out.println("Enter the number of custom objects to add:");
int numCustomObjects = scanner.nextInt();scanner.nextLine();
for (int i = 0; i < numCustomObjects; i++) {
 System.out.print("Enter name for object " + (i + 1) + ": ");
 String name = scanner.nextLine();
 System.out.print("Enter age for object " + (i + 1) + ": ");
 int age = scanner.nextInt();scanner.nextLine();
 dynamicList = runner.customObjectAdd5(dynamicList, name, age);
}

System.out.println("ArrayList contents: " + dynamicList);
System.out.println("Size of ArrayList: " + utilTask.findSize(dynamicList));                        
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
break;

case 6:
try{
System.out.println("\nEnter the number of strings to add:");
int  numberStrings = scanner.nextInt();scanner.nextLine();
List<String> stringList = new ArrayList<>();
stringList  = arrayRunner.getString(stringList  , numberStrings );
System.out.print("\nEnter the string to find its index: ");
String searchString = scanner.nextLine();
int index = runner.findIndex(stringList, searchString);
if (index != -1) {
System.out.println("The index of " + searchString + " is: " + index);
} else {
System.out.println("The string " + searchString + " is not found in the ArrayList.");
}
System.out.println("ArrayList contents: " + stringList);
System.out.println("Size of ArrayList: " + utilTask.findSize(stringList)); 
}catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
break;

case 7:
try{
System.out.println("\nEnter the number of strings to add:");
int  numberOfStrings = scanner.nextInt();scanner.nextLine();
List<String> stringLists =  utilTask.createArrayList();
stringLists = arrayRunner.getString(stringLists, numberOfStrings );

System.out.println("Using Iterator to print");
Iterator<String> it = stringLists.iterator();
String result = runner.iterator(it);
System.out.println(result);
System.out.println("Using for loop to print");
String result1 = runner.printUsingForLoop(stringLists );
System.out.println(result1);
}catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
break;

case 8:
try{
System.out.println("Enter the number of strings to add:");
List<String> strList =  utilTask.createArrayList();
int numStrings = scanner.nextInt();scanner.nextLine(); 
strList = arrayRunner.getString(strList, numStrings );
System.out.print("\nEnter the index of the string to retrieve: ");
int index = scanner.nextInt();
if (index >= 0 || index < utilTask.findSize(strList)) {
String retrievedString = runner.getStringAtIndex(strList, index);
System.out.println("String at index " + index + ": " + retrievedString);
} else {
System.out.println("Invalid index. Index should be between 0 and " + (utilTask.findSize(strList) - 1));
}
System.out.println("Size of ArrayList: " + utilTask.findSize(strList));
}catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
break;

case 9:
try{
System.out.println("Enter the number of strings to add:");
int numStrings = scanner.nextInt();scanner.nextLine();
List<String> stringList =  utilTask.createArrayList();
stringList = arrayRunner.getString(stringList, numStrings );
System.out.print("\nEnter the string to find first and last positions: ");
String duplicateString = scanner.nextLine();
int firstIndex = runner.findFirstIndex(stringList, duplicateString);
int lastIndex = runner.findLastIndex(stringList, duplicateString);
if (firstIndex == -1) {
System.out.println("The string \"" + duplicateString + "\" is not found.");
} else {
System.out.println("First position: " + firstIndex);
System.out.println("Last position: " + lastIndex);
}
System.out.println("ArrayList contents: " + stringList);
}catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
break;

case 10:
try {
System.out.println("Enter the number of strings to add in arraylist:");
int numStrings = scanner.nextInt();scanner.nextLine();
List<String> stringList =  utilTask.createArrayList();
stringList = arrayRunner.getString(stringList, numStrings );
System.out.print("Enter the string you want to add: ");
String newString = scanner.nextLine();
System.out.print("Enter the index position where you want to insert the string: ");
int position = scanner.nextInt();scanner.nextLine();
stringList = runner.addStringAtPosition(stringList, newString, position);
System.out.println("Updated ArrayList: " + stringList);
System.out.println("Size of ArrayList: " + utilTask.findSize(stringList));
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
break;

case 11:
try{
System.out.println("Enter the number of strings to add to the first ArrayList:");
int numStrings = scanner.nextInt();scanner.nextLine();
List<String> firstArrayList =  utilTask.createArrayList();
firstArrayList = arrayRunner.getString(firstArrayList , numStrings );
System.out.println("First ArrayList: " + firstArrayList);
System.out.println("Enter the initial index position of strings to add in the second ArrayList:");
int initial = scanner.nextInt();scanner.nextLine();
System.out.println("Enter the end index position of strings to add in the second ArrayList:");
int end = scanner.nextInt();scanner.nextLine();
List<String> secondArrayList  = runner.createArrayList(firstArrayList , initial , end);
System.out.println("Original ArrayList: " + firstArrayList );
System.out.println("Substrings ArrayList: " + secondArrayList);
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
break;

case 12:
try{
System.out.println("Enter the number of strings to add to the first ArrayList:");
int numStrings = scanner.nextInt();scanner.nextLine();
List<String> firstArrayList =  utilTask.createArrayList();
firstArrayList = arrayRunner.getString(firstArrayList , numStrings );
System.out.println("Enter the number of strings to add to the second ArrayList:");
int numberStrings = scanner.nextInt();scanner.nextLine();
List<String> secondArrayList =  utilTask.createArrayList();
secondArrayList = arrayRunner.getString(secondArrayList , numberStrings );
System.out.println("First ArrayList: " + firstArrayList );
System.out.println("Second ArrayList: " + secondArrayList);
List<String> thirdArrayList = runner.mergeArrayLists(firstArrayList,secondArrayList );
System.out.println("Merged ArrayList: " + thirdArrayList);
System.out.println("Merged ArrayList size: " + utilTask.findSize(thirdArrayList));
}catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
break;

case 13:
try{
System.out.println("Enter the number of strings to add to the first ArrayList:");
int numStrings = scanner.nextInt();scanner.nextLine();
List<String> firstArrayList =  utilTask.createArrayList();
firstArrayList = arrayRunner.getString(firstArrayList , numStrings );
System.out.println("Enter the number of strings to add to the second ArrayList:");
int numberStrings = scanner.nextInt();scanner.nextLine();
List<String> secondArrayList =  utilTask.createArrayList();
secondArrayList = arrayRunner.getString(secondArrayList , numberStrings);
System.out.println("First ArrayList: " + firstArrayList );
System.out.println("Second ArrayList: " + secondArrayList);
List<String> thirdArrayList = runner.mergeArrayLists(secondArrayList,firstArrayList );
System.out.println("Third ArrayList (merged with second ArrayList first):" + thirdArrayList);
System.out.println("Size of Third ArrayList: " + utilTask.findSize(thirdArrayList));
}catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
break;

case 14:
try{
System.out.println("Enter the number  to add in the Decimal ArrayList:");
int numStrings = scanner.nextInt();scanner.nextLine();
List<Double> decimalList = new ArrayList<>();
for (int i = 0; i < numStrings; i++) {
System.out.print("Enter String " + (i + 1) + ": ");
double str = scanner.nextDouble();
decimalList = runner.addDecimal(decimalList, str);
}
System.out.println("Original Arraylist :" +decimalList);
System.out.println("Enter the index position to remove in the decimal arraylist"); 
int remove = scanner.nextInt();scanner.nextLine();
decimalList = runner.removeDecimalAtPosition(decimalList, remove);
System.out.println("Updated ArrayList after removing the element at position : " + decimalList);
System.out.println("Size of the ArrayList: " + utilTask.findSize(decimalList));
}catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
break;

case 15:
try{
System.out.println("Enter the number of strings to add to the first ArrayList:");
int numStrings = scanner.nextInt();scanner.nextLine();
List<String> firstArrayList =  utilTask.createArrayList();
firstArrayList = arrayRunner.getString(firstArrayList , numStrings );
System.out.println("Enter the number of strings to add to the second ArrayList:");
int numberStrings = scanner.nextInt();scanner.nextLine();
System.out.println("Enter the strings to remove which present in the above arraylist :");
List<String> secondArrayList =  utilTask.createArrayList();
secondArrayList = arrayRunner.getString(secondArrayList , numberStrings);
List<String> removedArrayList = runner.removeCommonElements(firstArrayList , secondArrayList );
System.out.println("Updated First ArrayList after removing elements from the second ArrayList: " + removedArrayList );
System.out.println("Size of the updated ArrayList: " + utilTask.findSize(removedArrayList));
}catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
break;

case 16:
try{
System.out.println("Enter the number of strings to add to the first ArrayList:");
int numStrings = scanner.nextInt();scanner.nextLine();
List<String> firstArrayList =  utilTask.createArrayList();
firstArrayList = arrayRunner.getString(firstArrayList , numStrings );
System.out.println("Enter the number of strings to add to the second ArrayList:");
int numberStrings = scanner.nextInt();scanner.nextLine();
System.out.println("Enter the strings to retain which present in the above arraylist :");
List<String> secondArrayList =  utilTask.createArrayList();
secondArrayList = arrayRunner.getString(secondArrayList ,numberStrings );
List<String> updatedArrayList = runner.retainCommonElements(firstArrayList, secondArrayList);
System.out.println("Updated First ArrayList after retaining elements from the second ArrayList: " + updatedArrayList);
System.out.println("Size of the updated ArrayList: " + utilTask.findSize(updatedArrayList));
}catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
break;

case 17:
try{
System.out.println("Enter the number of long values to add to the ArrayList: ");
int numStrings = scanner.nextInt();scanner.nextLine();
List<Long> longList = new ArrayList<>();
for (int i = 0; i < numStrings ; i++) {
System.out.print("Enter long value " + (i + 1) + ": ");
long value = scanner.nextLong();
longList = runner.addLong(longList, value);
}
System.out.println("ArrayList before removal: " + longList);
List<Long> updatedList = runner.removeAllLongValues(longList);
System.out.println("ArrayList after removing all elements: " + updatedList);
System.out.println("Size of the ArrayList after removal: " + utilTask.findSize(updatedList));
}catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
break;

case 18:
try{
System.out.println("Enter the number of strings to add in arraylist:");
int numStrings = scanner.nextInt();scanner.nextLine();
List<String> stringList =  utilTask.createArrayList();
stringList = arrayRunner.getString(stringList , numStrings );
System.out.print("Enter a String to check if it is present in the ArrayList: ");
String searchString = scanner.nextLine();
boolean isPresent = runner.checkStringPresence(stringList, searchString);
System.out.println("ArrayList: " + stringList);
System.out.println("Size of the ArrayList: " + utilTask.findSize(stringList));
System.out.println("The entered string =" + isPresent);
}catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
break;

case 0:
System.out.println("Exiting...");
break;
default:
System.out.println("Invalid choice. Please try again.");
}
}while(choice !=0);
} catch (Exception e) {
System.out.println("An error occurred in case: " + e.getMessage());
} finally {
scanner.close();
}
}

public List<String> getString(List<String> arrayList , int numbers){
ArrayListTask runner = new ArrayListTask();
for(int i=0 ; i <  numbers ; i++){ 
 System.out.print("Enter String"+ (i+1) +"= " );
 String string = scanner.nextLine();
 arrayList = runner.addString(arrayList,string);
}
return arrayList;
}

public List<Object> getObjString(List<Object> arrayList , int numbers){
ArrayListTask runner = new ArrayListTask();
for(int i=0 ; i <  numbers ; i++){ 
 System.out.print("Enter String"+ (i+1) +"= " );
 String string = scanner.nextLine();
 arrayList = runner.addIntStrCus(arrayList,string);
}
return arrayList;
}

}
