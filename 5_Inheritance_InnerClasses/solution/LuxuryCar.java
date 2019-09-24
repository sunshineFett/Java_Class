
/**
 * Title:        USF Class Examples
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      University of South Florida
 * @author Natalie S. Wear
 * @version 1.0
 */

import java.awt.*;

public class LuxuryCar extends Car{

  public LuxuryCar() {}

  private LuxuryCar(String size, Color color, int year, String make) {
      this.size = size;
      this.color = color;
      this.year = year;
      this.make = make;
  }

  public void descCar() {

      class CarDescription {
        String size = "Large-sized sedan";
      };
    CarDescription cd = new CarDescription();
    System.out.println("My car is " + cd.size + " " + color + " " + year +" "+ make);
  }

  public static void main(String[] args) {
    LuxuryCar lc = new LuxuryCar("medium-sized sedan", Color.darkGray, 2002, "Lexus");
    lc.descCar();
    lc.changeOil();
    lc.rotateTires();
    lc.tuneup();
  }

  private String size;
  private Color color;
  private int year;
  private String make;
}