package javatraining.example.multithreads.chat;

/**
 * <p>Title: USF Java Class Assignment</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: University of South Florida</p>
 * @author Natalie S. Wear
 * @version 1.0
 */
import java.io.*;

public class ServerApp {

  public ServerApp(String title) throws ChatIOException {
    try{


      bw = new BufferedWriter(new FileWriter("c:\\temp\\myOutput.dat"));
      br = new BufferedReader(new FileReader("c:\\temp\\myOutput.dat"));
      bw.write("Server writes this to a file");
      bw.newLine();
      bw.flush();

    }catch(IOException ioe){
      throw new ChatIOException("throwing an IOException in the chat program" + ioe);
    }
}

  public static void main(String[] args) {
    ServerApp server = null;

    try {
      server = new ServerApp("Server");
      server.isListening = true;
    } catch (ChatIOException cioe) {
      cioe.printStackTrace();
    }

    while(server.isListening) {
        System.out.println("Inside the while loop as long as isListening is true!");
        server.isListening = false;
        try {
           System.out.println(server.br.readLine());
        } catch (IOException ioe) {
           ioe.printStackTrace();
        }
    } // end while loop
  }

  private BufferedReader br;
  private BufferedWriter bw;
  private boolean isListening;
}