package StaticDemo;

public class ProductManager {
    public void add(Product product){
        if (ProductValidator.isValid(product)){
            System.out.println("Added !");
        } else {
            System.out.println("ERROR");
        }
        ProductValidator validator = new ProductValidator();
        validator.bisey();
    }
}
