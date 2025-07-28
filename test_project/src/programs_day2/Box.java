package programs_day2;

import java.util.Scanner;

//Box class definition
class BoxText {
 private double width;
 private double height;
 private double depth;

 // Parameterized constructor
 public BoxText(double width, double height, double depth) {
     this.width = width;
     this.height = height;
     this.depth = depth;
 }

 // Method to calculate and return volume
 public double calculateVolume() {
     return width * height * depth;
 }
}

public class Box {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // User input for box dimensions
     System.out.print("Enter the width of the box: ");
     double width = scanner.nextDouble();

     System.out.print("Enter the height of the box: ");
     double height = scanner.nextDouble();

     System.out.print("Enter the depth of the box: ");
     double depth = scanner.nextDouble();

     // Create a Box object using the parameterized constructor
     BoxText myBox = new BoxText(width, height, depth);

     // Calculate and display the volume
     double volume = myBox.calculateVolume();
     System.out.println("The volume of the box is: " + volume);

     scanner.close();
 }
}
