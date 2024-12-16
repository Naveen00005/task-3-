package inheritance;

public class Scross extends Car{

public void maintenance() {
System.out.println("Maruti SCross under maintenance");
}
private int seats;
private int airbags;
private String model;
private String color;

public int getSeats() {
return seats;
}
public void setSeats(int s) {
 seats = s;
}

public int getAirbags() {
return airbags;
}
public void setAirbags(int air) {
airbags = air;
}

public String getModel() {
return model;
}
public void setModel(String models) {
model = models;
}

public String getColor() {
return color;
}
public void setColor(String colors) {
 color = colors;
}


}
