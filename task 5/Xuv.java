package inheritance;
public class Xuv extends Car{

private int seats;
private int airbags;
private String model;
private String color;

public Xuv(){
super("Inside xuv constructor ");
}
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
