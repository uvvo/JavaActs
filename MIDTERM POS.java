import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
  
  private String pname;
  private int qty;
  private double price;
 

  // constructor
  Product(String pname, int qty, 
              double price, double totalPrice) {
    this.pname = pname;
    this.qty = qty;
    this.price = price;

  }

  // getter methods
  public String getPname() {
    return pname;
  }
  public int getQty() {
    return qty;
  }
  public double getPrice() {
    return price;
  }

  // displayFormat
  public static void displayFormat() {
    System.out.print(
        "\nName      Quantity    Price   Total Price\n");
  }


}
public class ShoppingBill {
  public static void main(String[] args) {
    
    // variables
    String productName = null;
    int quantity = 0;
    double price = 0.0;
    double totalPrice = 0.0;
    double overAllPrice = 0.0;
    char choice = '\0';

    // create Scanner class object
    Scanner scan = new Scanner(System.in);

    List<Product> product = new ArrayList<Product>();

    do {
      // read input values
      System.out.println("Enter product details,");
      System.out.print("Name: ");
      productName = scan.nextLine();
      System.out.print("Quantity: ");
      quantity = scan.nextInt();
      System.out.print("Price (per item): ");
      price = scan.nextDouble();

      // calculate total price for that product
      totalPrice = price * quantity;
     
      product.add( new Product(
          productName, quantity, price, totalPrice) );

      // ask for continue?
      System.out.print("Want to add more item? (y or n): ");
      choice = scan.next().charAt(0);

      // read remaining characters
      scan.nextLine();
    } while (choice == 'y' || choice == 'Y');
    Product.displayFormat();
    for (Product p : product) {
    
    }

    System.out.println("\nTotal Price = " + overAllPrice);

    
    scan.close();
  }

}