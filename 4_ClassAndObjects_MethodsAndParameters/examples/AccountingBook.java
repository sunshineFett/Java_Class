

public class AccountingBook extends TextBook {

  public AccountingBook(  String author, String title, String isbn, float price ) {
    super( author, title, isbn, price );
  }

  // Example of using super to call a superclass's methods
  public String getAuthor() {
    return "\"" + super.getAuthor() + "\"";
  }

  public static void main( String[] args ) {
    AccountingBook ab = new AccountingBook( "A", "T", "I", 0.0f );
    System.out.println(ab.getAuthor());
  }
}