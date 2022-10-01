package Overriding;

public class Main {
    public static void main(String[] args){
        // overriding -> final keyword not overrideable
        BaseCreditManager[] creditManager = new BaseCreditManager[]
                {new TeacherCreditManager(),new EndustryCreditManager(),new StudentCreditManager()};

        for (BaseCreditManager credit:creditManager){
            System.out.println(credit.calculate(100));
        }

    }
}
