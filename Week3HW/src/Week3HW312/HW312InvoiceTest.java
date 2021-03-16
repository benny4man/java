
package Week3HW312;


public class HW312InvoiceTest {
    public static void main(String[] args) {
        HW312Invoice invoice1 = new HW312Invoice("102231", "CPU", 4, 102.99);
        
    System.out.printf("Part number is: %s%n", invoice1.getPartNum());
    System.out.printf("Part description is: %s%n", invoice1.getPartDesc());
    System.out.printf("Quantity ordered is: %d%n", invoice1.getQuant());
    System.out.printf("Price Per Item is: $%.2f%n", invoice1.getPricePerItem());
    System.out.printf("%nTotal Cost is: $%.2f%n", invoice1.getInvoiceAmount());
    }
}
