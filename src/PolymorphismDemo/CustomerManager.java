package PolymorphismDemo;

public class CustomerManager {
    // field / attiribute
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }

    public void add(){
        System.out.println("Customer Added !");
        this.logger.log("log message");
    }
}
