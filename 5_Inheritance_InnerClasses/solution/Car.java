
/**
 * Title:        USF Class Examples
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      University of South Florida
 * @author Natalie S. Wear
 * @version 1.0
 */

import java.util.*;
import java.text.*;

public class Car implements CarMaintenanceIF, java.io.Serializable {

  public Car() {}

  public void changeOil() {
    displayMaintenanceEvent( "Change Oil" );
  }
  public void tuneup() {
    displayMaintenanceEvent( "Tuneup" );
  }
  public void rotateTires() {
    displayMaintenanceEvent( "Rotate Tires" );
  }

  protected void displayMaintenanceEvent( String s ) {
    System.out.println( s );
  }

}