
public class Pizza implements java.io.Serializable  {

    public Pizza() {}

    public double calcPrice(int qty, double price) {
        return qty * price;
    }

    public String toString() {
        return("this is my Pizza class");
    }

}