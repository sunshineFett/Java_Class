
public class TextBook {

  public TextBook() {}

  public TextBook( String author, String title, String isbn, float price ) {
    mAuthor = author;
    mTitle = title;
    mISBN = isbn;
    mPrice = price;
    mBookCount++;
  }

  // Getters
  public String getAuthor() { return mAuthor; }
  public String getTitle() { return mTitle; }
  public String getISBN() { return mISBN; }
  public float getPrice() { return mPrice; }

  // Setters
  public void setAuthor( String author ) {
    mAuthor = author;
  }
  public void setTitle( String title ) {
    mTitle = title;
  }
  public void setISBN( String isbn ) {
    mISBN = isbn;
  }
  public void setPrice( float price ) {
    mPrice = price;
  }

  // Class method
  public static int getTextBookCount() { return mBookCount; }

  public static void main( String[] args ) {
    System.out.println("Number of books is " + TextBook.getTextBookCount() );

    TextBook b = new TextBook( "Cay S. Horstmann and Gary Cornell",
      "Core Java 2 Volume I-Fundamentals",
      "0-13-081933-6",
      42.99f );
    System.out.println("Author is " + b.getAuthor() );
    System.out.println("Title is " + b.getTitle() );
    System.out.println("ISBN is " + b.getISBN() );
    System.out.println("Price is " + b.getPrice() );

    // Change the price
    b.setPrice( b.getPrice() * 1.10f );
    java.text.NumberFormat nf = java.text.NumberFormat.getCurrencyInstance();
    System.out.println("The higher price is " + nf.format( b.getPrice() ) );

    System.out.println("Number of books is " + TextBook.getTextBookCount() );

    b = new TextBook( "Author", "Title", "ISBN", 0.0f );

    System.out.println("Number of books is " + TextBook.getTextBookCount() );

    // Example of Vector
    java.util.Vector v = new java.util.Vector();
    v.addElement( new TextBook( "AuthorName1Here", null, null, 0.0f ) );
    v.addElement( new TextBook( "AuthorName2Here", null, null, 0.0f ) );
    v.addElement( new TextBook( "AuthorName3Here", null, null, 0.0f ) );
    v.addElement( new TextBook( "AuthorName4Here", null, null, 0.0f ) );
    v.addElement( new TextBook( "AuthorName5Here", null, null, 0.0f ) );
    v.addElement( new TextBook( "AuthorName6Here", null, null, 0.0f ) );

    java.util.Enumeration e = v.elements();
    while( e.hasMoreElements() ) {
      TextBook bv = (TextBook)e.nextElement();
      System.out.println( "Author is " + bv.getAuthor() );
    }
    System.out.println("Number of elements in v is " + v.size() );
  }

  private static int mBookCount;
  private String mAuthor;
  private String mTitle;
  private String mISBN;
  private float mPrice;
}