package oopWithNLayerApp;

import oopWithNLayerApp.business.ProductManager;
import oopWithNLayerApp.core.logging.DatabaseLogger;
import oopWithNLayerApp.core.logging.FileLogger;
import oopWithNLayerApp.core.logging.Logger;
import oopWithNLayerApp.core.logging.MailLogger;
import oopWithNLayerApp.dataAccess.HibernateProductDao;
import oopWithNLayerApp.dataAccess.JdbcProductDao;
import oopWithNLayerApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        // java 3
        Product product1 = new Product(1,"IPhone XR",11);
        Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);
    }
}
