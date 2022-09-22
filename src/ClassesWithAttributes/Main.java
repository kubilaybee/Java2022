package ClassesWithAttributes;

public class Main {
    public static void main(String[] args){
        Product product = new Product();
        product.id = 1;
        product.name = "Product";
        product.description = "Product Description";
        product.price = 15.59;
        product.stockAmount = 2;

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}
