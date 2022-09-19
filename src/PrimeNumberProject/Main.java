package PrimeNumberProject;

public class Main {
    public static void main(String[] args){
        // prime number project
        int number = 9;
        boolean isPrime = true;
        for (int i = 3;i<number;i++){
            if (number%i==0){
                isPrime=false;
            }
        }
        if (isPrime){
            System.out.println("The number is PRIME");
        } else {
            System.out.println("The number is not prime");
        }

    }
}
