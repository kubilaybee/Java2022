package Overriding;

public class StudentCreditManager extends BaseCreditManager{
    @Override
    public double calculate(double price) {
        return price *1.10;
    }
}
