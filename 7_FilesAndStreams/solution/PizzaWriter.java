import java.io.*;

public class PizzaWriter {

  public PizzaWriter() {}

  public PizzaWriter( String filename ) {
    mFilename = filename;
  }

  public void write( Pizza p ) throws PizzaIOException {
    ObjectOutputStream oos = null;
    try {
      oos = new ObjectOutputStream( new BufferedOutputStream (new FileOutputStream( mFilename ) ) );
      oos.writeObject( p );
    } catch ( Throwable t ) {
        throw new PizzaIOException( t.getMessage() );
        //System.out.println("an error occurred");
    } finally {
      try {
        oos.close();
      } catch ( IOException ex ) {}
    }
  }

  public static void main( String[] args ) {
    Pizza myPizza = new Pizza();
    PizzaWriter pizzaWriter = new PizzaWriter( "c:/temp/PizzaOut.dat" );
    try {
      pizzaWriter.write( myPizza );
    } catch (PizzaIOException pioex) {
      System.out.println("PizzaIOException " + pioex );
    }
  }
  private String mFilename;
}