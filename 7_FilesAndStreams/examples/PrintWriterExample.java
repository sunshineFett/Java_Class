import java.io.*;

public class PrintWriterExample {

  public static void main(String[] args) {
    PrintWriterExample pwe = new PrintWriterExample();
    try {
         pwe.writer = new PrintWriter(new FileWriter("c:\\temp\\order1.dat"),true);
         pwe.writer.write("Hi, this is a test chaining a PrintWriter to a FileWriter");
         pwe.writer.close();

         pwe.fileWriter = new FileWriter("c:\\temp\\order1.dat", true);
         pwe.fileWriter.write("\nHere is another test appending to the first");
         pwe.fileWriter.flush();
    } catch (IOException ioe) {
         ioe.printStackTrace();
    } finally {
         //pwe.writer.close();
      try {
         pwe.fileWriter.close();
      } catch ( IOException ioe ) {
         ioe.printStackTrace();
      }
    }
  }

  private PrintWriter writer;
  private FileWriter fileWriter;
}