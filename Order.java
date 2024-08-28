import java.util.ArrayList;
import java.util.List;

//-----ORDER-----
    public class Order {
    public int orderNumber;
    public String customerName;
    public List<String> items;
    // Konstruktor
    public Order(int orderNumber, String customerName) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }
    // Getter i Setter dla numeru zamówienia
    public int getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    // Getter i Setter dla imienia klienta
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    // Getter i Setter dla listy przedmiotów
    public List<String> getItems() {
        return items;
    }
    public void setItems(List<String> items) {
        this.items = items;
    }
    // Metoda do dodawania przedmiotu do zamówienia
    public void addItem(String item) {
        this.items.add(item);
    }
   
    // Metoda do wyświetlania informacji o zamówieniu
    public void displayOrder() {
        System.out.println("Order Number: " + orderNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Items: ");
        for (String item : items) {
            System.out.println(" - " + item);
        }
    }
}