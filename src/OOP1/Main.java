package OOP1;

public class Main {
    public static void main(String[] args){
        // live
        String message = "Test Message";
        // set value

        Product product1 = new Product();
        product1.setName("Delonghi Coffee Machine");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("test.jpg");
        Product product2 = new Product();
        product2.setName("Delonghi Coffee Machine");
        product2.setUnitPrice(7500);
        product2.setDiscount(7);
        product2.setUnitsInStock(3);
        product2.setImageUrl("test.jpg");

        // array
        String[] krediler = {"Kredi1","Kredi2"};
        for (String test:krediler){
            System.out.println(test);
        }

        Product[] products = {product1,product2};


        for (Product product:products){
            // get value
            System.out.println(product.getName());
        }

        // inheritance example
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("0543");
        individualCustomer.setCustomerNumber("123");
        individualCustomer.setFirstName("Name");
        individualCustomer.setLastName("Surname");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("kodlama.io");
        corporateCustomer.setPhone("0555555555");
        corporateCustomer.setTaxNumber("11111111");
        corporateCustomer.setCustomerNumber("5123");

        Customer[] customers = {individualCustomer,corporateCustomer};
    }
}
