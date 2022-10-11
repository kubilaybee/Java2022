package oopWithNLayerApp.business;

import oopWithNLayerApp.core.logging.Logger;
import oopWithNLayerApp.dataAccess.ProductDao;
import oopWithNLayerApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[]  loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception{
        if (product.getUnitPrice()<10){
            throw new Exception("Ürün Fiyatı 10dan Küçük Olamaz");
        }
        productDao.add(product);

        for (Logger logger: loggers) {
            logger.log(product.getName());
        }
    }
}
