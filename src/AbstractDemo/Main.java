package AbstractDemo;

public class Main {
    public static void main(String[] args){
        // abstract demo
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();
    }
}
