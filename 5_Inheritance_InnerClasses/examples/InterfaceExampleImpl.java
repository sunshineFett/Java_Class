

interface InterfaceExample extends ShapeIF {

  // Possible to declare constants
  double PI = 3.14;

  // method signatures
  public void calculateRadius(int shape);
}

interface ShapeIF {

  // method signatures
  public void shape();

}

// The implementation class is required to implement all
// methods from all interfaces (i.e., ShapeIF and InterfaceExample)
public class InterfaceExampleImpl implements InterfaceExample {

    public void calculateRadius(int shape) {
        // do something here
    }

    public  void shape() {
        // do something here
    }
}