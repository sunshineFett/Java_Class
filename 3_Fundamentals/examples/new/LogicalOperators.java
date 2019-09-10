package developersconnection.practice;

/*
 * LogicalOperators.java
 *
 * Created on September 7, 2002, 11:44 AM
 */

/**
 *
 * @author  Natalie S. Wear
 */
public class LogicalOperators {
    
    /** Creates a new instance of LogicalOperators */
    public LogicalOperators() {
    }
    
    public static void main(String[] args) {
        int x = 2, y = 4, j = 10;
        if((x == 1) || (y == 8) || (j == 10))
            System.out.println("We have a match");
        
        int k = 0;
        int l = ++k;
        // The short-circuit doesn't evaluate the second condition
        if((l == 1) || (k++ == 2))
            System.out.println("l is " + l + " and k is " + k);
        // The long-circuit does, change in value of k
        if((l == 1) | (k++ == 2))
            System.out.println("l is " + l + " and k is " + k);
    }
    
}

