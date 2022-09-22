package Classes;

public class Main {
    public static void main(String[] args){
        // Classes
        // referenceType ->stack ->heap -> garbageCollector
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager2 = customerManager;
        customerManager.addCustomer();
        customerManager.updateCustomer();
        customerManager.deleteCustomer();
    }
}