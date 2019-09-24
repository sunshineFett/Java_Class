// Example of how to read in the contents of a file
// and display it to the console.
// arg[0] is the name of the file to be read
import java.io.*;

public class TextFileReader {

  public void readFile( String filename ) {

    try {
      BufferedReader br = new BufferedReader(
        new InputStreamReader(
        new FileInputStream( filename ) ) );
      String line = null;
      do {
        line = br.readLine();
        if ( line != null ) {
          System.out.println( line );
        }
      } while( line != null );
      br.close();
    } catch( FileNotFoundException fnfex ) {
      System.out.println("FileNotFoundException: " + fnfex );
      fnfex.printStackTrace();
    } catch( IOException ioex ) {
      System.out.println("IOException: " + ioex );
      ioex.printStackTrace();
    }
  }

  public static void main( String[] args ) {
    TextFileReader tfr = new TextFileReader();
    tfr.readFile( args[0] );
    for ( int i=0; i< args.length; i++ ) {
      System.out.println( args[i] );
    }
  }
}