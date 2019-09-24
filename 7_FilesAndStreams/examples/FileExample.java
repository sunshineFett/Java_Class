
import java.io.*;

public class FileExample {


  /**
   * main
   * @param:  String[] args
   * @returns: void
   */
   public static void main(String[] args) {

        // Use the FileOutputStream
        OutputStreamWriter out = null;

        try {
          // byte stream
          out = new OutputStreamWriter( new FileOutputStream("c:/temp/FileExample.dat"));
          out.write("I'm writing out to a file called FileExample.dat!!!");
          out.flush();
          out.close();
        } catch(IOException ioe) {
          System.out.println(ioe.getMessage());
        } finally {
           try {
              out.close();
           } catch (IOException ioe) {
              ioe.printStackTrace();
           }
        }

        // Using the FileWriter
        FileWriter fileout = null;

        try {
          // character stream
          fileout = new FileWriter("c:/temp/FileExample2.dat");
          fileout.write("This is another string that we are writing out to FileExample2.dat!!");
          fileout.close();
        } catch(IOException ioe) {
          System.out.println(ioe.getMessage());
        } finally {
          try {
              fileout.close();
          } catch (IOException ioe) {
              ioe.printStackTrace();
          }
        }

        // Using the BufferedReader
        BufferedReader br = null;
        String mString = null;

        System.out.println("\nPlease enter your name: \r\n");

        try {
              br = new BufferedReader( new InputStreamReader(System.in));
              mString = br.readLine();
        } catch (IOException ioe) {
              System.out.println(ioe.getMessage());
        } finally {
              try {
                br.close();
              } catch (IOException ioe) {
                ioe.printStackTrace();
              }
        }
        // Using the BufferedWriter
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter( new OutputStreamWriter(System.out));
            bw.write("You typed this at the prompt:  " + mString);
            bw.flush();
        } catch (IOException ioe) {
              System.out.println(ioe.getMessage());
        } finally {
              try {
                bw.close();
              } catch (IOException ioe) {
                ioe.printStackTrace();
              }
        }
   } // end method main

} // end class FileExample