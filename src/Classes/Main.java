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

        // valueType
        int number1 = 10;
        int number2 = 20;
        number2=number1;
        number1 = 30;
        System.out.println(number2);

        // referenceType
        int[] numbers1 = new int[]{1,2,3};
        int[] numbers2 = new int[]{4,8,9};
        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println(numbers2[0]);
    }
}