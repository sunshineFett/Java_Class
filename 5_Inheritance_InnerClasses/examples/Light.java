
abstract class Light {


  // Default constructor
  public Light() {
  }

  // Abstract instance method
  abstract public double KWHprice();


  // Instance methods
  public static void switchOn() { indicator = true; }
  public void switchOff() { indicator = false; }
  public boolean isOn() { return indicator; }

  // Instance variables
  int noOfWatts;
  static boolean indicator;
  String location;
}

class TubeLight extends Light {

    // Implementation of inherited abstract method
    public double KWHprice() { return 2.75; }

    // if switchOff is made private, the subclass cannot access it
    public static void main(String[] args) {
        TubeLight tl = new TubeLight();
        tl.switchOff();

        // instantiate the Factory class to see how
        // to use an abstract class object reference
        new Factory();
    }

    // "super" and "this" are very similar
    // neither can be accessed within a static method or static block
    public void myTestingMethod() {
        super.switchOff();
        // can access any static member
        this.switchOn();
        // can access any instance member
        this.color = 8;
    }
    // Instance variables
    int tubeLength;
    int color;
}

class Factory {

    public Factory() {
        seeClass();
    }

    public void seeClass() {
        // At runtime both classes are of TubeLight
        System.out.println(cellarLight.getClass().getName());
        System.out.println(spotLight.getClass().getName());

        // invoke the implementation of KWHprice via TubeLight class
        System.out.println(spotLight.KWHprice());
    }

    TubeLight cellarLight = new TubeLight();
    Light spotLight = new TubeLight();

}