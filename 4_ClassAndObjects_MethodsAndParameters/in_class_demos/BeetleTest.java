 class Insect {
    public Insect() {
      System.out.println("Inside Insect() Constructor");
      // this method call falls to the subclass, NOT the parent class!!
      printDetails();
    }
    public void printDetails() {
      System.out.println("Just an insect");
    }
  }

  class Beetle extends Insect {
    private final int legs;

    // Overloaded constructor
    public Beetle(int legs) {
      System.out.println("Inside Beetle() Constructor");
      this.legs = legs;
    }

    public void printDetails() {
      System.out.println("The beetle has " + legs + " legs");
      if (legs < 6) {
        System.out.println("Ouch");
      }
    }
  }

  public class BeetleTest {
    public static void main(String[] args) {
      Beetle sad_bug = new Beetle(5); // lost one leg in an
                                      // argument with his wife
      //Beetle happy_bug = new Beetle(6); // the wife bug ;-)
    }
  }

