package MethodOverloading;

public class Main {
    public static void main(String[] args){
        // method overloading
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(2,5));
        // overloading
        System.out.println(calculator.sum(2,5,3));
    }
}
