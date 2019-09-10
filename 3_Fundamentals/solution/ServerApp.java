

/**
 * <p>Title: USF Java Class Assignment</p>
 * <p>Description: Fundamentals Lecture</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: University of South Florida</p>
 * @author Natalie S. Wear
 * @version 1.0
 */

public class ServerApp {

  public ServerApp() {
  }
  public static void main(String[] args) {
    ServerApp server = new ServerApp();
    server.isListening = true;

    while(server.isListening) {
      System.out.println("Inside the while loop as long as isListening is true!");
      server.isListening = false;
    }
  }

  private boolean isListening;
}