package javatraining.example.multithreads.chat;

/**
 * <p>Title: USF Java Class Assignment</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: University of South Florida</p>
 * @author Natalie S. Wear
 * @version 1.0
 */
import java.io.IOException;

public class ChatIOException extends IOException {

  public ChatIOException() {
    super();
  }

  public ChatIOException(String msg) {
     super(msg);
  }
}
