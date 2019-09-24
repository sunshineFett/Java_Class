import java.io.*;

public class PizzaReader {

  public PizzaReader( String filename ) {
    mFilename = filename;
  }

  public Pizza read() throws PizzaIOException {
    ObjectInputStream ois = null;
    try {
      ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream( mFilename ) ) );
      Pizza p = (Pizza)ois.readObject();
      return p;
    } catch ( Throwable t ) {
        throw new PizzaIOException( t.getMessage() );
    } finally {
      try {
        ois.close();
      } catch ( IOException ex ) {}
    }
  }

  public static void main( String[] args ) {
    PizzaReader pizzaReader = new PizzaReader( "c:/temp/PizzaOut.dat" );
    try {
      Pizza p = pizzaReader.read();
      System.out.println( "Pizza info: " + p);
    } catch (PizzaIOException pioex) {
      System.out.println("PizzaIOException " + pioex );
    }
  }
  private String mFilename;
}